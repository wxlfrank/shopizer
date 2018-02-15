package com.salesmanager.core.modules.integration.shipping.model;

import java.math.BigDecimal;

public abstract class CustomShippingQuoteItem {
	
	private String priceText;
	private BigDecimal price;
	public BigDecimal getPrice() {
		return price;
	}
	public String getPriceText() {
		return priceText;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setPriceText(String priceText) {
		this.priceText = priceText;
	}

}
