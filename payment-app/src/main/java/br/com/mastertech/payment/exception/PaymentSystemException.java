package br.com.mastertech.payment.exception;

import org.springframework.http.HttpStatus;

class PaymentSystemException extends Exception {
    private HttpStatus httpStatus;

    PaymentSystemException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
