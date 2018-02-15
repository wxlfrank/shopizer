package com.salesmanager.shop.admin.model.catalog;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Post keyword from the admin
 * @author Carl Samson
 *
 */
public class Keyword implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long productId;
	private String languageCode;
	@NotEmpty
	private String keyword;
	public String getKeyword() {
		return keyword;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public long getProductId() {
		return productId;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}

}
