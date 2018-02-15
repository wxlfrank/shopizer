package com.salesmanager.core.model.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.Valid;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.catalog.product.review.ProductReview;
import com.salesmanager.core.model.common.Billing;
import com.salesmanager.core.model.common.Delivery;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.customer.attribute.CustomerAttribute;
import com.salesmanager.core.model.generic.SalesManagerEntity;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.core.model.user.Group;
import com.salesmanager.core.utils.CloneUtils;

@Entity
@Table(name = "CUSTOMER", schema=SchemaConstant.SALESMANAGER_SCHEMA)
public class Customer extends SalesManagerEntity<Long, Customer> implements Auditable {
	private static final long serialVersionUID = -6966934116557219193L;
	
	@Id
	@Column(name = "CUSTOMER_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT",
	pkColumnValue = "CUSTOMER_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;
	
	@Embedded
	private AuditSection auditSection = new AuditSection();
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "customer")
	private Set<CustomerAttribute> attributes = new HashSet<CustomerAttribute>();
	
	@Column(name="CUSTOMER_GENDER", length=1, nullable=true)
	@Enumerated(value = EnumType.STRING)
	private CustomerGender gender;


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CUSTOMER_DOB")
	private Date dateOfBirth;
	
	@Email
	@NotEmpty
	@Column(name="CUSTOMER_EMAIL_ADDRESS", length=96, nullable=false)
	private String emailAddress;
	
	@Column(name="CUSTOMER_NICK", length=96)
	private String nick;

	@Column(name="CUSTOMER_COMPANY", length=100)
	private String company;
	

	@Column(name="CUSTOMER_PASSWORD", length=60)
	private String password;

	
	@Column(name="CUSTOMER_ANONYMOUS")
	private boolean anonymous;
	
	@Column(name = "REVIEW_AVG")
	private BigDecimal customerReviewAvg;

	@Column(name = "REVIEW_COUNT")
	private Integer customerReviewCount;
	
	@Column(name="PROVIDER")
	private String provider;
	

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Language.class)
	@JoinColumn(name = "LANGUAGE_ID", nullable=false)
	private Language defaultLanguage;
	


	@OneToMany(mappedBy = "customer", targetEntity = ProductReview.class)
	private List<ProductReview> reviews = new ArrayList<ProductReview>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MERCHANT_ID", nullable=false)
	private MerchantStore merchantStore;
	

	@Embedded
	private Delivery delivery = null;
	
	@Valid
	@Embedded
	private Billing billing = null;
	
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.REFRESH})
	@JoinTable(name = "CUSTOMER_GROUP", schema=SchemaConstant.SALESMANAGER_SCHEMA, joinColumns = { 
			@JoinColumn(name = "CUSTOMER_ID", nullable = false, updatable = false) }
			, 
			inverseJoinColumns = { @JoinColumn(name = "GROUP_ID", 
					nullable = false, updatable = false) }
	)
	@Cascade({
		org.hibernate.annotations.CascadeType.DETACH,
		org.hibernate.annotations.CascadeType.LOCK,
		org.hibernate.annotations.CascadeType.REFRESH,
		org.hibernate.annotations.CascadeType.REPLICATE
		
	})
	private List<Group> groups = new ArrayList<Group>();
	
	@Transient
	private String showCustomerStateList;
	
	@Transient
	private String showBillingStateList;
	
	@Transient
	private String showDeliveryStateList;
	
	
	public Customer() {
	}

	public Set<CustomerAttribute> getAttributes() {
		return attributes;
	}

	@Override
	public AuditSection getAuditSection() {
		return auditSection;
	}



	public Billing getBilling() {
		return billing;
	}

	public String getCompany() {
		return company;
	}

	public BigDecimal getCustomerReviewAvg() {
		return customerReviewAvg;
	}

	public Integer getCustomerReviewCount() {
		return customerReviewCount;
	}

	public Date getDateOfBirth() {
		return CloneUtils.clone(dateOfBirth);
	}

	public Language getDefaultLanguage() {
		return defaultLanguage;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public String getEmailAddress() {
		return emailAddress;
	}



	public CustomerGender getGender() {
		return gender;
	}

	public List<Group> getGroups() {
		return groups;
	}



	public Long getId() {
		return id;
	}

	public MerchantStore getMerchantStore() {
		return merchantStore;
	}


	public String getNick() {
		return nick;
	}

	public String getPassword() {
		return password;
	}

	public String getProvider() {
		return provider;
	}

	public List<ProductReview> getReviews() {
		return reviews;
	}

	public String getShowBillingStateList() {
		return showBillingStateList;
	}

	public String getShowCustomerStateList() {
		return showCustomerStateList;
	}

	public String getShowDeliveryStateList() {
		return showDeliveryStateList;
	}

	public boolean isAnonymous() {
		return anonymous;
	}

	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}

	public void setAttributes(Set<CustomerAttribute> attributes) {
		this.attributes = attributes;
	}
	@Override
	public void setAuditSection(AuditSection auditSection) {
		this.auditSection = auditSection;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCustomerReviewAvg(BigDecimal customerReviewAvg) {
		this.customerReviewAvg = customerReviewAvg;
	}

	public void setCustomerReviewCount(Integer customerReviewCount) {
		this.customerReviewCount = customerReviewCount;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = CloneUtils.clone(dateOfBirth);
	}
	
	public void setDefaultLanguage(Language defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setGender(CustomerGender gender) {
		this.gender = gender;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMerchantStore(MerchantStore merchantStore) {
		this.merchantStore = merchantStore;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void setReviews(List<ProductReview> reviews) {
		this.reviews = reviews;
	}

	public void setShowBillingStateList(String showBillingStateList) {
		this.showBillingStateList = showBillingStateList;
	}
	
	public void setShowCustomerStateList(String showCustomerStateList) {
		this.showCustomerStateList = showCustomerStateList;
	}

	public void setShowDeliveryStateList(String showDeliveryStateList) {
		this.showDeliveryStateList = showDeliveryStateList;
	}
	
}
