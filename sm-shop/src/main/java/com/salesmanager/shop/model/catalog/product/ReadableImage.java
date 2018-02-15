package com.salesmanager.shop.model.catalog.product;

import java.io.Serializable;

import com.salesmanager.shop.model.Entity;

public class ReadableImage extends Entity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String imageName;
	private String imageUrl;
	private String externalUrl;
	private String videoUrl;
	private int imageType;
	private boolean defaultImage;
	public String getExternalUrl() {
		return externalUrl;
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
	public String getVideoUrl() {
		return videoUrl;
	}
	public boolean isDefaultImage() {
		return defaultImage;
	}
	public void setDefaultImage(boolean defaultImage) {
		this.defaultImage = defaultImage;
	}
	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
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
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
