package br.com.mastertech.invoice.controller;

import br.com.mastertech.invoice.client.Payment;
import br.com.mastertech.invoice.dto.CardExpirationRequest;
import br.com.mastertech.invoice.mapper.DataMapper;
import br.com.mastertech.invoice.service.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@Validated
@RequestMapping("/fatura")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/{cliente-id}/{cartao-id}")
    public ResponseEntity getInvoice(@Valid
                                     @NotNull(message = "O id do cliente não pode ser nulo.")
                                     @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
                                     @PathVariable("cliente-id") Long customerId,
                                     @Valid
                                     @NotNull(message = "O id do cartão não pode ser nulo.")
                                     @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
                                     @PathVariable("cartao-id") Long cardId) {
        List<Payment> payments = invoiceService.getInvoice(customerId, cardId);
        return payments == null || payments.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(payments);
    }

    @PostMapping("/{cliente-id}/{cartao-id}/pagar")
    public ResponseEntity payInvoice(@Valid
                                     @NotNull(message = "O id do cliente não pode ser nulo.")
                                     @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
                                     @PathVariable("cliente-id") Long customerId,
                                     @Valid
                                     @NotNull(message = "O id do cartão não pode ser nulo.")
                                     @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
                                     @PathVariable("cartao-id") Long cardId) {
        return ResponseEntity.ok(DataMapper.INSTANCE.invoiceToInvoiceRequest(invoiceService.payInvoice(customerId, cardId)));
    }

    @PostMapping("/{cliente-id}/{cartao-id}/expirar")
    public ResponseEntity expireCard(@Valid
                                     @NotNull(message = "O id do cliente não pode ser nulo.")
                                     @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
                                     @PathVariable("cliente-id") Long customerId,
                                     @Valid
                                     @NotNull(message = "O id do cartão não pode ser nulo.")
                                     @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
                                     @PathVariable("cartao-id") Long cardId) {
        invoiceService.expireCard(customerId, cardId);
        return ResponseEntity.ok(new CardExpirationRequest("ok"));
    }
}
