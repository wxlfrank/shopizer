package com.salesmanager.core.model.shipping;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShippingOption implements Serializable {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ShippingOption.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal optionPrice;
	private Long shippingQuoteOptionId;


	private String optionName = null;
	private String optionCode = null;
	private String optionDeliveryDate = null;
	private String optionShippingDate = null;
	private String optionPriceText = null;
	private String optionId = null;
	private String description = null;
	private String shippingModuleCode = null;
	private String note = null;
	
	private String estimatedNumberOfDays;

	

	public String getDescription() {
		return description;
	}
	
	public String getEstimatedNumberOfDays() {
		return estimatedNumberOfDays;
	}

	public String getNote() {
		return note;
	}
	public String getOptionCode() {
		return optionCode;
	}
	public String getOptionDeliveryDate() {
		return optionDeliveryDate;
	}
	public String getOptionId() {
		return optionId;
	}

	public String getOptionName() {
		return optionName;
	}
	public BigDecimal getOptionPrice() {
		
		if(!StringUtils.isBlank(this.getOptionPriceText())) {
			try {
				this.optionPrice = new BigDecimal(this.getOptionPriceText());
			} catch(Exception e) {
				LOGGER.equals("Can't convert price text " + this.getOptionPriceText() + " to big decimal");
			}
		}
		
		return optionPrice;
	}
	public String getOptionPriceText() {
		return optionPriceText;
	}
	public String getOptionShippingDate() {
		return optionShippingDate;
	}
	public String getShippingModuleCode() {
		return shippingModuleCode;
	}
	public Long getShippingQuoteOptionId() {
		return shippingQuoteOptionId;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setEstimatedNumberOfDays(String estimatedNumberOfDays) {
		this.estimatedNumberOfDays = estimatedNumberOfDays;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}
	public void setOptionDeliveryDate(String optionDeliveryDate) {
		this.optionDeliveryDate = optionDeliveryDate;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public void setOptionPrice(BigDecimal optionPrice) {
		this.optionPrice = optionPrice;
	}

	public void setOptionPriceText(String optionPriceText) {
		this.optionPriceText = optionPriceText;
	}

	public void setOptionShippingDate(String optionShippingDate) {
		this.optionShippingDate = optionShippingDate;
	}

	public void setShippingModuleCode(String shippingModuleCode) {
		this.shippingModuleCode = shippingModuleCode;
	}

	public void setShippingQuoteOptionId(Long shippingQuoteOptionId) {
		this.shippingQuoteOptionId = shippingQuoteOptionId;
	}

}
