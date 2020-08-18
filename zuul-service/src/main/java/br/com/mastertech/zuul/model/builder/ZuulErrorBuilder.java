package br.com.mastertech.zuul.model.builder;

import br.com.mastertech.zuul.model.ZuulError;

import java.time.LocalDateTime;

public final class ZuulErrorBuilder {
    private String message;
    private LocalDateTime timestamp;

    private ZuulErrorBuilder() {
    }

    public static ZuulErrorBuilder aZuulError() {
        return new ZuulErrorBuilder();
    }

    public ZuulErrorBuilder message(String message) {
        this.message = message;
        return this;
    }

    public ZuulErrorBuilder timestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public ZuulError build() {
        return new ZuulError(message, timestamp);
    }
}
