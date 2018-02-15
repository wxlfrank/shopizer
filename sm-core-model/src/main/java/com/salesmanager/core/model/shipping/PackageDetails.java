package com.salesmanager.core.model.shipping;

public class PackageDetails {
	
	private double shippingWeight;
	private double shippingMaxWeight;
	private double shippingLength;
	private double shippingHeight;
	private double shippingWidth;
	private int shippingQuantity;
	private int treshold;
	
	private String itemName = "";
	
	
	public String getItemName() {
		return itemName;
	}
	public double getShippingHeight() {
		return shippingHeight;
	}
	public double getShippingLength() {
		return shippingLength;
	}
	public double getShippingMaxWeight() {
		return shippingMaxWeight;
	}
	public int getShippingQuantity() {
		return shippingQuantity;
	}
	public double getShippingWeight() {
		return shippingWeight;
	}
	public double getShippingWidth() {
		return shippingWidth;
	}
	public int getTreshold() {
		return treshold;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setShippingHeight(double shippingHeight) {
		this.shippingHeight = shippingHeight;
	}
	public void setShippingLength(double shippingLength) {
		this.shippingLength = shippingLength;
	}
	public void setShippingMaxWeight(double shippingMaxWeight) {
		this.shippingMaxWeight = shippingMaxWeight;
	}
	public void setShippingQuantity(int shippingQuantity) {
		this.shippingQuantity = shippingQuantity;
	}
	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public void setShippingWidth(double shippingWidth) {
		this.shippingWidth = shippingWidth;
	}
	public void setTreshold(int treshold) {
		this.treshold = treshold;
	}

}
