package com.springbootproject.databasecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DatabasecrudApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(DatabasecrudApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(DatabasecrudApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);
	}

}
