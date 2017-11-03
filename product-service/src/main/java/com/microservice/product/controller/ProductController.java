package com.microservice.product.controller;

import java.math.BigDecimal;

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
public class ProductController {

	@RequestMapping(value = "/getProductById/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable Long id) {
		Product product = new Product();
		product.setId(id);
		product.setName("Sample Product Name");
		product.setDescription("Product description");
		product.setPrice(BigDecimal.TEN);
		product.setSku("123");
		return product;

	}
}
