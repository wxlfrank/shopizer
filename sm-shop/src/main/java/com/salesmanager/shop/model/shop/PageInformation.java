package com.salesmanager.shop.model.shop;

import java.io.Serializable;

public class PageInformation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pageTitle;
	private String pageDescription;
	private String pageKeywords;
	private String pageUrl;
	public String getPageDescription() {
		return pageDescription;
	}
	public String getPageKeywords() {
		return pageKeywords;
	}
	public String getPageTitle() {
		return pageTitle;
	}
	public String getPageUrl() {
		return pageUrl;
	}
	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
	}
	public void setPageKeywords(String pageKeywords) {
		this.pageKeywords = pageKeywords;
	}
	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

}
