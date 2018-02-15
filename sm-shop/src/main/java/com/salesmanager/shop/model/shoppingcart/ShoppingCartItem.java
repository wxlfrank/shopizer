package com.salesmanager.shop.model.shoppingcart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.salesmanager.shop.model.ShopEntity;


public class ShoppingCartItem extends ShopEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String price;
	private String image;
	private BigDecimal productPrice;
	private int quantity;
	private long productId;
	private String productCode;
	private String code;//shopping cart code
	private boolean productVirtual;
	
	private String subTotal;
	
	private List<ShoppingCartAttribute> shoppingCartAttributes;
	
	public String getCode() {
		return code;
	}
	public String getImage() {
		return image;
	}
	public String getName() {
		return name;
	}
	public String getPrice() {
		return price;
	}
	public String getProductCode() {
		return productCode;
	}
	public long getProductId() {
		return productId;
	}


	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public List<ShoppingCartAttribute> getShoppingCartAttributes() {
		return shoppingCartAttributes;
	}
	public String getSubTotal() {
		return subTotal;
	}
	public boolean isProductVirtual() {
		return productVirtual;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public void setProductVirtual(boolean productVirtual) {
		this.productVirtual = productVirtual;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setShoppingCartAttributes(List<ShoppingCartAttribute> shoppingCartAttributes) {
		this.shoppingCartAttributes = shoppingCartAttributes;
	}
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}


}
