package com.salesmanager.core.model.catalog.product.attribute;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.catalog.product.Product;
import com.salesmanager.core.model.generic.SalesManagerEntity;

@Entity
@Table(name="PRODUCT_ATTRIBUTE", schema=SchemaConstant.SALESMANAGER_SCHEMA,
	uniqueConstraints={
		@UniqueConstraint(columnNames={
				"OPTION_ID",
				"OPTION_VALUE_ID",
				"PRODUCT_ID"
			})
	}
)
public class ProductAttribute extends SalesManagerEntity<Long, ProductAttribute> {
	private static final long serialVersionUID = -6537491946539803265L;
	
	@Id
	@Column(name = "PRODUCT_ATTRIBUTE_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "PRODUCT_ATTR_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;

	
	@Column(name="PRODUCT_ATRIBUTE_PRICE")
	private BigDecimal productAttributePrice;


	@Column(name="PRODUCT_ATTRIBUTE_SORT_ORD")
	private Integer productOptionSortOrder;
	
	@Column(name="PRODUCT_ATTRIBUTE_FREE")
	private boolean productAttributeIsFree;
	

	@Column(name="PRODUCT_ATTRIBUTE_WEIGHT")
	private BigDecimal productAttributeWeight;
	
	@Column(name="PRODUCT_ATTRIBUTE_DEFAULT")
	private boolean attributeDefault=false;
	
	@Column(name="PRODUCT_ATTRIBUTE_REQUIRED")
	private boolean attributeRequired=false;
	
	/**
	 * a read only attribute is considered as a core attribute addition
	 */
	@Column(name="PRODUCT_ATTRIBUTE_FOR_DISP")
	private boolean attributeDisplayOnly=false;
	

	@Column(name="PRODUCT_ATTRIBUTE_DISCOUNTED")
	private boolean attributeDiscounted=false;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="OPTION_ID", nullable=false)
	private ProductOption productOption;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="OPTION_VALUE_ID", nullable=false)
	private ProductOptionValue productOptionValue;
	
	
	/**
	 * This transient object property
	 * is a utility used only to submit from a free text
	 */
	@Transient
	private String attributePrice = "0";
	
	
	/**
	 * This transient object property
	 * is a utility used only to submit from a free text
	 */
	@Transient
	private String attributeSortOrder = "0";
	


	/**
	 * This transient object property
	 * is a utility used only to submit from a free text
	 */
	@Transient
	private String attributeAdditionalWeight = "0";
	
	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "PRODUCT_ID", nullable = false)
	private Product product;

	public ProductAttribute() {
	}

	public String getAttributeAdditionalWeight() {
		return attributeAdditionalWeight;
	}
	
	public boolean getAttributeDefault() {
		return attributeDefault;
	}

	public boolean getAttributeDiscounted() {
		return attributeDiscounted;
	}

	public boolean getAttributeDisplayOnly() {
		return attributeDisplayOnly;
	}



	public String getAttributePrice() {
		return attributePrice;
	}

	public boolean getAttributeRequired() {
		return attributeRequired;
	}

	public String getAttributeSortOrder() {
		return attributeSortOrder;
	}

	@Override
	public Long getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public boolean getProductAttributeIsFree() {
		return productAttributeIsFree;
	}

	public BigDecimal getProductAttributePrice() {
		return productAttributePrice;
	}

	public BigDecimal getProductAttributeWeight() {
		return productAttributeWeight;
	}

	public ProductOption getProductOption() {
		return productOption;
	}

	public Integer getProductOptionSortOrder() {
		return productOptionSortOrder;
	}

	public ProductOptionValue getProductOptionValue() {
		return productOptionValue;
	}

	public void setAttributeAdditionalWeight(String attributeAdditionalWeight) {
		this.attributeAdditionalWeight = attributeAdditionalWeight;
	}

	public void setAttributeDefault(boolean attributeDefault) {
		this.attributeDefault = attributeDefault;
	}

	public void setAttributeDiscounted(boolean attributeDiscounted) {
		this.attributeDiscounted = attributeDiscounted;
	}

	public void setAttributeDisplayOnly(boolean attributeDisplayOnly) {
		this.attributeDisplayOnly = attributeDisplayOnly;
	}

	public void setAttributePrice(String attributePrice) {
		this.attributePrice = attributePrice;
	}

	public void setAttributeRequired(boolean attributeRequired) {
		this.attributeRequired = attributeRequired;
	}

	public void setAttributeSortOrder(String attributeSortOrder) {
		this.attributeSortOrder = attributeSortOrder;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	public void setProductAttributeIsFree(boolean productAttributeIsFree) {
		this.productAttributeIsFree = productAttributeIsFree;
	}

	public void setProductAttributePrice(BigDecimal productAttributePrice) {
		this.productAttributePrice = productAttributePrice;
	}

	public void setProductAttributeWeight(BigDecimal productAttributeWeight) {
		this.productAttributeWeight = productAttributeWeight;
	}

	public void setProductOption(ProductOption productOption) {
		this.productOption = productOption;
	}
	
	public void setProductOptionSortOrder(Integer productOptionSortOrder) {
		this.productOptionSortOrder = productOptionSortOrder;
	}

	public void setProductOptionValue(ProductOptionValue productOptionValue) {
		this.productOptionValue = productOptionValue;
	}



}
