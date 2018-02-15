package com.salesmanager.shop.model.customer;

import java.io.Serializable;

import javax.validation.Valid;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class CustomerEntity extends Customer implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	@Email (message="{messages.invalid.email}")
    @NotEmpty(message="{NotEmpty.customer.emailAddress}")
	private String emailAddress;
	@Valid
	private Address billing;
	private Address delivery;
	private String gender;

	private String language;
	private String firstName;
	private String lastName;
	
	private String provider;//online, facebook ...

	
	private String storeCode;
	
	@NotEmpty(message="{NotEmpty.customer.userName}")
	//can be email or anything else
	private String userName;
	
	private Double rating = 0D;
	private int ratingCount;
	
	public Address getBilling() {
		return billing;
	}

	public Address getDelivery() {
		return delivery;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getGender() {
		return gender;
	}
	

	public String getLanguage() {
		return language;
	}


	public String getLastName() {
		return lastName;
	}
	public String getProvider() {
		return provider;
	}
	

	public Double getRating() {
		return rating;
	}
	public int getRatingCount() {
		return ratingCount;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setBilling(final Address billing) {
		this.billing = billing;
	}
	public void setDelivery(final Address delivery) {
		this.delivery = delivery;
	}


	public void setEmailAddress(final String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setGender(final String gender) {
		this.gender = gender;
	}


	public void setLanguage(final String language) {
		this.language = language;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}

	public void setStoreCode(final String storeCode) {
		this.storeCode = storeCode;
	}

	public void setUserName(final String userName) {
		this.userName = userName;
	}



    

}
