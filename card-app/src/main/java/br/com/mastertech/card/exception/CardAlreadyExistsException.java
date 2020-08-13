package br.com.mastertech.card.exception;

import org.springframework.http.HttpStatus;

public class CardAlreadyExistsException extends CardSystemException {
    public CardAlreadyExistsException(String message) {
        super(message, HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
