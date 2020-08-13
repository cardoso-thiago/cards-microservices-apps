package br.com.mastertech.card.entity;

import br.com.mastertech.card.entity.builder.CardBuilder;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String number;
    @Column
    private boolean active = Boolean.FALSE;
    @Column
    private boolean expired = Boolean.FALSE;
    @Column(name = "customer_id")
    private Long customerId;

    public Card() {
    }

    public Card(String number, boolean active, boolean expired, Long customerId) {
        this.number = number;
        this.active = active;
        this.expired = expired;
        this.customerId = customerId;
    }

    public static CardBuilder builder() {
        return CardBuilder.aCard();
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isExpired() {
        return expired;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}
