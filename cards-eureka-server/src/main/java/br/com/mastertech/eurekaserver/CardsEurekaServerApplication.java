package br.com.mastertech.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CardsEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsEurekaServerApplication.class, args);
    }

}
