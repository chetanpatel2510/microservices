package com.microservice.product.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.product.dao.ProductRepository;
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
	private String productName;

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(value = "/getProductById/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable Long id, HttpServletRequest request) {
		System.out.println("Calling get Product By Id");
		List<Product> products = productRepository.findAll();
		System.out.println(products.size());
		System.out.println(products.get(0).getCode());
		Enumeration<String> headers = request.getHeaderNames();
		while (headers.hasMoreElements()) {
			String header = headers.nextElement();
			System.out.println(header + " " + request.getHeader(header));
		}
		HttpSession session = request.getSession();
		System.out.println("Session Id: " + session.getId());
		if (session.getAttribute("product") == null) {
			session.setAttribute("product", products.get(0));
		}
		System.out.println(session.getAttribute("product"));
		return products.get(0);

	}
}
