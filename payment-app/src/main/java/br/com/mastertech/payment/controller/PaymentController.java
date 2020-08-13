package br.com.mastertech.payment.controller;

import br.com.mastertech.payment.dto.PaymentRequest;
import br.com.mastertech.payment.entity.Payment;
import br.com.mastertech.payment.exception.DeactivatedCardException;
import br.com.mastertech.payment.exception.ExpiredCardException;
import br.com.mastertech.payment.mapper.DataMapper;
import br.com.mastertech.payment.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.List;

@RestController
@Validated
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pagamento")
    public ResponseEntity savePayment(@RequestBody @Valid PaymentRequest paymentRequest) throws DeactivatedCardException, ExpiredCardException {
        Payment payment = DataMapper.INSTANCE.paymentRequestToPayment(paymentRequest);
        Payment savedPayment = paymentService.save(paymentRequest.getCardId(), payment);
        return ResponseEntity.created(URI.create("")).body(DataMapper.INSTANCE.paymentToPaymentRequest(savedPayment));
    }

    @GetMapping("/pagamentos/{id_cartao}")
    public ResponseEntity getPayments(
            @Valid
            @NotNull(message = "O id do cartão não pode ser nulo.")
            @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
            @PathVariable("id_cartao") Long cardId) {
        List<Payment> paymentsByCard = paymentService.getPaymentsByCardId(cardId);
        return paymentsByCard.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(paymentsByCard);
    }

    @DeleteMapping("/pagamentos/{id_cartao}")
    public ResponseEntity deleteAllByCardId(
            @Valid
            @NotNull(message = "O id do cartão não pode ser nulo.")
            @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
            @PathVariable("id_cartao") Long cardId) {
        paymentService.deleteAllByCardId(cardId);
        return ResponseEntity.ok().build();
    }
}
