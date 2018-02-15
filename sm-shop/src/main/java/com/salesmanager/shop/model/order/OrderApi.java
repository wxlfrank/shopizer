package com.salesmanager.shop.model.order;

import java.util.ArrayList;
import java.util.List;

import com.salesmanager.shop.model.Entity;

public class OrderApi extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean customerAgreement;
	private String comments;
	private String currency;
	private List<OrderAttribute> attributes = new ArrayList<OrderAttribute>();


	public List<OrderAttribute> getAttributes() {
		return attributes;
	}

	public String getComments() {
		return comments;
	}

	public String getCurrency() {
		return currency;
	}

	public boolean isCustomerAgreement() {
		return customerAgreement;
	}

	public void setAttributes(List<OrderAttribute> attributes) {
		this.attributes = attributes;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setCustomerAgreement(boolean customerAgreement) {
		this.customerAgreement = customerAgreement;
	}



}
