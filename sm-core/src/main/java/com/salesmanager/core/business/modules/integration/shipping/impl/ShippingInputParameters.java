package com.salesmanager.core.business.modules.integration.shipping.impl;

public class ShippingInputParameters {
	
	private String moduleName;
	private long weight;
	private long volume;
	private String country;
	private String province;
	private long distance;
	private long size;
	private int price;//integer should be rounded from BigBecimal
	private String priceQuote;
	
	public String getCountry() {
		return country;
	}
	public long getDistance() {
		return distance;
	}
	public String getModuleName() {
		return moduleName;
	}
	public int getPrice() {
		return price;
	}
	public String getPriceQuote() {
		return priceQuote;
	}
	public String getProvince() {
		return province;
	}
	public long getSize() {
		return size;
	}
	public long getVolume() {
		return volume;
	}
	public long getWeight() {
		return weight;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setDistance(long distance) {
		this.distance = distance;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPriceQuote(String priceQuote) {
		this.priceQuote = priceQuote;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public void setSize(long size) {
		this.size = size;
	}
	public void setVolume(long volume) {
		this.volume = volume;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" weight : ").append(this.getWeight());
		sb.append(" volume : ").append(this.getVolume())
		.append(" size : ").append(this.getSize())
		.append(" distance : ").append(this.getDistance())
		.append(" province : ").append(this.getProvince())
		.append(" price : ").append(this.getPrice())
		.append(" country : ").append(this.getCountry());
		return sb.toString();	
	}


}
