package com.microservice.product.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.product.domain.Product;

/**
 * Product Controller class.
 *
 * @author Chetan
 *
 */
@RestController
@RefreshScope
public class ProductController {

	@Value("${product.name}")
	private String name;

	@RequestMapping(value = "/getProductById/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable Long id) {
		System.out.println("Calling get Product By Id");
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription("Product description");
		product.setPrice(BigDecimal.TEN);
		product.setSku("123");
		return product;

	}
}
