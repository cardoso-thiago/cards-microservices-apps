package br.com.mastertech.invoice.config;

import br.com.mastertech.invoice.client.ServiceFallback;
import feign.Feign;
import feign.RetryableException;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class ResilienceConfiguration {

    @Bean
    public Feign.Builder builder(){
        FeignDecorators decorators = FeignDecorators.builder()
                .withFallback(new ServiceFallback(), RetryableException.class)
                .build();
        return Resilience4jFeign.builder(decorators);
    }
}
