package com.salesmanager.shop.model.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.salesmanager.core.model.order.orderstatus.OrderStatus;
import com.salesmanager.core.model.order.payment.CreditCard;
import com.salesmanager.core.model.payments.PaymentType;
import com.salesmanager.shop.model.order.total.OrderTotal;

public class OrderEntity extends Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<OrderTotal> totals;
	private List<OrderAttribute> attributes = new ArrayList<OrderAttribute>();
	
	private PaymentType paymentType;
	private String paymentModule;
	private String shippingModule;
	private List<OrderStatus> previousOrderStatus;
	private OrderStatus orderStatus;
	private CreditCard creditCard;
	private Date datePurchased;
	private String currency;
	private boolean customerAgreed;
	private boolean confirmedAddress;
	private String comments;
	
	public List<OrderAttribute> getAttributes() {
		return attributes;
	}
	public String getComments() {
		return comments;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public String getCurrency() {
		return currency;
	}
	public Date getDatePurchased() {
		return datePurchased;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public String getPaymentModule() {
		return paymentModule;
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}

	public List<OrderStatus> getPreviousOrderStatus() {
		return previousOrderStatus;
	}
	public String getShippingModule() {
		return shippingModule;
	}
	public List<OrderTotal> getTotals() {
		return totals;
	}
	public boolean isConfirmedAddress() {
		return confirmedAddress;
	}
	public boolean isCustomerAgreed() {
		return customerAgreed;
	}
	public void setAttributes(List<OrderAttribute> attributes) {
		this.attributes = attributes;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public void setConfirmedAddress(boolean confirmedAddress) {
		this.confirmedAddress = confirmedAddress;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setCustomerAgreed(boolean customerAgreed) {
		this.customerAgreed = customerAgreed;
	}
	public void setDatePurchased(Date datePurchased) {
		this.datePurchased = datePurchased;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public void setPaymentModule(String paymentModule) {
		this.paymentModule = paymentModule;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public void setPreviousOrderStatus(List<OrderStatus> previousOrderStatus) {
		this.previousOrderStatus = previousOrderStatus;
	}
	public void setShippingModule(String shippingModule) {
		this.shippingModule = shippingModule;
	}
	public void setTotals(List<OrderTotal> totals) {
		this.totals = totals;
	}


}
