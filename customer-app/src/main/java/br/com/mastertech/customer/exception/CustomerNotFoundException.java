package br.com.mastertech.customer.exception;

import org.springframework.http.HttpStatus;

public class CustomerNotFoundException extends CustomerSystemException {

    public CustomerNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
