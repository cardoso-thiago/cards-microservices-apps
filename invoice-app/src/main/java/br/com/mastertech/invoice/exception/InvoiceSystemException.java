package br.com.mastertech.invoice.exception;

import org.springframework.http.HttpStatus;

class InvoiceSystemException extends Exception {
    private HttpStatus httpStatus;

    InvoiceSystemException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
