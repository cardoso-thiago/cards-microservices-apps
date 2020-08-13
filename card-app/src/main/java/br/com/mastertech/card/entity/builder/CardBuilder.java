package br.com.mastertech.card.entity.builder;

import br.com.mastertech.card.entity.Card;

public final class CardBuilder {
    private String number;
    private boolean active = Boolean.FALSE;
    private boolean expired = Boolean.FALSE;
    private Long customerId;

    private CardBuilder() {
    }

    public static CardBuilder aCard() {
        return new CardBuilder();
    }

    public CardBuilder number(String number) {
        this.number = number;
        return this;
    }

    public CardBuilder active(boolean active) {
        this.active = active;
        return this;
    }

    public CardBuilder expired(boolean expired) {
        this.expired = expired;
        return this;
    }

    public CardBuilder customerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Card build() {
        return new Card(number, active, expired, customerId);
    }
}
