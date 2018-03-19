/**
 *
 */
package com.microservice.domain;

/**
 * @author Chetan
 *
 */
public class Customer {

	private String firstName;

	private String lastName;

	private Address mailingAddress;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the mailingAddress
	 */
	public Address getMailingAddress() {
		return mailingAddress;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param mailingAddress
	 *            the mailingAddress to set
	 */
	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
}
