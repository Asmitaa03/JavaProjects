package com.registerservices.registerservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegisterservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterservicesApplication.class, args);
	}

}
