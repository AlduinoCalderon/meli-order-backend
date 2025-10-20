package com.meli.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Main application class for the e-commerce backend.
 * Bootstraps the Spring Boot application.
 */
@SpringBootApplication
public class EcommerceApplication {

	/**
	 * Main entry point for the Spring Boot application.
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		// dotenv-java temporarily disabled due to dependency resolution issues.
		// To use .env, uncomment and ensure dependency is available, or set env vars manually.
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
