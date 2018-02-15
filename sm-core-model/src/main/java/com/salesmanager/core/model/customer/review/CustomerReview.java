package com.salesmanager.core.model.customer.review;

import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.audit.AuditListener;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.customer.Customer;
import com.salesmanager.core.model.generic.SalesManagerEntity;

@Entity
@EntityListeners(value = AuditListener.class)
@Table(name = "CUSTOMER_REVIEW", schema=SchemaConstant.SALESMANAGER_SCHEMA, uniqueConstraints={
		@UniqueConstraint(columnNames={
				"CUSTOMERS_ID",
				"REVIEWED_CUSTOMER_ID"
			})
		}
)
public class CustomerReview extends SalesManagerEntity<Long, CustomerReview> implements Auditable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CUSTOMER_REVIEW_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT",
	pkColumnValue = "CUSTOMER_REVIEW_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;
	
	@Embedded
	private AuditSection audit = new AuditSection();
	
	@Column(name = "REVIEWS_RATING")
	private Double reviewRating;
	
	@Column(name = "REVIEWS_READ")
	private Long reviewRead;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REVIEW_DATE")
	private Date reviewDate;
	
	@Column(name = "STATUS")
	private Integer status;

	@ManyToOne
	@JoinColumn(name="CUSTOMERS_ID")
	private Customer customer;
	

	
	@OneToOne
	@JoinColumn(name="REVIEWED_CUSTOMER_ID")
	private Customer reviewedCustomer;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "customerReview")
	private Set<CustomerReviewDescription> descriptions = new HashSet<CustomerReviewDescription>();

	public CustomerReview() {
	}

	@Override
	public AuditSection getAuditSection() {
		return audit;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public Set<CustomerReviewDescription> getDescriptions() {
		return descriptions;
	}

	public Long getId() {
		return id;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public Customer getReviewedCustomer() {
		return reviewedCustomer;
	}

	public Double getReviewRating() {
		return reviewRating;
	}

	public Long getReviewRead() {
		return reviewRead;
	}

	public Integer getStatus() {
		return status;
	}

	@Override
	public void setAuditSection(AuditSection audit) {
		this.audit = audit;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setDescriptions(Set<CustomerReviewDescription> descriptions) {
		this.descriptions = descriptions;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	
	public void setReviewedCustomer(Customer reviewedCustomer) {
		this.reviewedCustomer = reviewedCustomer;
	}
	
	public void setReviewRating(Double reviewRating) {
		this.reviewRating = reviewRating;
	}
	
	public void setReviewRead(Long reviewRead) {
		this.reviewRead = reviewRead;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
