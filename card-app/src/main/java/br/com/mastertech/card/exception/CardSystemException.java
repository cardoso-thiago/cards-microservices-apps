package br.com.mastertech.card.exception;

import org.springframework.http.HttpStatus;

class CardSystemException extends Exception {
    private HttpStatus httpStatus;

    CardSystemException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
