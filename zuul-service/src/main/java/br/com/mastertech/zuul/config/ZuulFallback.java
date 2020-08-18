package br.com.mastertech.zuul.config;

import br.com.mastertech.zuul.model.Error;
import br.com.mastertech.zuul.model.builder.ErrorBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.time.LocalDateTime;

@Component
public class ZuulFallback implements FallbackProvider {
    @Override
    public String getRoute() {
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ZuulClientResponse(HttpStatus.SERVICE_UNAVAILABLE,
                createErrorBody(MessageFormat.format("Serviço {0} indisponível no momento.", route)));
    }

    private String createErrorBody(String message) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        Error error = ErrorBuilder.anError().message(message).timestamp(LocalDateTime.now()).build();
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(error);
        } catch (JsonProcessingException e) {
            return message;
        }
    }
}
