package br.com.mastertech.invoice.client;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Card {
    private Long id;
    @NotNull(message = "O numero do cartao não pode ser nulo.")
    @NotEmpty(message = "O numero do cartao não pode ser vazio.")
    @JsonProperty("numero")
    private String number;
    @NotNull(message = "O id do cliente não pode ser nulo.")
    @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
    @JsonProperty("clienteId")
    private Long customerId;
    @JsonProperty("ativo")
    private boolean active;
    @JsonProperty("expirado")
    private boolean expired;

    public Card(Long id, String number, Long customerId, boolean active, boolean expired) {
        this.id = id;
        this.number = number;
        this.customerId = customerId;
        this.active = active;
        this.expired = expired;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}
