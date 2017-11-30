package com.microservice.product.domain;

import java.math.BigDecimal;

//@Entity
//@Table(name = "PRODUCT")
public class Product {

	/**
	 * id declaration.
	 */
	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// @Column(name = "PRODUCT_ID")
	private Long id;

	/**
	 * name declaration.
	 */
	// @Column(name = "PROD_NAME")
	private String name;

	/**
	 * description declaration.
	 */
	// @Column(name = "PROD_DESC")
	private String description;

	/**
	 * sku declaration.
	 */
	// @Column(name = "PROD_CODE")
	private String code;

	/**
	 * price declaration.
	 */
	// @Column(name = "PROD_PRICE")
	private BigDecimal price;

	/**
	 * //@return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * //@return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * //@return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * //@return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * //@return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * //@param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * //@param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * //@param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * //@param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * //@param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
