package br.com.mastertech.invoice.dto;

public class CardExpirationRequest {
    private String status;

    public CardExpirationRequest(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
