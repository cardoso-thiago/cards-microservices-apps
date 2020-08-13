package br.com.mastertech.invoice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@FeignClient(name = "CARD")
public interface CardClient {
    @GetMapping("/cartao/id/{id}")
    Card getCardById(
            @Valid
            @NotNull(message = "O numero do cartão deve ser informado.")
            @NotEmpty(message = "O numero do cartão deve ser informado.")
            @PathVariable("id") Long cardId);

    @GetMapping("/cartao/id/{id}/customer/{customer-id}")
    Card getCardByIdAndCustomerId(
            @Valid
            @NotNull(message = "O id do cartão não pode ser nulo.")
            @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
            @PathVariable("id") Long cardId,
            @Valid
            @NotNull(message = "O id do cliente não pode ser nulo.")
            @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
            @PathVariable("customer-id") Long customerId);

    @PostMapping("/cartao/{cliente-id}/{cartao-id}/expirar")
    Card expireCard(@Valid
                    @NotNull(message = "O id do cliente não pode ser nulo.")
                    @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
                    @PathVariable("cliente-id") Long customerId,
                    @Valid
                    @NotNull(message = "O id do cartão não pode ser nulo.")
                    @Min(value = 1, message = "O id do cartão deve ser um número positivo.")
                    @PathVariable("cartao-id") Long cardId);
}
