package br.com.mastertech.payment.entity;

import br.com.mastertech.payment.entity.builder.PaymentBuilder;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String description;
    @Column
    private double value;
    @Column(name = "card_id")
    private Long cardId;

    public Payment() {
    }

    public Payment(String description, double value, Long cardId) {
        this.description = description;
        this.value = value;
        this.cardId = cardId;
    }

    public static PaymentBuilder builder() {
        return PaymentBuilder.aPayment();
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
}
