package br.com.mastertech.customer.exception;

import org.springframework.http.HttpStatus;

class CustomerSystemException extends Exception {
    private HttpStatus httpStatus;

    CustomerSystemException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
