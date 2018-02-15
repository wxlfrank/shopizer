package com.salesmanager.core.model.customer;

import com.salesmanager.core.model.common.Criteria;

public class CustomerCriteria extends Criteria {
	
	private String firstName;
	private String lastName;
	private String name;
	private String email;
	private String country;
	public String getCountry() {
		return country;
	}
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		return name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setName(String name) {
		this.name = name;
	}

}
