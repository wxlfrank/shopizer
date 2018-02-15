package com.salesmanager.shop.admin.model.orders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Embedded;

import com.salesmanager.core.model.common.Billing;
import com.salesmanager.core.model.common.Delivery;
import com.salesmanager.core.model.order.orderstatus.OrderStatus;


public class Order implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long Id;
	private String orderHistoryComment = "";
	
	List<OrderStatus> orderStatusList = Arrays.asList(OrderStatus.values());     
	private String datePurchased = "";
	private  com.salesmanager.core.model.order.Order order;
	
	@Embedded
	private com.salesmanager.core.model.common.Delivery delivery = null;
	
	@Embedded
	private com.salesmanager.core.model.common.Billing billing = null;
	
	
	
	
	public Billing getBilling() {
		return billing;
	}

	public String getDatePurchased() {
		return datePurchased;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public Long getId() {
		return Id;
	}

	public com.salesmanager.core.model.order.Order getOrder() {
		return order;
	}

	public String getOrderHistoryComment() {
		return orderHistoryComment;
	}

	public List<OrderStatus> getOrderStatusList() {
		return orderStatusList;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public void setDatePurchased(String datePurchased) {
		this.datePurchased = datePurchased;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setOrder(com.salesmanager.core.model.order.Order order) {
		this.order = order;
	}

	public void setOrderHistoryComment(String orderHistoryComment) {
		this.orderHistoryComment = orderHistoryComment;
	}

	public void setOrderStatusList(List<OrderStatus> orderStatusList) {
		this.orderStatusList = orderStatusList;
	}




	
}