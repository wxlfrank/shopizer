package com.salesmanager.core.model.order;

import com.salesmanager.core.model.common.Criteria;

public class OrderCriteria extends Criteria {
	
	private String customerName;
	private String paymentMethod;
	private Long customerId;
	public Long getCustomerId()
    {
        return customerId;
    }
	public String getCustomerName() {
		return customerName;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setCustomerId( Long customerId )
    {
        this.customerId = customerId;
    }
    public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
    public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
   
	
	
	

}
