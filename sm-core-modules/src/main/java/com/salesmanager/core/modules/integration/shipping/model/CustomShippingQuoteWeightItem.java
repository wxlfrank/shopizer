package com.salesmanager.core.modules.integration.shipping.model;

import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

public class CustomShippingQuoteWeightItem extends CustomShippingQuoteItem implements JSONAware {
	
	private int maximumWeight;
	
	private String priceText;

	public int getMaximumWeight() {
		return maximumWeight;
	}

	public String getPriceText() {
		return priceText;
	}

	public void setMaximumWeight(int maximumWeight) {
		this.maximumWeight = maximumWeight;
	}

	public void setPriceText(String priceText) {
		this.priceText = priceText;
	}

	@SuppressWarnings("unchecked")
	public String toJSONString() {
		JSONObject data = new JSONObject();
		data.put("price", super.getPrice());
		data.put("maximumWeight", this.getMaximumWeight());
		
		return data.toJSONString();
	}



}
