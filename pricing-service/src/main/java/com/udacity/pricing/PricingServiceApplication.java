package com.udacity.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 * TODO: Convert the application from a REST API to a microservice.
 */
@SpringBootApplication
public class PricingServiceApplication {

    public static void main(String[] args) {

        System.out.println("hello world");

        SpringApplication.run(PricingServiceApplication.class, args);
    }

}
