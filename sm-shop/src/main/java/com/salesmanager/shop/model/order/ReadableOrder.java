package com.salesmanager.shop.model.order;

import java.io.Serializable;
import java.util.List;

import com.salesmanager.core.model.reference.currency.Currency;
import com.salesmanager.shop.model.customer.Address;
import com.salesmanager.shop.model.customer.ReadableCustomer;
import com.salesmanager.shop.model.customer.ReadableDelivery;
import com.salesmanager.shop.model.order.total.OrderTotal;


public class ReadableOrder extends OrderEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ReadableCustomer customer;
	private List<ReadableOrderProduct> products;
	private Currency currencyModel;
	
	private Address billing;
	private ReadableDelivery delivery;
	
	
	
	private OrderTotal total;
	private OrderTotal tax;
	private OrderTotal shipping;
	public Address getBilling() {
		return billing;
	}
	public Currency getCurrencyModel() {
		return currencyModel;
	}
	public ReadableCustomer getCustomer() {
		return customer;
	}
	public Address getDelivery() {
		return delivery;
	}
	public List<ReadableOrderProduct> getProducts() {
		return products;
	}

	public OrderTotal getShipping() {
		return shipping;
	}
	public OrderTotal getTax() {
		return tax;
	}

	public OrderTotal getTotal() {
		return total;
	}
	public void setBilling(Address billing) {
		this.billing = billing;
	}

	public void setCurrencyModel(Currency currencyModel) {
		this.currencyModel = currencyModel;
	}
	public void setCustomer(ReadableCustomer customer) {
		this.customer = customer;
	}

	public void setDelivery(ReadableDelivery delivery) {
		this.delivery = delivery;
	}
	public void setProducts(List<ReadableOrderProduct> products) {
		this.products = products;
	}

	public void setShipping(OrderTotal shipping) {
		this.shipping = shipping;
	}
	public void setTax(OrderTotal tax) {
		this.tax = tax;
	}
	public void setTotal(OrderTotal total) {
		this.total = total;
	}

}
