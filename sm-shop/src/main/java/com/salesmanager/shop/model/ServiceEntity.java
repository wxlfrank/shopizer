package com.salesmanager.shop.model;

public abstract class ServiceEntity {
	
	private int status = 0;
	private String message = null;
	
	public String getMessage() {
		return message;
	}
	public int getStatus() {
		return status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
