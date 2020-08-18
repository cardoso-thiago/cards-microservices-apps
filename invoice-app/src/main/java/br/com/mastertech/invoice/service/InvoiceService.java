package br.com.mastertech.invoice.service;

import br.com.mastertech.invoice.client.Card;
import br.com.mastertech.invoice.client.ZuulClient;
import br.com.mastertech.invoice.client.Payment;
import br.com.mastertech.invoice.entity.Invoice;
import br.com.mastertech.invoice.entity.builder.InvoiceBuilder;
import br.com.mastertech.invoice.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class InvoiceService {

    private final ZuulClient zuulClient;
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(ZuulClient zuulClient, InvoiceRepository invoiceRepository) {
        this.zuulClient = zuulClient;
        this.invoiceRepository = invoiceRepository;
    }

    public List<Payment> getInvoice(Long customerId, Long cardId) {
        Card card = getCard(customerId, cardId);
        return zuulClient.getPayments(card.getId());
    }

    public Invoice payInvoice(Long customerId, Long cardId) {
        Card card = getCard(customerId, cardId);
        List<Payment> payments = zuulClient.getPayments(card.getId());
        double sumInvoice = payments.stream().mapToDouble(Payment::getValue).sum();
        Invoice invoice = InvoiceBuilder.anInvoice().cardId(cardId).payedValue(sumInvoice).payedIn(new Date()).build();
        zuulClient.deleteAllByCardId(cardId);
        return invoiceRepository.save(invoice);
    }

    public void expireCard(Long customerId, Long cardId) {
        zuulClient.expireCard(customerId, cardId);
    }

    private Card getCard(Long customerId, Long cardId) {
        return zuulClient.getCardByIdAndCustomerId(cardId, customerId);
    }
}
