package br.com.mastertech.card.config;

import br.com.mastertech.card.client.CustomerFallback;
import feign.Feign;
import feign.RetryableException;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class ResilienceConfiguration {

    @Bean
    public Feign.Builder builder(){
        FeignDecorators decorators = FeignDecorators.builder()
                .withFallback(new CustomerFallback(), RetryableException.class)
                .build();
        return Resilience4jFeign.builder(decorators);
    }
}
