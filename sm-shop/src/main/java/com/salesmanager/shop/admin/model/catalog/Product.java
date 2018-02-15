package com.salesmanager.shop.admin.model.catalog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.salesmanager.core.model.catalog.product.availability.ProductAvailability;
import com.salesmanager.core.model.catalog.product.description.ProductDescription;
import com.salesmanager.core.model.catalog.product.image.ProductImage;
import com.salesmanager.core.model.catalog.product.price.ProductPrice;

public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4531526676134574984L;

	/**
	 * 
	 */

	//provides wrapping to the main product entity
	@Valid
	private com.salesmanager.core.model.catalog.product.Product product;
	
	@Valid
	private List<ProductDescription> descriptions = new ArrayList<ProductDescription>();
	
	@Valid
	private ProductAvailability availability = null;
	
	@Valid
	private ProductPrice price = null;
	
	private MultipartFile image = null;
	
	private ProductImage productImage = null;
	
	@NotEmpty
	private String productPrice = "0";
	
	private String dateAvailable;

	private ProductDescription description = null;
	
	public ProductAvailability getAvailability() {
		return availability;
	}
	public String getDateAvailable() {
		return dateAvailable;
	}
	public ProductDescription getDescription() {
		return description;
	}
	public List<ProductDescription> getDescriptions() {
		return descriptions;
	}
	
	public MultipartFile getImage() {
		return image;
	}
	public ProductPrice getPrice() {
		return price;
	}
	public com.salesmanager.core.model.catalog.product.Product getProduct() {
		return product;
	}
	public ProductImage getProductImage() {
		return productImage;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setAvailability(ProductAvailability availability) {
		this.availability = availability;
	}
	public void setDateAvailable(String dateAvailable) {
		this.dateAvailable = dateAvailable;
	}
	public void setDescription(ProductDescription description) {
		this.description = description;
	}

	public void setDescriptions(List<ProductDescription> descriptions) {
		this.descriptions = descriptions;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public void setPrice(ProductPrice price) {
		this.price = price;
	}
	public void setProduct(com.salesmanager.core.model.catalog.product.Product product) {
		this.product = product;
	}
	public void setProductImage(ProductImage productImage) {
		this.productImage = productImage;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	





}
