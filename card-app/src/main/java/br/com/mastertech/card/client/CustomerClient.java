package br.com.mastertech.card.client;

import br.com.mastertech.card.config.OAuthRequestInterceptor;
import br.com.mastertech.card.config.ResilienceConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@FeignClient(name = "ZUUL", configuration = {ResilienceConfiguration.class, OAuthRequestInterceptor.class})
public interface CustomerClient {
    @GetMapping("/cliente/{id}")
    Customer getCustomer(@Valid
                         @NotNull(message = "O id do cliente não pode ser nulo.")
                         @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
                         @PathVariable("id") Long customerId);
}