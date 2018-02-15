package com.salesmanager.shop.model.catalog.product;

import com.salesmanager.shop.model.Entity;

public class PersistableImage extends Entity {
	

	   private static final long serialVersionUID = 1L;
	   private boolean defaultImage;
	   private int imageType = 0;
	   private String imageName = null;

	
	   private byte[] bytes = null;
	   private String contentType = null;
	   
	   
	   /**
	    * An external image url
	    */
	   private String imageUrl = null;
	   


	public byte[] getBytes() {
		return bytes;
	}


	public String getContentType() {
		return contentType;
	}


	public String getImageName() {
		return imageName;
	}


	public int getImageType() {
		return imageType;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public boolean isDefaultImage() {
		return defaultImage;
	}


	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}


	public void setContentType(String contentType) {
		this.contentType = contentType;
	}


	public void setDefaultImage(boolean defaultImage) {
		this.defaultImage = defaultImage;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public void setImageType(int imageType) {
		this.imageType = imageType;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
