package com.udacity.carEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CarEurekaServerApplication {

	public static void main(String[] args) {

		System.out.println("hello world");

		SpringApplication.run(CarEurekaServerApplication.class, args);
	}

}
