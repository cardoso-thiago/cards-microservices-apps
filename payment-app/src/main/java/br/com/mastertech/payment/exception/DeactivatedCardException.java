package br.com.mastertech.payment.exception;

import org.springframework.http.HttpStatus;

public class DeactivatedCardException extends PaymentSystemException {
    public DeactivatedCardException(String message) {
        super(message, HttpStatus.FORBIDDEN);
    }
}
