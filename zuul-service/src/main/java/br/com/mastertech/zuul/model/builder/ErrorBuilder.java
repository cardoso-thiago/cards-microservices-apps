package br.com.mastertech.zuul.model.builder;

import br.com.mastertech.zuul.model.Error;

import java.time.LocalDateTime;

public final class ErrorBuilder {
    private String message;
    private LocalDateTime timestamp;

    private ErrorBuilder() {
    }

    public static ErrorBuilder anError() {
        return new ErrorBuilder();
    }

    public ErrorBuilder message(String message) {
        this.message = message;
        return this;
    }

    public ErrorBuilder timestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Error build() {
        return new Error(message, timestamp);
    }
}
