package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getAllProducts")
	public void getAllProducts() {
//		restTemplate.exchange("http://product-server/getAllProducts", HttpMethod.GET
		Object object = restTemplate.getForObject("http://product-server/getAllProducts", Object.class);
		System.out.println(object);
	}
}
