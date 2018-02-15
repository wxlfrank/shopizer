package com.salesmanager.core.model.catalog.product;

import java.util.List;

import com.salesmanager.core.model.catalog.product.attribute.AttributeCriteria;
import com.salesmanager.core.model.common.Criteria;

public class ProductCriteria extends Criteria {
	
	
	private String productName;
	private List<AttributeCriteria> attributeCriteria;

	
	private Boolean available = null;
	
	private List<Long> categoryIds;
	private List<String> availabilities;
	private List<Long> productIds;
	
	private String status;
	
	private Long manufacturerId = null;
	
	private Long ownerId = null;

	public List<AttributeCriteria> getAttributeCriteria() {
		return attributeCriteria;
	}

	public List<String> getAvailabilities() {
		return availabilities;
	}


	public Boolean getAvailable() {
		return available;
	}

	public List<Long> getCategoryIds() {
		return categoryIds;
	}

	public Long getManufacturerId() {
		return manufacturerId;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public List<Long> getProductIds() {
		return productIds;
	}

	public String getProductName() {
		return productName;
	}

	public String getStatus() {
		return status;
	}

	public void setAttributeCriteria(List<AttributeCriteria> attributeCriteria) {
		this.attributeCriteria = attributeCriteria;
	}

	public void setAvailabilities(List<String> availabilities) {
		this.availabilities = availabilities;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public void setCategoryIds(List<Long> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public void setManufacturerId(Long manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public void setProductIds(List<Long> productIds) {
		this.productIds = productIds;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setStatus(String status) {
		this.status = status;
	}



}
