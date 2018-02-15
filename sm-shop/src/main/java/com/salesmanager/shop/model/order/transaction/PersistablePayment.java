package com.salesmanager.shop.model.order.transaction;

import com.salesmanager.core.model.payments.PaymentType;
import com.salesmanager.core.model.payments.TransactionType;
import com.salesmanager.shop.utils.Enum;

public class PersistablePayment extends PaymentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Enum(enumClass=PaymentType.class, ignoreCase=true) 
	private String paymentType;
	
	@Enum(enumClass=TransactionType.class, ignoreCase=true) 
	private String transactionType;
	
	private String paymentToken;//any token after doing init
	
	public String getPaymentToken() {
		return paymentToken;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setPaymentToken(String paymentToken) {
		this.paymentToken = paymentToken;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	

}
