package com.ticketmicroservice.ticketservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TicketservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketservicesApplication.class, args);
	}

}
