package com.salesmanager.shop.model.order;

import java.io.Serializable;

import com.salesmanager.shop.model.Entity;

public class ReadableOrderProductDownload extends Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long orderId;
	
	private String productName;
	private String downloadUrl;
	
	private String fileName;
	
	private int downloadExpiryDays = 0;
	private int downloadCount = 0;
	public int getDownloadCount() {
		return downloadCount;
	}
	public int getDownloadExpiryDays() {
		return downloadExpiryDays;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public String getFileName() {
		return fileName;
	}
	public long getOrderId() {
		return orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}
	public void setDownloadExpiryDays(int downloadExpiryDays) {
		this.downloadExpiryDays = downloadExpiryDays;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}


}
