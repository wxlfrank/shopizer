package com.salesmanager.shop.model.order.total;

import java.io.Serializable;
import java.math.BigDecimal;

import com.salesmanager.shop.model.Entity;


public class OrderTotal extends Entity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
    private String text;
	private String code;
	private int order;
	private String module;
	private BigDecimal value;
	
	
	public String getCode() {
		return code;
	}
	public String getModule() {
		return module;
	}
	public int getOrder() {
		return order;
	}
	public String getText() {
		return text;
	}
	public String getTitle() {
		return title;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}


}
