package br.com.mastertech.card.exception;

import org.springframework.http.HttpStatus;

public class CardNotFoundException extends CardSystemException {
    public CardNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
