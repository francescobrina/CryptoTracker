package com.example.cryptotracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.cryptotracker")
public class CryptoTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoTrackerApplication.class, args);
	}
}
