package br.com.mastertech.payment.exception;

import org.springframework.http.HttpStatus;

public class ExpiredCardException extends PaymentSystemException {
    public ExpiredCardException(String message) {
        super(message, HttpStatus.FORBIDDEN);
    }
}
