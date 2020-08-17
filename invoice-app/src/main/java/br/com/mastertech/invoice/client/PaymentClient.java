package br.com.mastertech.invoice.client;

import br.com.mastertech.invoice.config.ResilienceConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@FeignClient(name = "PAYMENT", configuration = ResilienceConfiguration.class)
public interface PaymentClient {

    @DeleteMapping("/pagamentos/{id_cartao}")
    void deleteAllByCardId(
            @Valid
            @NotNull(message = "O id do cartão não pode ser nulo.")
            @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
            @PathVariable("id_cartao") Long cardId);

    @GetMapping("/pagamentos/{id_cartao}")
    List<Payment> getPayments(
            @Valid
            @NotNull(message = "O id do cartão não pode ser nulo.")
            @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
            @PathVariable("id_cartao") Long cardId);
}
