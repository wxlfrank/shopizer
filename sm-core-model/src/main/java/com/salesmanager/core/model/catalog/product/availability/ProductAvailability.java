package com.salesmanager.core.model.catalog.product.availability;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.catalog.product.Product;
import com.salesmanager.core.model.catalog.product.price.ProductPrice;
import com.salesmanager.core.model.generic.SalesManagerEntity;
import com.salesmanager.core.utils.CloneUtils;


@Entity
@Table(name="PRODUCT_AVAILABILITY", schema=SchemaConstant.SALESMANAGER_SCHEMA)
public class ProductAvailability extends SalesManagerEntity<Long, ProductAvailability> {
	private static final long serialVersionUID = 7449264635180797762L;

	@Id
	@Column(name = "PRODUCT_AVAIL_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "PRODUCT_AVAIL_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;
	

	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "PRODUCT_ID", nullable = false)
	private Product product;
	
	@NotNull
	@Column(name="QUANTITY")
	private Integer productQuantity = 0;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_AVAILABLE")
	private Date productDateAvailable;
	
	@Column(name="REGION")
	private String region = SchemaConstant.ALL_REGIONS;
	
	@Column(name="REGION_VARIANT")
	private String regionVariant;
	
	@Column(name="STATUS")
	private boolean productStatus = true;
	
	@Column(name="FREE_SHIPPING")
	private boolean productIsAlwaysFreeShipping;
	
	@Column(name="QUANTITY_ORD_MIN")
	private Integer productQuantityOrderMin = 0;
	
	@Column(name="QUANTITY_ORD_MAX")
	private Integer productQuantityOrderMax = 0;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="productAvailability", cascade = CascadeType.ALL)
	private Set<ProductPrice> prices = new HashSet<ProductPrice>();
	
	public ProductAvailability() {
	}
	
	@Transient
	public ProductPrice defaultPrice() {
		
		for(ProductPrice price : prices) {
			if(price.isDefaultPrice()) {
				return price;
			}
		}
		return new ProductPrice();
	}

	@Override
	public Long getId() {
		return id;
	}

	public Set<ProductPrice> getPrices() {
		return prices;
	}

	public Product getProduct() {
		return product;
	}

	public Date getProductDateAvailable() {
		return CloneUtils.clone(productDateAvailable);
	}

	public boolean getProductIsAlwaysFreeShipping() {
		return productIsAlwaysFreeShipping;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public Integer getProductQuantityOrderMax() {
		return productQuantityOrderMax;
	}

	public Integer getProductQuantityOrderMin() {
		return productQuantityOrderMin;
	}

	public boolean getProductStatus() {
		return productStatus;
	}

	public String getRegion() {
		return region;
	}

	public String getRegionVariant() {
		return regionVariant;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public void setPrices(Set<ProductPrice> prices) {
		this.prices = prices;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setProductDateAvailable(Date productDateAvailable) {
		this.productDateAvailable = CloneUtils.clone(productDateAvailable);
	}

	public void setProductIsAlwaysFreeShipping(boolean productIsAlwaysFreeShipping) {
		this.productIsAlwaysFreeShipping = productIsAlwaysFreeShipping;
	}


	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public void setProductQuantityOrderMax(Integer productQuantityOrderMax) {
		this.productQuantityOrderMax = productQuantityOrderMax;
	}

	public void setProductQuantityOrderMin(Integer productQuantityOrderMin) {
		this.productQuantityOrderMin = productQuantityOrderMin;
	}

	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}



	public void setRegion(String region) {
		this.region = region;
	}

	public void setRegionVariant(String regionVariant) {
		this.regionVariant = regionVariant;
	}
	
}
