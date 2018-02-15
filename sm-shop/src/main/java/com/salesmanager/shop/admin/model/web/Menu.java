package com.salesmanager.shop.admin.model.web;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Menu implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String url;
	private String icon;
	private String role;
	private int order;
	private List<Menu> menus = new ArrayList<Menu>();
	public String getCode() {
		return code;
	}
	public String getIcon() {
		return icon;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public int getOrder() {
		return order;
	}

	 

	public String getRole() {
		return role;
	}
	public String getUrl() {
		return url;
	}
	@JsonProperty("code")  
	public void setCode(String code) {
		this.code = code;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@JsonProperty("menus")  
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	@JsonProperty("order")  
	public void setOrder(int order) {
		this.order = order;
	}
	@JsonProperty("role") 
	public void setRole(String role) {
		this.role = role;
	}
	@JsonProperty("url")  
	public void setUrl(String url) {
		this.url = url;
	}

}
