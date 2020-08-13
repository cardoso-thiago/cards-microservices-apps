package br.com.mastertech.invoice.entity.builder;

import br.com.mastertech.invoice.entity.Invoice;

import java.util.Date;

public final class InvoiceBuilder {
    private Double payedValue;
    private Date payedIn;
    private Long cardId;

    private InvoiceBuilder() {
    }

    public static InvoiceBuilder anInvoice() {
        return new InvoiceBuilder();
    }

    public InvoiceBuilder payedValue(Double payedValue) {
        this.payedValue = payedValue;
        return this;
    }

    public InvoiceBuilder payedIn(Date payedIn) {
        this.payedIn = payedIn;
        return this;
    }

    public InvoiceBuilder cardId(Long cardId) {
        this.cardId = cardId;
        return this;
    }

    public Invoice build() {
        return new Invoice(payedValue, payedIn, cardId);
    }
}
