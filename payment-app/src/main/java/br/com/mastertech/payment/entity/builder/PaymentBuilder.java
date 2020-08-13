package br.com.mastertech.payment.entity.builder;

import br.com.mastertech.payment.entity.Payment;

public final class PaymentBuilder {
    private String description;
    private double value;
    private Long cardId;

    private PaymentBuilder() {
    }

    public static PaymentBuilder aPayment() {
        return new PaymentBuilder();
    }

    public PaymentBuilder description(String description) {
        this.description = description;
        return this;
    }

    public PaymentBuilder value(double value) {
        this.value = value;
        return this;
    }

    public PaymentBuilder cardId(Long cardId) {
        this.cardId = cardId;
        return this;
    }

    public Payment build() {
        return new Payment(description, value, cardId);
    }
}
