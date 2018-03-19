package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * This is product service which will provide product details. This will
 * register itself as eureka client to eureka server.
 * 
 * @author Chetan
 *
 */
@EnableEurekaClient
@SpringBootApplication
@EnableResourceServer
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	
}
