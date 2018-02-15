package com.salesmanager.shop.model.order.shipping;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.salesmanager.core.model.shipping.ShippingOption;
import com.salesmanager.shop.model.customer.Address;
import com.salesmanager.shop.model.customer.ReadableDelivery;

public class ReadableShippingSummary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private BigDecimal shipping;
	private BigDecimal handling;
	private String shippingModule;
	private String shippingOption;
	private boolean freeShipping;
	private boolean taxOnShipping;
	private String shippingText;
	private String handlingText;
	
	
	private ReadableDelivery delivery;
	private ShippingOption selectedShippingOption = null;//Default selected option
	
	private List<ShippingOption> shippingOptions = null;
	
	
	/** additional information that comes from the quote **/
	private Map<String,String> quoteInformations = new HashMap<String,String>();
	public Address getDelivery() {
		return delivery;
	}
	public BigDecimal getHandling() {
		return handling;
	}
	public String getHandlingText() {
		return handlingText;
	}
	public Map<String,String> getQuoteInformations() {
		return quoteInformations;
	}
	public ShippingOption getSelectedShippingOption() {
		return selectedShippingOption;
	}
	public BigDecimal getShipping() {
		return shipping;
	}
	public String getShippingModule() {
		return shippingModule;
	}
	public String getShippingOption() {
		return shippingOption;
	}
	public List<ShippingOption> getShippingOptions() {
		return shippingOptions;
	}
	public String getShippingText() {
		return shippingText;
	}
	public boolean isFreeShipping() {
		return freeShipping;
	}
	public boolean isTaxOnShipping() {
		return taxOnShipping;
	}
	public void setDelivery(ReadableDelivery delivery) {
		this.delivery = delivery;
	}
	public void setFreeShipping(boolean freeShipping) {
		this.freeShipping = freeShipping;
	}
	public void setHandling(BigDecimal handling) {
		this.handling = handling;
	}
	public void setHandlingText(String handlingText) {
		this.handlingText = handlingText;
	}
	public void setQuoteInformations(Map<String,String> quoteInformations) {
		this.quoteInformations = quoteInformations;
	}
	public void setSelectedShippingOption(ShippingOption selectedShippingOption) {
		this.selectedShippingOption = selectedShippingOption;
	}
	public void setShipping(BigDecimal shipping) {
		this.shipping = shipping;
	}
	public void setShippingModule(String shippingModule) {
		this.shippingModule = shippingModule;
	}
	public void setShippingOption(String shippingOption) {
		this.shippingOption = shippingOption;
	}
	public void setShippingOptions(List<ShippingOption> shippingOptions) {
		this.shippingOptions = shippingOptions;
	}
	public void setShippingText(String shippingText) {
		this.shippingText = shippingText;
	}
	public void setTaxOnShipping(boolean taxOnShipping) {
		this.taxOnShipping = taxOnShipping;
	}

}
