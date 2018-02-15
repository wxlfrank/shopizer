package com.salesmanager.shop.model.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.salesmanager.shop.model.order.total.ReadableOrderTotal;

public class ReadableOrderTotalSummary implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String subTotal;//one time price for items
	private String total;//final price
	private String taxTotal;//total of taxes
	
	private List<ReadableOrderTotal> totals = new ArrayList<ReadableOrderTotal>();//all other fees (tax, shipping ....)

	public String getSubTotal() {
		return subTotal;
	}

	public String getTaxTotal() {
		return taxTotal;
	}

	public String getTotal() {
		return total;
	}

	public List<ReadableOrderTotal> getTotals() {
		return totals;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}

	public void setTaxTotal(String taxTotal) {
		this.taxTotal = taxTotal;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public void setTotals(List<ReadableOrderTotal> totals) {
		this.totals = totals;
	}

}
