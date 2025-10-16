package com.meli.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
        // dotenv-java temporarily disabled due to dependency resolution issues.
        // To use .env, uncomment and ensure dependency is available, or set env vars manually.
 		SpringApplication.run(EcommerceApplication.class, args);
	}

}
