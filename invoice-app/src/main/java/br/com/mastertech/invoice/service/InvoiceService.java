package br.com.mastertech.invoice.service;

import br.com.mastertech.invoice.client.Card;
import br.com.mastertech.invoice.client.CardClient;
import br.com.mastertech.invoice.client.Payment;
import br.com.mastertech.invoice.client.PaymentClient;
import br.com.mastertech.invoice.entity.Invoice;
import br.com.mastertech.invoice.entity.builder.InvoiceBuilder;
import br.com.mastertech.invoice.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class InvoiceService {

    private final CardClient cardClient;
    private final PaymentClient paymentClient;
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(CardClient cardClient, PaymentClient paymentClient, InvoiceRepository invoiceRepository) {
        this.cardClient = cardClient;
        this.paymentClient = paymentClient;
        this.invoiceRepository = invoiceRepository;
    }

    public List<Payment> getInvoice(Long customerId, Long cardId) {
        Card card = getCard(customerId, cardId);
        return paymentClient.getPayments(card.getId());
    }

    public Invoice payInvoice(Long customerId, Long cardId) {
        Card card = getCard(customerId, cardId);
        List<Payment> payments = paymentClient.getPayments(card.getId());
        double sumInvoice = payments.stream().mapToDouble(Payment::getValue).sum();
        Invoice invoice = InvoiceBuilder.anInvoice().cardId(cardId).payedValue(sumInvoice).payedIn(new Date()).build();
        paymentClient.deleteAllByCardId(cardId);
        return invoiceRepository.save(invoice);
    }

    public void expireCard(Long customerId, Long cardId) {
        cardClient.expireCard(customerId, cardId);
    }

    private Card getCard(Long customerId, Long cardId) {
        return cardClient.getCardByIdAndCustomerId(cardId, customerId);
    }
}
