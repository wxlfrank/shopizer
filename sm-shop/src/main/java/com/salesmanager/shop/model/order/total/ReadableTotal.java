package com.salesmanager.shop.model.order.total;

import java.io.Serializable;
import java.util.List;

/**
 * Serves as the order total summary calculation
 * @author c.samson
 *
 */
public class ReadableTotal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ReadableOrderTotal> totals;
	private String grandTotal;
	public String getGrandTotal() {
		return grandTotal;
	}
	public List<ReadableOrderTotal> getTotals() {
		return totals;
	}
	public void setGrandTotal(String grandTotal) {
		this.grandTotal = grandTotal;
	}
	public void setTotals(List<ReadableOrderTotal> totals) {
		this.totals = totals;
	}

}
