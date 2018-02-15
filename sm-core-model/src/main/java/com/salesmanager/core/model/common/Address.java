package com.salesmanager.core.model.common;

import java.io.Serializable;


public class Address implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String city;
	private String postalCode;
	private String stateProvince;
	private String zone;//code
	private String country;//code

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
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

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
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
