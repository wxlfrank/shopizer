package com.salesmanager.shop.model.catalog;

import java.io.Serializable;

import com.salesmanager.shop.model.ShopEntity;


public abstract class CatalogEntity extends ShopEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private String friendlyUrl;
	private String keyWords;
	private String highlights;
	private String metaDescription;
	private String title;
	public String getDescription() {
		return description;
	}
	public String getFriendlyUrl() {
		return friendlyUrl;
	}
	public String getHighlights() {
		return highlights;
	}
	public String getKeyWords() {
		return keyWords;
	}
	public String getMetaDescription() {
		return metaDescription;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setFriendlyUrl(String friendlyUrl) {
		this.friendlyUrl = friendlyUrl;
	}
	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
