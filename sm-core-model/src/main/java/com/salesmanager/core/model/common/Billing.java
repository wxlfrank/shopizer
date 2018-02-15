package com.salesmanager.core.model.common;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

import com.salesmanager.core.model.reference.country.Country;
import com.salesmanager.core.model.reference.zone.Zone;

@Embeddable
public class Billing {
	
	@NotEmpty
	@Column (name ="BILLING_LAST_NAME", length=64, nullable=false)
	private String lastName;

	@NotEmpty
	@Column (name ="BILLING_FIRST_NAME", length=64, nullable=false)
	private String firstName;
	


	@Column (name ="BILLING_COMPANY", length=100)
	private String company;
	
	@Column (name ="BILLING_STREET_ADDRESS", length=256)
	private String address;
	
	
	@Column (name ="BILLING_CITY", length=100)
	private String city;
	
	@Column (name ="BILLING_POSTCODE", length=20)
	private String postalCode;
	
	@Column(name="BILLING_TELEPHONE", length=32)
	private String telephone;
	
	@Column (name ="BILLING_STATE", length=100)
	private String state;
	
	@Column (name ="LONGITUDE", length=100)
	private String longitude;
	
	@Column (name ="LATITUDE", length=100)
	private String latitude;


	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Country.class)
	@JoinColumn(name="BILLING_COUNTRY_ID", nullable=false)
	private Country country;
	
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Zone.class)
	@JoinColumn(name="BILLING_ZONE_ID", nullable=true)
	private Zone zone;



	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getCompany() {
		return company;
	}

	public Country getCountry() {
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
	
	public String getPostalCode() {
		return postalCode;
	}

	public String getState() {
		return state;
	}

	public String getTelephone() {
		return telephone;
	}

	public Zone getZone() {
		return zone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCountry(Country country) {
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

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
}
