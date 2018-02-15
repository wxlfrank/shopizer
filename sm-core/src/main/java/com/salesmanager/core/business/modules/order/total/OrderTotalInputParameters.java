package com.salesmanager.core.business.modules.order.total;

/**
 * Input itm to be added to drules engine
 * @author carlsamson
 *
 */
public class OrderTotalInputParameters {
	
	private Double discount;//output value set by engine
	private String totalCode;//output value set by engine
	
	//input parameters
	private long productId;
	private String itemManufacturerCode;
	private String itemCategoryCode;
	private String shippingMethod;
	
	//might add variation based on other objects such as Customer
	
	public Double getDiscount() {
		return discount;
	}
	public String getItemCategoryCode() {
		return itemCategoryCode;
	}
	public String getItemManufacturerCode() {
		return itemManufacturerCode;
	}
	public long getProductId() {
		return productId;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public String getTotalCode() {
		return totalCode;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public void setItemCategoryCode(String itemCategoryCode) {
		this.itemCategoryCode = itemCategoryCode;
	}
	public void setItemManufacturerCode(String itemManufacturerCode) {
		this.itemManufacturerCode = itemManufacturerCode;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	public void setTotalCode(String totalCode) {
		this.totalCode = totalCode;
	}

	


}
