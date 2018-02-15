package com.salesmanager.core.model.shipping;

import com.salesmanager.core.model.catalog.product.Product;
import com.salesmanager.core.model.catalog.product.price.FinalPrice;

public class ShippingProduct {
	
	private int quantity = 1;
	
	private Product product;
	private FinalPrice finalPrice;
	
	public ShippingProduct(Product product) {
		this.product = product;

	}
	
	
	
	public FinalPrice getFinalPrice() {
		return finalPrice;
	}
	public Product getProduct() {
		return product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setFinalPrice(FinalPrice finalPrice) {
		this.finalPrice = finalPrice;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
