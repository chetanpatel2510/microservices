/**
 *
 */
package com.microservice.product.properties;

import org.springframework.beans.factory.annotation.Value;

/**
 * This class will hold all the values of the product properties stored in
 * config service.
 *
 * @author Chetan
 *
 */
/*
 * Spring Boot will automatically enable configuration properties.
 */
// @EnableConfigurationProperties
public class ProductProperties {

	/**
	 * If Name of the property matches field name, then @Value is not required.
	 */
	@Value("${product.name}")
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
