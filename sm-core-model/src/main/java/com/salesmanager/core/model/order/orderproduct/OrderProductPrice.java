package com.salesmanager.core.model.order.orderproduct;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.salesmanager.core.constants.SchemaConstant;

@Entity
@Table (name="ORDER_PRODUCT_PRICE" , schema=SchemaConstant.SALESMANAGER_SCHEMA)
public class OrderProductPrice implements Serializable {
	private static final long serialVersionUID = 3734737890163564311L;

	@Id
	@Column (name="ORDER_PRODUCT_PRICE_ID")
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT",
		pkColumnValue = "ORDER_PRD_PRICE_ID_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ORDER_PRODUCT_ID", nullable = false)
	private OrderProduct orderProduct;


	@Column(name = "PRODUCT_PRICE_CODE", nullable = false , length=64 )
	private String productPriceCode;

	@Column(name = "PRODUCT_PRICE", nullable = false)
	private BigDecimal productPrice;
	
	@Column(name = "PRODUCT_PRICE_SPECIAL")
	private BigDecimal productPriceSpecial;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name="PRD_PRICE_SPECIAL_ST_DT" , length=0)
	private Date productPriceSpecialStartDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name="PRD_PRICE_SPECIAL_END_DT" , length=0)
	private Date productPriceSpecialEndDate;


	@Column(name = "DEFAULT_PRICE", nullable = false)
	private Boolean defaultPrice;


	@Column(name = "PRODUCT_PRICE_NAME", nullable = true)
	private String productPriceName;
	
	public OrderProductPrice() {
	}

	public Boolean getDefaultPrice() {
		return defaultPrice;
	}

	public Long getId() {
		return id;
	}

	public OrderProduct getOrderProduct() {
		return orderProduct;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public String getProductPriceCode() {
		return productPriceCode;
	}

	public String getProductPriceName() {
		return productPriceName;
	}

	public BigDecimal getProductPriceSpecial() {
		return productPriceSpecial;
	}

	public Date getProductPriceSpecialEndDate() {
		return productPriceSpecialEndDate;
	}

	public Date getProductPriceSpecialStartDate() {
		return productPriceSpecialStartDate;
	}

	public void setDefaultPrice(Boolean defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductPriceCode(String productPriceCode) {
		this.productPriceCode = productPriceCode;
	}

	public void setProductPriceName(String productPriceName) {
		this.productPriceName = productPriceName;
	}

	public void setProductPriceSpecial(BigDecimal productPriceSpecial) {
		this.productPriceSpecial = productPriceSpecial;
	}

	public void setProductPriceSpecialEndDate(Date productPriceSpecialEndDate) {
		this.productPriceSpecialEndDate = productPriceSpecialEndDate;
	}

	public void setProductPriceSpecialStartDate(
			Date productPriceSpecialStartDate) {
		this.productPriceSpecialStartDate = productPriceSpecialStartDate;
	}
}
