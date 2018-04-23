package com.microservice.product.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.product.domain.Product;

@RestController
public class ProductController {
	@RequestMapping(value = "/getProductById/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable Long id) {
		System.out.println("Calling get Product By Id");
		Product product1 = new Product();
		product1.setCode("PRODUCT_1_CODE");
		product1.setDescription("Product 1 Description");
		product1.setName("Product 1 Name");
		product1.setPrice(BigDecimal.valueOf(100.00));
		return product1;
		
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		List<Product> productList = new ArrayList<>();
		Product product1 = new Product();
		product1.setCode("PRODUCT_1_CODE");
		product1.setDescription("Product 1 Description");
		product1.setName("Product 1 Name");
		product1.setPrice(BigDecimal.valueOf(100.00));
		productList.add(product1);
		
		Product product2 = new Product();
		product2.setCode("PRODUCT_2_CODE");
		product2.setDescription("Product 2 Description");
		product2.setName("Product 2 Name");
		product2.setPrice(BigDecimal.valueOf(100.00));
		productList.add(product2);
		return productList;
	}
}
