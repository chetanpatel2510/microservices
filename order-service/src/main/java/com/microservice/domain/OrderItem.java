/**
 *
 */
package com.microservice.domain;

import java.math.BigDecimal;

/**
 * @author Chetan
 *
 */
public class OrderItem {

	private String sku;

	private BigDecimal price;

	private int quantity;

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param sku
	 *            the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
}
