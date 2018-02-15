package com.salesmanager.shop.model.shoppingcart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.salesmanager.shop.model.order.total.ReadableOrderTotal;

/**
 * Compatible with v1
 * @author c.samson
 *
 */
public class ReadableShoppingCart extends ShoppingCartEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	private BigDecimal subtotal;


	private String displaySubTotal;
	private BigDecimal total;
	private String displayTotal;
	private int quantity;
	
	List<ReadableShoppingCartItem> products = new ArrayList<ReadableShoppingCartItem>();
	List<ReadableOrderTotal> totals;
	
	private Long customer;



	public String getCode() {
		return code;
	}



	public Long getCustomer() {
		return customer;
	}



	public String getDisplaySubTotal() {
		return displaySubTotal;
	}



	public String getDisplayTotal() {
		return displayTotal;
	}



	public List<ReadableShoppingCartItem> getProducts() {
		return products;
	}



	public int getQuantity() {
		return quantity;
	}



	public BigDecimal getSubtotal() {
		return subtotal;
	}



	public BigDecimal getTotal() {
		return total;
	}
	
	public List<ReadableOrderTotal> getTotals() {
		return totals;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public void setCustomer(Long customer) {
		this.customer = customer;
	}



	public void setDisplaySubTotal(String displaySubTotal) {
		this.displaySubTotal = displaySubTotal;
	}



	public void setDisplayTotal(String displayTotal) {
		this.displayTotal = displayTotal;
	}



	public void setProducts(List<ReadableShoppingCartItem> products) {
		this.products = products;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}



	public void setTotal(BigDecimal total) {
		this.total = total;
	}



	public void setTotals(List<ReadableOrderTotal> totals) {
		this.totals = totals;
	}




}
