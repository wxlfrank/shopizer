package com.salesmanager.shop.model.customer.attribute;

import java.io.Serializable;

public class CustomerOptionEntity extends CustomerOption implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int order;
	private String code;
	private String type;//TEXT|SELECT|RADIO|CHECKBOX
	public String getCode() {
		return code;
	}
	public int getOrder() {
		return order;
	}
	public String getType() {
		return type;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public void setType(String type) {
		this.type = type;
	}

}
