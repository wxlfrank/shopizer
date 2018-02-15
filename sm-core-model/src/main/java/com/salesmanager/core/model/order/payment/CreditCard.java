package com.salesmanager.core.model.order.payment;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.salesmanager.core.model.payments.CreditCardType;

@Embeddable
public class CreditCard {
	
	@Column (name ="CARD_TYPE")
	@Enumerated(value = EnumType.STRING)
	private CreditCardType cardType;
	
	@Column (name ="CC_OWNER")
	private String ccOwner;
	
	@Column (name ="CC_NUMBER")
	private String ccNumber;
	
	@Column (name ="CC_EXPIRES")
	private String ccExpires;
	
	@Column (name ="CC_CVV")
	private String ccCvv;

	public CreditCardType getCardType() {
		return cardType;
	}

	public String getCcCvv() {
		return ccCvv;
	}

	public String getCcExpires() {
		return ccExpires;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public String getCcOwner() {
		return ccOwner;
	}

	public void setCardType(CreditCardType cardType) {
		this.cardType = cardType;
	}

	public void setCcCvv(String ccCvv) {
		this.ccCvv = ccCvv;
	}

	public void setCcExpires(String ccExpires) {
		this.ccExpires = ccExpires;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public void setCcOwner(String ccOwner) {
		this.ccOwner = ccOwner;
	}

}
