package com.salesmanager.shop.model.order;

import java.io.Serializable;
import java.util.List;

public class ReadableOrderProduct extends OrderProductEntity implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productName;
	private String price;
	private String subTotal;
	
	private List<ReadableOrderProductAttribute> attributes = null;
	
	private String sku;
	private String image;
	public List<ReadableOrderProductAttribute> getAttributes() {
		return attributes;
	}
	public String getImage() {
		return image;
	}
	public String getPrice() {
		return price;
	}
	public String getProductName() {
		return productName;
	}
	public String getSku() {
		return sku;
	}
	public String getSubTotal() {
		return subTotal;
	}
	public void setAttributes(List<ReadableOrderProductAttribute> attributes) {
		this.attributes = attributes;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}


}
