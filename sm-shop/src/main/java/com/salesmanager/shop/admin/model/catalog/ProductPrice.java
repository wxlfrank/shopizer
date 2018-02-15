package com.salesmanager.shop.admin.model.catalog;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.salesmanager.core.model.catalog.product.availability.ProductAvailability;
import com.salesmanager.core.model.catalog.product.price.ProductPriceDescription;

public class ProductPrice {
	
	@Valid
	private com.salesmanager.core.model.catalog.product.price.ProductPrice price = null;
	@Valid
	private List <ProductPriceDescription> descriptions = new ArrayList<ProductPriceDescription>();
	private String priceText;
	private String specialPriceText;
	private ProductAvailability productAvailability;
	
	
	//cannot convert in this object to date ??? needs to use a string, parse, bla bla
	private String productPriceSpecialStartDate;
	private String productPriceSpecialEndDate;
	
	private com.salesmanager.core.model.catalog.product.Product product;
	
	
	
	
	
	public List <ProductPriceDescription> getDescriptions() {
		return descriptions;
	}
	public com.salesmanager.core.model.catalog.product.price.ProductPrice getPrice() {
		return price;
	}
	public String getPriceText() {
		return priceText;
	}
	public com.salesmanager.core.model.catalog.product.Product getProduct() {
		return product;
	}
	public ProductAvailability getProductAvailability() {
		return productAvailability;
	}
	public String getProductPriceSpecialEndDate() {
		return productPriceSpecialEndDate;
	}
	public String getProductPriceSpecialStartDate() {
		return productPriceSpecialStartDate;
	}
	public String getSpecialPriceText() {
		return specialPriceText;
	}
	public void setDescriptions(List <ProductPriceDescription> descriptions) {
		this.descriptions = descriptions;
	}
	public void setPrice(com.salesmanager.core.model.catalog.product.price.ProductPrice price) {
		this.price = price;
	}

	public void setPriceText(String priceText) {
		this.priceText = priceText;
	}
	public void setProduct(com.salesmanager.core.model.catalog.product.Product product) {
		this.product = product;
	}
	public void setProductAvailability(ProductAvailability productAvailability) {
		this.productAvailability = productAvailability;
	}
	public void setProductPriceSpecialEndDate(String productPriceSpecialEndDate) {
		this.productPriceSpecialEndDate = productPriceSpecialEndDate;
	}
	public void setProductPriceSpecialStartDate(
			String productPriceSpecialStartDate) {
		this.productPriceSpecialStartDate = productPriceSpecialStartDate;
	}
	public void setSpecialPriceText(String specialPriceText) {
		this.specialPriceText = specialPriceText;
	}

}
