package com.salesmanager.core.model.catalog.category;

import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.UniqueConstraint;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.generic.SalesManagerEntity;
import com.salesmanager.core.model.merchant.MerchantStore;

@Entity
@EntityListeners(value = com.salesmanager.core.model.common.audit.AuditListener.class)
@Table(name = "CATEGORY", schema= SchemaConstant.SALESMANAGER_SCHEMA,uniqueConstraints=
    @UniqueConstraint(columnNames = {"MERCHANT_ID", "CODE"}) )


public class Category extends SalesManagerEntity<Long, Category> implements Auditable {
	private static final long serialVersionUID = -846291242449186747L;
	
	@Id
	@Column(name = "CATEGORY_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "CATEGORY_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;

	@Embedded
	private AuditSection auditSection = new AuditSection();

	@Valid
	@OneToMany(mappedBy="category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CategoryDescription> descriptions = new ArrayList<CategoryDescription>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MERCHANT_ID", nullable=false)
	private MerchantStore merchantStore;
	
	@ManyToOne
	@JoinColumn(name = "PARENT_ID")
	private Category parent;
	
	@OneToMany(mappedBy = "parent", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Category> categories = new ArrayList<Category>();
	
	@Column(name = "CATEGORY_IMAGE", length=100)
	private String categoryImage;

	@Column(name = "SORT_ORDER")
	private Integer sortOrder = 0;

	@Column(name = "CATEGORY_STATUS")
	private boolean categoryStatus;

	@Column(name = "VISIBLE")
	private boolean visible;

	@Column(name = "DEPTH")
	private Integer depth;

	@Column(name = "LINEAGE")
	private String lineage;
	
	@Column(name="FEATURED")
	private boolean featured;
	
	@NotEmpty
	@Column(name="CODE", length=100, nullable=false)
	private String code;

	public Category() {
	}

	public Category(MerchantStore store) {
		this.merchantStore = store;
		this.id = 0L;
	}

	@Override
	public AuditSection getAuditSection() {
		return auditSection;
	}
	
	public List<Category> getCategories() {
		return categories;
	}
	
	public String getCategoryImage() {
		return categoryImage;
	}

	public String getCode() {
		return code;
	}
	
	public Integer getDepth() {
		return depth;
	}
	
	public CategoryDescription getDescription() {
		if(descriptions!=null && descriptions.size()>0) {
			return descriptions.iterator().next();
		}
		
		return null;
	}

	public List<CategoryDescription> getDescriptions() {
		return descriptions;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	public String getLineage() {
		return lineage;
	}

	public MerchantStore getMerchantStore() {
		return merchantStore;
	}

	public Category getParent() {
		return parent;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public boolean isCategoryStatus() {
		return categoryStatus;
	}

	public boolean isFeatured() {
		return featured;
	}

	public boolean isVisible() {
		return visible;
	}

	@Override
	public void setAuditSection(AuditSection auditSection) {
		this.auditSection = auditSection;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}

	public void setCategoryStatus(boolean categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public void setDescriptions(List<CategoryDescription> descriptions) {
		this.descriptions = descriptions;
	}
	



	public void setFeatured(boolean featured) {
		this.featured = featured;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public void setLineage(String lineage) {
		this.lineage = lineage;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}
	
	public void setParent(Category parent) {
		this.parent = parent;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}