package com.salesmanager.shop.admin.model.catalog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import com.salesmanager.core.model.catalog.product.image.ProductImage;
import com.salesmanager.core.model.catalog.product.manufacturer.ManufacturerDescription;


public class Manufacturer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4531526676134574984L;

	/**
	 * 
	 */

	//provides wrapping to the main Manufacturer entity
	private com.salesmanager.core.model.catalog.product.manufacturer.Manufacturer manufacturer;
	
	@Valid
	private List<ManufacturerDescription> descriptions = new ArrayList<ManufacturerDescription>();
	
	private Integer order = new Integer(0);
	private MultipartFile image = null;
	@NotNull
	private String code;
	private ProductImage productImage = null;

	public String getCode() {
		return code;
	}

	public List<ManufacturerDescription> getDescriptions() {
		return descriptions;
	}
	
	
	
	public MultipartFile getImage() {
		return image;
	}

	public com.salesmanager.core.model.catalog.product.manufacturer.Manufacturer getManufacturer() {
		return manufacturer;
	}

	public Integer getOrder() {
		return order;
	}

	public ProductImage getProductImage() {
		return productImage;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDescriptions(List<ManufacturerDescription> descriptions) {
		this.descriptions = descriptions;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public void setManufacturer(
			com.salesmanager.core.model.catalog.product.manufacturer.Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public void setProductImage(ProductImage productImage) {
		this.productImage = productImage;
	}
	
	
	

}
