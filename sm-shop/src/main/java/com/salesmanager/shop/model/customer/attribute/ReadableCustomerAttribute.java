package com.salesmanager.shop.model.customer.attribute;

public class ReadableCustomerAttribute extends CustomerAttributeEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ReadableCustomerOption customerOption;
	private ReadableCustomerOptionValue customerOptionValue;
	public ReadableCustomerOption getCustomerOption() {
		return customerOption;
	}
	public ReadableCustomerOptionValue getCustomerOptionValue() {
		return customerOptionValue;
	}
	public void setCustomerOption(ReadableCustomerOption customerOption) {
		this.customerOption = customerOption;
	}
	public void setCustomerOptionValue(ReadableCustomerOptionValue customerOptionValue) {
		this.customerOptionValue = customerOptionValue;
	}



}
