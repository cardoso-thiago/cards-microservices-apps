package br.com.mastertech.invoice;

import br.com.mastertech.invoice.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class InvoiceAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(InvoiceAppApplication.class, args);
    }
}
