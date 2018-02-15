package com.salesmanager.core.model.catalog.product.price;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Transient entity used to display
 * different price information in the catalogue
 * @author Carl Samson
 *
 */
public class FinalPrice implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal discountedPrice = null;//final price if a discount is applied
	private BigDecimal originalPrice = null;//original price
	private BigDecimal finalPrice = null;//final price discount or not
	private boolean discounted = false;
	private int discountPercent = 0;
	
	private Date discountEndDate = null;
	
	private boolean defaultPrice;
	private ProductPrice productPrice;
	List<FinalPrice> additionalPrices;

	public List<FinalPrice> getAdditionalPrices() {
		return additionalPrices;
	}

	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}

	public Date getDiscountEndDate() {
		return discountEndDate;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}



	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public ProductPrice getProductPrice() {
		return productPrice;
	}

	public boolean isDefaultPrice() {
		return defaultPrice;
	}

	public boolean isDiscounted() {
		return discounted;
	}

	public void setAdditionalPrices(List<FinalPrice> additionalPrices) {
		this.additionalPrices = additionalPrices;
	}

	public void setDefaultPrice(boolean defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public void setDiscounted(boolean discounted) {
		this.discounted = discounted;
	}


	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public void setDiscountEndDate(Date discountEndDate) {
		this.discountEndDate = discountEndDate;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public void setProductPrice(ProductPrice productPrice) {
		this.productPrice = productPrice;
	}

}
