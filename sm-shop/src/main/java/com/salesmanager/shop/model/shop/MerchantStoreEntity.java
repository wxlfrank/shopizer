package com.salesmanager.shop.model.shop;

import java.io.Serializable;

public class MerchantStoreEntity implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String code;
	private String name;
	private String defaultLanguage;

	public String getCode() {
		return code;
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
