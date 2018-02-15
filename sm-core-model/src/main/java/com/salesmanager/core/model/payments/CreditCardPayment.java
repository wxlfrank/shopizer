package com.salesmanager.core.model.payments;

/**
 * When the user performs a payment using a credit card
 * @author Carl Samson
 *
 */
public class CreditCardPayment extends Payment {
	
	private String creditCardNumber;
	private String credidCardValidationNumber;
	private String expirationMonth;
	private String expirationYear;
	private String cardOwner;
	private CreditCardType creditCard;
	public String getCardOwner() {
		return cardOwner;
	}
	public String getCredidCardValidationNumber() {
		return credidCardValidationNumber;
	}
	public CreditCardType getCreditCard() {
		return creditCard;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public String getExpirationMonth() {
		return expirationMonth;
	}
	public String getExpirationYear() {
		return expirationYear;
	}
	public void setCardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
	}
	public void setCredidCardValidationNumber(String credidCardValidationNumber) {
		this.credidCardValidationNumber = credidCardValidationNumber;
	}
	public void setCreditCard(CreditCardType creditCard) {
		this.creditCard = creditCard;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}

}
