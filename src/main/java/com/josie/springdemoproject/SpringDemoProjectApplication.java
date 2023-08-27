package com.josie.springdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoProjectApplication.class, args);

		System.out.println("Hello, World");
		System.out.println("Hello Again");
	}

}