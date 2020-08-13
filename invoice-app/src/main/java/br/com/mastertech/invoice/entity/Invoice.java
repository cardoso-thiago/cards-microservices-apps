package br.com.mastertech.invoice.entity;

import br.com.mastertech.invoice.entity.builder.InvoiceBuilder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "payed_value")
    private Double payedValue;
    @Column(name = "payed_in")
    @Temporal(TemporalType.DATE)
    private Date payedIn;
    @Column(name = "card_id")
    private Long cardId;

    public Invoice() {
    }

    public Invoice(Double payedValue, Date payedIn, Long cardId) {
        this.payedValue = payedValue;
        this.payedIn = payedIn;
        this.cardId = cardId;
    }

    public static InvoiceBuilder builder() {
        return InvoiceBuilder.anInvoice();
    }

    public Long getId() {
        return id;
    }

    public Double getPayedValue() {
        return payedValue;
    }

    public Date getPayedIn() {
        return payedIn;
    }

    public Long getCardId() {
        return cardId;
    }
}
