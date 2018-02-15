package com.salesmanager.shop.model.customer;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;


public class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="{NotEmpty.customer.firstName}")
	private String firstName;
	
	@NotEmpty(message="{NotEmpty.customer.lastName}")
	private String lastName;
	
	private String bilstateOther;

	private String company;

	private String phone;
	private String address;
	private String city;
	

	private String postalCode;
	

	private String stateProvince;
	private boolean billingAddress;
	
	private String latitude;
	private String longitude;
	
	private String zone;//code
	
	@NotEmpty(message="{NotEmpty.customer.billing.country}")
	private String country;//code
	


	public String getAddress() {
		return address;
	}

	public String getBilstateOther()
    {
        return bilstateOther;
    }



	public String getCity() {
		return city;
	}

	public String getCompany() {
		return company;
	}

	public String getCountry() {
		return country;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getPhone() {
		return phone;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public String getZone() {
		return zone;
	}

	public boolean isBillingAddress()
    {
        return billingAddress;
    }

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBillingAddress( boolean billingAddress )
    {
        this.billingAddress = billingAddress;
    }

	public void setBilstateOther( String bilstateOther )
    {
        this.bilstateOther = bilstateOther;
    }

	public void setCity(String city) {
		this.city = city;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCountry(String country) {
		this.country = country;
	}

    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}
