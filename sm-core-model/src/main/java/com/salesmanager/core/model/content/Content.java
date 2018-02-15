package com.salesmanager.core.model.content;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
import com.salesmanager.core.model.common.audit.AuditListener;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.generic.SalesManagerEntity;
import com.salesmanager.core.model.merchant.MerchantStore;


@Entity
@EntityListeners(value = AuditListener.class)
@Table(name = "CONTENT", schema= SchemaConstant.SALESMANAGER_SCHEMA,uniqueConstraints=
    @UniqueConstraint(columnNames = {"MERCHANT_ID", "CODE"}) )
public class Content extends SalesManagerEntity<Long, Content> implements Serializable {

	

	private static final long serialVersionUID = 1772757159185494620L;
	
	@Id
	@Column(name = "CONTENT_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "CONTENT_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;
	
	@Embedded
	private AuditSection auditSection = new AuditSection();
	
	@Valid
	@OneToMany(mappedBy="content", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ContentDescription> descriptions = new ArrayList<ContentDescription>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MERCHANT_ID", nullable=false)
	private MerchantStore merchantStore;
	
	@NotEmpty
	@Column(name="CODE", length=100, nullable=false)
	private String code;
	
	@Column(name = "VISIBLE")
	private boolean visible;
	
	@Column(name = "LINK_TO_MENU")
	private boolean linkToMenu;

	@Column(name = "CONTENT_POSITION", length=10, nullable=true)
	@Enumerated(value = EnumType.STRING)
	private ContentPosition contentPosition;
	
	//Used for grouping
	//BOX, SECTION, PAGE
	@Column(name = "CONTENT_TYPE", length=10, nullable=true)
	@Enumerated(value = EnumType.STRING)
	private ContentType contentType; 
	
	@Column(name = "SORT_ORDER")
	private Integer sortOrder = 0;
	
	//A page can contain one product listing
	@Column(name = "PRODUCT_GROUP", nullable = true)
	private String productGroup;

	public AuditSection getAuditSection() {
		return auditSection;
	}

	public String getCode() {
		return code;
	}

	public ContentPosition getContentPosition() {
		return contentPosition;
	}

	public ContentType getContentType() {
		return contentType;
	}

	public ContentDescription getDescription() {
		
		if(this.getDescriptions()!=null && this.getDescriptions().size()>0) {
			return this.getDescriptions().get(0);
		}
		
		return null;
		
	}

	public List<ContentDescription> getDescriptions() {
		return descriptions;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	public MerchantStore getMerchantStore() {
		return merchantStore;
	}

	public String getProductGroup() {
		return productGroup;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public boolean isLinkToMenu() {
		return linkToMenu;
	}

	public boolean isVisible() {
		return visible;
	}



	public void setAuditSection(AuditSection auditSection) {
		this.auditSection = auditSection;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setContentPosition(ContentPosition contentPosition) {
		this.contentPosition = contentPosition;
	}

	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}
	
	public void setDescriptions(List<ContentDescription> descriptions) {
		this.descriptions = descriptions;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
		
	}

	public void setLinkToMenu(boolean linkToMenu) {
		this.linkToMenu = linkToMenu;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	


	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}