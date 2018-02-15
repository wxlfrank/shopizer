package com.salesmanager.core.model.order;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
import javax.validation.Valid;

import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.Type;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.Billing;
import com.salesmanager.core.model.common.Delivery;
import com.salesmanager.core.model.generic.SalesManagerEntity;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.order.attributes.OrderAttribute;
import com.salesmanager.core.model.order.orderproduct.OrderProduct;
import com.salesmanager.core.model.order.orderstatus.OrderStatus;
import com.salesmanager.core.model.order.orderstatus.OrderStatusHistory;
import com.salesmanager.core.model.order.payment.CreditCard;
import com.salesmanager.core.model.payments.PaymentType;
import com.salesmanager.core.model.reference.currency.Currency;
import com.salesmanager.core.utils.CloneUtils;

@Entity
@Table (name="ORDERS", schema = SchemaConstant.SALESMANAGER_SCHEMA)
public class Order extends SalesManagerEntity<Long, Order> {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column (name ="ORDER_ID" , unique=true , nullable=false )
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT",
		pkColumnValue = "ORDER_ID_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;
	
	@Column (name ="ORDER_STATUS")
	@Enumerated(value = EnumType.STRING)
	private OrderStatus status;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name ="LAST_MODIFIED")
	private Date lastModified;
	
	//the customer object can be detached. An order can exist and the customer deleted
	@Column (name ="CUSTOMER_ID")
	private Long customerId;
	
	@Temporal(TemporalType.DATE)
	@Column (name ="DATE_PURCHASED")
	private Date datePurchased;
	
	//used for an order payable on multiple installment
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name ="ORDER_DATE_FINISHED")
	private Date orderDateFinished;
	
	//What was the exchange rate
	@Column (name ="CURRENCY_VALUE")
	private BigDecimal currencyValue = new BigDecimal(1);//default 1-1
	
	@Column (name ="ORDER_TOTAL")
	private BigDecimal total;

	@Column (name ="IP_ADDRESS")
	private String ipAddress;

	@Column (name ="CHANNEL")
	@Enumerated(value = EnumType.STRING)
	private OrderChannel channel;

	@Column (name ="ORDER_TYPE")
	@Enumerated(value = EnumType.STRING)
	private OrderType orderType = OrderType.ORDER;

	@Column (name ="PAYMENT_TYPE")
	@Enumerated(value = EnumType.STRING)
	private PaymentType paymentType;
	
	@Column (name ="PAYMENT_MODULE_CODE")
	private String paymentModuleCode;
	
	
	@Column (name ="SHIPPING_MODULE_CODE")
	private String shippingModuleCode;
	
	@Column(name = "CUSTOMER_AGREED")
	private Boolean customerAgreement = false;
	
	@Column(name = "CONFIRMED_ADDRESS")
	private Boolean confirmedAddress = false;

	@Embedded
	private Delivery delivery = null;
	
	@Valid
	@Embedded
	private Billing billing = null;
	
	@Embedded
	private CreditCard creditCard = null;

	
	@ManyToOne(targetEntity = Currency.class)
	@JoinColumn(name = "CURRENCY_ID")
	private Currency currency;
	
	@Type(type="locale")  
	@Column (name ="LOCALE")
	private Locale locale; 
	


	@ManyToOne(targetEntity = MerchantStore.class)
	@JoinColumn(name="MERCHANTID")
	private MerchantStore merchant;
	
	//@OneToMany(mappedBy = "order")
	//private Set<OrderAccount> orderAccounts = new HashSet<OrderAccount>();
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private Set<OrderProduct> orderProducts = new LinkedHashSet<OrderProduct>();
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	@OrderBy(clause = "sort_order asc")
	private Set<OrderTotal> orderTotal = new LinkedHashSet<OrderTotal>();
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	@OrderBy(clause = "ORDER_STATUS_HISTORY_ID asc")
	private Set<OrderStatusHistory> orderHistory = new LinkedHashSet<OrderStatusHistory>();
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private Set<OrderAttribute> orderAttributes = new LinkedHashSet<OrderAttribute>();
	
	@Column (name ="CUSTOMER_EMAIL_ADDRESS", length=50, nullable=false)
	private String customerEmailAddress;
	
	public Order() {
	}


	public Billing getBilling() {
		return billing;
	}
	
	public OrderChannel getChannel() {
		return channel;
	}

	public Boolean getConfirmedAddress() {
		return confirmedAddress;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public Currency getCurrency() {
		return currency;
	}

	public BigDecimal getCurrencyValue() {
		return currencyValue;
	}

	public Boolean getCustomerAgreement() {
		return customerAgreement;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public Date getDatePurchased() {
		return CloneUtils.clone(datePurchased);
	}

	public Delivery getDelivery() {
		return delivery;
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public Date getLastModified() {
		return CloneUtils.clone(lastModified);
	}


	public Locale getLocale() {
		return locale;
	}

	public MerchantStore getMerchant() {
		return merchant;
	}


	public Set<OrderAttribute> getOrderAttributes() {
		return orderAttributes;
	}

	public Date getOrderDateFinished() {
		return CloneUtils.clone(orderDateFinished);
	}



	public Set<OrderStatusHistory> getOrderHistory() {
		return orderHistory;
	}

	public Set<OrderProduct> getOrderProducts() {
		return orderProducts;
	}



	public Set<OrderTotal> getOrderTotal() {
		return orderTotal;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public String getPaymentModuleCode() {
		return paymentModuleCode;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public String getShippingModuleCode() {
		return shippingModuleCode;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public void setChannel(OrderChannel channel) {
		this.channel = channel;
	}

	public void setConfirmedAddress(Boolean confirmedAddress) {
		this.confirmedAddress = confirmedAddress;
	}


	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public void setCurrencyValue(BigDecimal currencyValue) {
		this.currencyValue = currencyValue;
	}

	public void setCustomerAgreement(Boolean customerAgreement) {
		this.customerAgreement = customerAgreement;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	

	public void setDatePurchased(Date datePurchased) {
		this.datePurchased = CloneUtils.clone(datePurchased);
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}


	@Override
	public void setId(Long id) {
		this.id = id;
	}


	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}


	public void setLastModified(Date lastModified) {
		this.lastModified = CloneUtils.clone(lastModified);
	}


	public void setLocale(Locale locale) {
		this.locale = locale;
	}


	public void setMerchant(MerchantStore merchant) {
		this.merchant = merchant;
	}


	public void setOrderAttributes(Set<OrderAttribute> orderAttributes) {
		this.orderAttributes = orderAttributes;
	}
	
	public void setOrderDateFinished(Date orderDateFinished) {
		this.orderDateFinished = CloneUtils.clone(orderDateFinished);
	}

	public void setOrderHistory(Set<OrderStatusHistory> orderHistory) {
		this.orderHistory = orderHistory;
	}
	
	public void setOrderProducts(Set<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}

	public void setOrderTotal(Set<OrderTotal> orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public void setPaymentModuleCode(String paymentModuleCode) {
		this.paymentModuleCode = paymentModuleCode;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public void setShippingModuleCode(String shippingModuleCode) {
		this.shippingModuleCode = shippingModuleCode;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}