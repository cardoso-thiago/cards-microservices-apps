package br.com.mastertech.payment.client;

import br.com.mastertech.payment.config.ResilienceConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@FeignClient(name = "ZUUL", configuration = ResilienceConfiguration.class)
public interface CardClient {
    @GetMapping("/cartao/id/{id}")
    Card getCardById(
            @Valid
            @NotNull(message = "O numero do cartão deve ser informado.")
            @NotEmpty(message = "O numero do cartão deve ser informado.")
            @PathVariable("id") Long cardId);
}
