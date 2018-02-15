package com.salesmanager.core.model.tax;

import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

/**
 * Set of various tax configuration settings saved in MerchantConfiguration
 * @author carl samson
 *
 */
public class TaxConfiguration implements JSONAware {
	
	private TaxBasisCalculation taxBasisCalculation = TaxBasisCalculation.SHIPPINGADDRESS;
	
	private boolean collectTaxIfDifferentProvinceOfStoreCountry = true;
	private boolean collectTaxIfDifferentCountryOfStoreCountry = false;

	public TaxBasisCalculation getTaxBasisCalculation() {
		return taxBasisCalculation;
	}

	public boolean isCollectTaxIfDifferentCountryOfStoreCountry() {
		return collectTaxIfDifferentCountryOfStoreCountry;
	}

	public boolean isCollectTaxIfDifferentProvinceOfStoreCountry() {
		return collectTaxIfDifferentProvinceOfStoreCountry;
	}

	public void setCollectTaxIfDifferentCountryOfStoreCountry(
			boolean collectTaxIfDifferentCountryOfStoreCountry) {
		this.collectTaxIfDifferentCountryOfStoreCountry = collectTaxIfDifferentCountryOfStoreCountry;
	}

	public void setCollectTaxIfDifferentProvinceOfStoreCountry(
			boolean collectTaxIfDifferentProvinceOfStoreCountry) {
		this.collectTaxIfDifferentProvinceOfStoreCountry = collectTaxIfDifferentProvinceOfStoreCountry;
	}

	public void setTaxBasisCalculation(TaxBasisCalculation taxBasisCalculation) {
		this.taxBasisCalculation = taxBasisCalculation;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String toJSONString() {
		JSONObject data = new JSONObject();
		data.put("taxBasisCalculation", this.getTaxBasisCalculation().name());
		
		return data.toJSONString();
	}

}
