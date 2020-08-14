package br.com.mastertech.payment;

import br.com.mastertech.payment.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class PaymentAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAppApplication.class, args);
    }
}
