package br.com.mastertech.payment.config;

import br.com.mastertech.payment.client.CardFallback;
import feign.Feign;
import feign.RetryableException;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class ResilienceConfiguration {

    @Bean
    public Feign.Builder builder(){
        FeignDecorators decorators = FeignDecorators.builder()
                .withFallback(new CardFallback(), RetryableException.class)
                .build();
        return Resilience4jFeign.builder(decorators);
    }
}
