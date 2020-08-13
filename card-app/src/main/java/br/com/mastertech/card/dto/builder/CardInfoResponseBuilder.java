package br.com.mastertech.card.dto.builder;

import br.com.mastertech.card.dto.CardInfoResponse;

public final class CardInfoResponseBuilder {
    private Long id;
    private String number;
    private Long customerId;
    private boolean active;
    private boolean expired;

    private CardInfoResponseBuilder() {
    }

    public static CardInfoResponseBuilder aCardInfoResponse() {
        return new CardInfoResponseBuilder();
    }

    public CardInfoResponseBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public CardInfoResponseBuilder number(String number) {
        this.number = number;
        return this;
    }

    public CardInfoResponseBuilder customerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public CardInfoResponseBuilder active(boolean active) {
        this.active = active;
        return this;
    }

    public CardInfoResponseBuilder expired(boolean expired) {
        this.expired = expired;
        return this;
    }

    public CardInfoResponse build() {
        return new CardInfoResponse(id, number, customerId, active, expired);
    }
}
