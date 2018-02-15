package com.salesmanager.shop.store.model.catalog;

import java.io.Serializable;
import java.util.List;

import com.salesmanager.shop.model.ShopEntity;


public class Attribute extends ShopEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name = null;
	private String type = null;
	private String code = null;
	private List<AttributeValue> values = null;
	private AttributeValue readOnlyValue = null;
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public AttributeValue getReadOnlyValue() {
		return readOnlyValue;
	}
	public String getType() {
		return type;
	}
	


	public List<AttributeValue> getValues() {
		return values;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setReadOnlyValue(AttributeValue readOnlyValue) {
		this.readOnlyValue = readOnlyValue;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setValues(List<AttributeValue> values) {
		this.values = values;
	}



	

}
