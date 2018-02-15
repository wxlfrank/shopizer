package com.salesmanager.shop.model.order;

import java.io.Serializable;
import java.util.List;

import com.salesmanager.shop.model.order.shipping.ReadableShippingSummary;
import com.salesmanager.shop.model.order.total.ReadableOrderTotal;

public class ReadableShopOrder extends ReadableOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ReadableShippingSummary shippingSummary;

	private String errorMessage = null;//global error message
	private List<ReadableOrderTotal> subTotals;//order calculation	
	private String grandTotal;//grand total - order calculation
	

	public String getErrorMessage() {
		return errorMessage;
	}
	public String getGrandTotal() {
		return grandTotal;
	}
	public ReadableShippingSummary getShippingSummary() {
		return shippingSummary;
	}
	public List<ReadableOrderTotal> getSubTotals() {
		return subTotals;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public void setGrandTotal(String grandTotal) {
		this.grandTotal = grandTotal;
	}
	public void setShippingSummary(ReadableShippingSummary shippingSummary) {
		this.shippingSummary = shippingSummary;
	}
	public void setSubTotals(List<ReadableOrderTotal> subTotals) {
		this.subTotals = subTotals;
	}

}
