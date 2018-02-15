package com.salesmanager.shop.model.catalog.product;

import java.io.Serializable;
import java.util.List;

import com.salesmanager.shop.model.catalog.category.ReadableCategory;
import com.salesmanager.shop.model.catalog.manufacturer.ReadableManufacturer;
import com.salesmanager.shop.model.catalog.product.attribute.ReadableProductAttribute;


public class ReadableProduct extends ProductEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProductDescription description;
	private String finalPrice = "0";
	private String originalPrice = null;
	private boolean discounted = false;
	private ReadableImage image;
	private List<ReadableImage> images;
	private ReadableManufacturer manufacturer;
	private List<ReadableProductAttribute> attributes;
	private List<ReadableCategory> categories;
	private boolean canBePurchased = false;
	
	//RENTAL
	private RentalOwner owner;
	
		
	public List<ReadableProductAttribute> getAttributes() {
		return attributes;
	}
	public List<ReadableCategory> getCategories() {
		return categories;
	}
	public ProductDescription getDescription() {
		return description;
	}
	public String getFinalPrice() {
		return finalPrice;
	}
	public ReadableImage getImage() {
		return image;
	}
	public List<ReadableImage> getImages() {
		return images;
	}
	public ReadableManufacturer getManufacturer() {
		return manufacturer;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}

	public RentalOwner getOwner() {
		return owner;
	}
	public boolean isCanBePurchased() {
		return canBePurchased;
	}
	public boolean isDiscounted() {
		return discounted;
	}
	public void setAttributes(List<ReadableProductAttribute> attributes) {
		this.attributes = attributes;
	}
	public void setCanBePurchased(boolean canBePurchased) {
		this.canBePurchased = canBePurchased;
	}
	public void setCategories(List<ReadableCategory> categories) {
		this.categories = categories;
	}
	public void setDescription(ProductDescription description) {
		this.description = description;
	}
	public void setDiscounted(boolean discounted) {
		this.discounted = discounted;
	}
	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}
	public void setImage(ReadableImage image) {
		this.image = image;
	}
	public void setImages(List<ReadableImage> images) {
		this.images = images;
	}
	public void setManufacturer(ReadableManufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public void setOwner(RentalOwner owner) {
		this.owner = owner;
	}

}
