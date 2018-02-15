package com.salesmanager.shop.model.catalog;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.salesmanager.shop.model.catalog.product.ReadableProduct;

public class ProductList implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productCount;
	private BigDecimal minPrice;
	private BigDecimal maxPrice;
	private List<ReadableProduct> products = new ArrayList<ReadableProduct>();
	public BigDecimal getMaxPrice() {
		return maxPrice;
	}
	public BigDecimal getMinPrice() {
		return minPrice;
	}
	public int getProductCount() {
		return productCount;
	}
	public List<ReadableProduct> getProducts() {
		return products;
	}
	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}
	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public void setProducts(List<ReadableProduct> products) {
		this.products = products;
	}


}
