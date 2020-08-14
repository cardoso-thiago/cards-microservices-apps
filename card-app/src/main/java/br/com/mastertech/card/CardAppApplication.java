package br.com.mastertech.card;

import br.com.mastertech.card.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class CardAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(CardAppApplication.class, args);
    }
}