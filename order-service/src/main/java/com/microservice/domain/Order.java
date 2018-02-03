/**
 *
 */
package com.microservice.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Chetan
 *
 */
public class Order {
	private Long id;

	@ApiModelProperty(required = true)
	private String orderNumber;

	private Date orderDate;

	private List<OrderItem> orderItems = new ArrayList<>();

	private Customer customer;

	private Address shippingAddress;

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @return the orderItems
	 */
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @return the shippingAddress
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param orderDate
	 *            the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @param orderItems
	 *            the orderItems to set
	 */
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @param shippingAddress
	 *            the shippingAddress to set
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
