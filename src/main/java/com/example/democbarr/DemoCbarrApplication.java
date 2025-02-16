package com.example.democbarr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoCbarrApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCbarrApplication.class, args);
        System.out.println("Salam");
    }

}
