package com.salesmanager.shop.store.model.catalog;

import java.io.Serializable;

import com.salesmanager.shop.model.ShopEntity;

public class AttributeValue extends ShopEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name = null;
	private String description = null;
	private boolean defaultAttribute;
	private String image;
	private String price;
	private int sortOrder;

	public String getDescription() {
		return description;
	}
	public String getImage() {
		return image;
	}
	public String getName() {
		return name;
	}
	public String getPrice() {
		return price;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public boolean isDefaultAttribute() {
		return defaultAttribute;
	}
	public void setDefaultAttribute(boolean defaultAttribute) {
		this.defaultAttribute = defaultAttribute;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

}
