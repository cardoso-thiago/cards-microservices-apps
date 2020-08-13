package br.com.mastertech.card;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CardAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(CardAppApplication.class, args);
    }
}
