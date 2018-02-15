package com.salesmanager.shop.model.customer;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.salesmanager.shop.model.ShopEntity;


public class CustomerReviewEntity extends ShopEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotEmpty
	private String description;
	private Long customerId;//review creator
	private String date;
	
	@NotNull
	@Min(1)
	@Max(5)
	private Double rating;
	public Long getCustomerId() {
		return customerId;
	}
	public String getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}
	public Double getRating() {
		return rating;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}


}
