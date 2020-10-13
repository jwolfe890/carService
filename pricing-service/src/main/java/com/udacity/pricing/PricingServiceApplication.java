package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 * TODO: Convert the application from a REST API to a microservice.
 */

@SpringBootApplication
public class PricingServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

}
