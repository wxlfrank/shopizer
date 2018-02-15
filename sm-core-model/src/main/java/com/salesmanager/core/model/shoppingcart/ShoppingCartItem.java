package com.salesmanager.core.model.shoppingcart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.catalog.product.Product;
import com.salesmanager.core.model.catalog.product.price.FinalPrice;
import com.salesmanager.core.model.common.audit.AuditListener;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.generic.SalesManagerEntity;


@Entity
@EntityListeners(value = AuditListener.class)
@Table(name = "SHOPPING_CART_ITEM", schema=SchemaConstant.SALESMANAGER_SCHEMA)
public class ShoppingCartItem extends SalesManagerEntity<Long, ShoppingCartItem> implements Auditable, Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SHP_CART_ITEM_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "SHP_CRT_ITM_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;
	
	@ManyToOne(targetEntity = ShoppingCart.class)
	@JoinColumn(name = "SHP_CART_ID", nullable = false)
	private ShoppingCart shoppingCart;

	@Column(name="QUANTITY")
	private Integer quantity = new Integer(1);


	@Embedded
	private AuditSection auditSection = new AuditSection();
	
	@Column(name="PRODUCT_ID", nullable=false)
	private Long productId;
	
	@Transient
	private boolean productVirtual;

	//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval=true, mappedBy = "shoppingCartItem")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "shoppingCartItem")
	private Set<ShoppingCartAttributeItem> attributes = new HashSet<ShoppingCartAttributeItem>();
	
	@Transient
	private BigDecimal itemPrice;//item final price including all rebates
	
	@Transient
	private BigDecimal subTotal;//item final price * quantity
	
	@Transient
	private FinalPrice finalPrice;//contains price details (raw prices)
	

	@Transient
	private Product product;
	
	@Transient
	private boolean obsolete = false;




	public ShoppingCartItem() {
		
	}
	
	public ShoppingCartItem(Product product) {
		this.product = product;
		this.productId = product.getId();
		this.quantity = 1;

	}
	
	public ShoppingCartItem(ShoppingCart shoppingCart, Product product) {
		this.product = product;
		this.productId = product.getId();
		this.quantity = 1;
		this.shoppingCart = shoppingCart;
		
	}

	public void addAttributes(ShoppingCartAttributeItem shoppingCartAttributeItem)
	{
	    this.attributes.add(shoppingCartAttributeItem);
	}

	public Set<ShoppingCartAttributeItem> getAttributes() {
		return attributes;
	}

	@Override
	public AuditSection getAuditSection() {
		return auditSection;
	}

	public FinalPrice getFinalPrice() {
		return finalPrice;
	}



	@Override
	public Long getId() {
		return id;
	}

	public BigDecimal getItemPrice() {
		return itemPrice;
	}

	public Product getProduct() {
		return product;
	}

	public Long getProductId() {
		return productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}



	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public boolean isObsolete() {
		return obsolete;
	}

	public boolean isProductVirtual() {
		return productVirtual;
	}

	public void removeAllAttributes(){
		this.attributes.removeAll(Collections.EMPTY_SET);
	}

	public void removeAttributes(ShoppingCartAttributeItem shoppingCartAttributeItem)
	{
	    this.attributes.remove(shoppingCartAttributeItem);
	}

	public void setAttributes(Set<ShoppingCartAttributeItem> attributes) {
/*	    if(attributes==null) {
	    	this.attributes = null;
	    	return;
	    }
		this.attributes.clear();
	    this.attributes.addAll( attributes );*/
		this.attributes = attributes;
	}
	
	@Override
	public void setAuditSection(AuditSection audit) {
		this.auditSection = audit;
		
	}
	
	public void setFinalPrice(FinalPrice finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
		
	}

	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	public void setObsolete(boolean obsolete) {
		this.obsolete = obsolete;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	public void setProductVirtual(boolean productVirtual) {
		this.productVirtual = productVirtual;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

}
