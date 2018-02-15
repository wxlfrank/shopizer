package com.salesmanager.shop.model.catalog.product;

import java.io.Serializable;
import java.math.BigDecimal;

import com.salesmanager.core.model.catalog.product.ProductCondition;
import com.salesmanager.core.model.catalog.product.RentalStatus;


/**
 * A product entity is used by services API
 * to populate or retrieve a Product entity
 * @author Carl Samson
 *
 */
public class ProductEntity extends Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal price;
	private int quantity = 0;
	private String sku;
	private boolean productShipeable = false;
	private boolean preOrder = false;
	private boolean productVirtual = false;
	private int quantityOrderMaximum =-1;//default unlimited
	private int quantityOrderMinimum = 1;//default 1
	private boolean productIsFree;
	private boolean available;
	private boolean visible = true;
	private BigDecimal productLength;
	private BigDecimal productWidth;
	private BigDecimal productHeight;
	private BigDecimal productWeight;
	private Double rating = 0D;
	private int ratingCount;
	private int sortOrder;
	private String dateAvailable;
	private String refSku;
	private ProductCondition condition;
	
	/**
	 * RENTAL additional fields
	 * @return
	 */

	private int rentalDuration;
	private int rentalPeriod;
	private RentalStatus rentalStatus;
	
	public ProductCondition getCondition() {
		return condition;
	}
	public String getDateAvailable() {
		return dateAvailable;
	}

	/**
	 * End RENTAL fields
	 * @return
	 */
	
	
	public BigDecimal getPrice() {
		return price;
	}
	public BigDecimal getProductHeight() {
		return productHeight;
	}
	public BigDecimal getProductLength() {
		return productLength;
	}
	public BigDecimal getProductWeight() {
		return productWeight;
	}
	public BigDecimal getProductWidth() {
		return productWidth;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getQuantityOrderMaximum() {
		return quantityOrderMaximum;
	}
	public int getQuantityOrderMinimum() {
		return quantityOrderMinimum;
	}
	public Double getRating() {
		return rating;
	}
	public int getRatingCount() {
		return ratingCount;
	}
	public String getRefSku() {
		return refSku;
	}
	public int getRentalDuration() {
		return rentalDuration;
	}
	public int getRentalPeriod() {
		return rentalPeriod;
	}
	public RentalStatus getRentalStatus() {
		return rentalStatus;
	}
	public String getSku() {
		return sku;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public boolean isAvailable() {
		return available;
	}
	public boolean isPreOrder() {
		return preOrder;
	}
	public boolean isProductIsFree() {
		return productIsFree;
	}
	public boolean isProductShipeable() {
		return productShipeable;
	}
	public boolean isProductVirtual() {
		return productVirtual;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void setCondition(ProductCondition condition) {
		this.condition = condition;
	}
	public void setDateAvailable(String dateAvailable) {
		this.dateAvailable = dateAvailable;
	}
	public void setPreOrder(boolean preOrder) {
		this.preOrder = preOrder;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setProductHeight(BigDecimal productHeight) {
		this.productHeight = productHeight;
	}
	public void setProductIsFree(boolean productIsFree) {
		this.productIsFree = productIsFree;
	}
	public void setProductLength(BigDecimal productLength) {
		this.productLength = productLength;
	}
	public void setProductShipeable(boolean productShipeable) {
		this.productShipeable = productShipeable;
	}
	public void setProductVirtual(boolean productVirtual) {
		this.productVirtual = productVirtual;
	}
	public void setProductWeight(BigDecimal productWeight) {
		this.productWeight = productWeight;
	}
	public void setProductWidth(BigDecimal productWidth) {
		this.productWidth = productWidth;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setQuantityOrderMaximum(int quantityOrderMaximum) {
		this.quantityOrderMaximum = quantityOrderMaximum;
	}
	public void setQuantityOrderMinimum(int quantityOrderMinimum) {
		this.quantityOrderMinimum = quantityOrderMinimum;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}
	public void setRefSku(String refSku) {
		this.refSku = refSku;
	}
	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	public void setRentalPeriod(int rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}
	public void setRentalStatus(RentalStatus rentalStatus) {
		this.rentalStatus = rentalStatus;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}


}
