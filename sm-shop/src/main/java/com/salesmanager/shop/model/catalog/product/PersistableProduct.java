package com.salesmanager.shop.model.catalog.product;

import java.io.Serializable;
import java.util.List;

import com.salesmanager.shop.model.catalog.category.Category;
import com.salesmanager.shop.model.catalog.manufacturer.Manufacturer;
import com.salesmanager.shop.model.catalog.product.attribute.PersistableProductAttribute;



public class PersistableProduct extends ProductEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ProductDescription> descriptions;//always persist descriptions
	private List<PersistableProductAttribute> attributes;//persist attribute and save reference
	private List<PersistableImage> images;//persist images and save reference
	private List<PersistableProductPrice> productPrices;//to be set when using discounts
	private List<Category> categories;//save reference
	private List<RelatedProduct> relatedProducts;//save reference
	private Manufacturer manufacturer;//save reference
	
	//RENTAL
	private RentalOwner owner;
	
	public List<PersistableProductAttribute> getAttributes() {
		return attributes;
	}
	public List<Category> getCategories() {
		return categories;
	}

	public List<ProductDescription> getDescriptions() {
		return descriptions;
	}
	public List<PersistableImage> getImages() {
		return images;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public RentalOwner getOwner() {
		return owner;
	}
	public List<PersistableProductPrice> getProductPrices() {
		return productPrices;
	}
	public List<RelatedProduct> getRelatedProducts() {
		return relatedProducts;
	}
	public void setAttributes(List<PersistableProductAttribute> attributes) {
		this.attributes = attributes;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public void setDescriptions(List<ProductDescription> descriptions) {
		this.descriptions = descriptions;
	}
	public void setImages(List<PersistableImage> images) {
		this.images = images;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setOwner(RentalOwner owner) {
		this.owner = owner;
	}
	public void setProductPrices(List<PersistableProductPrice> productPrices) {
		this.productPrices = productPrices;
	}
	public void setRelatedProducts(List<RelatedProduct> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}

}
