package com.salesmanager.core.model.payments;

import java.io.Serializable;

import com.salesmanager.core.model.system.IntegrationConfiguration;
import com.salesmanager.core.model.system.IntegrationModule;

/**
 * Object to be used in store front with meta data and configuration
 * informations required to display to the end user
 * @author Carl Samson
 *
 */
public class PaymentMethod implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String paymentMethodCode;
	private PaymentType paymentType;
	private boolean defaultSelected;
	private IntegrationModule module;
	private IntegrationConfiguration informations;

	public IntegrationConfiguration getInformations() {
		return informations;
	}
	public IntegrationModule getModule() {
		return module;
	}
	public String getPaymentMethodCode() {
		return paymentMethodCode;
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public boolean isDefaultSelected() {
		return defaultSelected;
	}
	public void setDefaultSelected(boolean defaultSelected) {
		this.defaultSelected = defaultSelected;
	}
	public void setInformations(IntegrationConfiguration informations) {
		this.informations = informations;
	}
	public void setModule(IntegrationModule module) {
		this.module = module;
	}
	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

}
