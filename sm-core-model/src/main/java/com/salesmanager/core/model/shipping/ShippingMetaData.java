package com.salesmanager.core.model.shipping;

import java.util.List;

import com.salesmanager.core.model.reference.country.Country;

/**
 * Describes how shipping is configured for a given store
 * @author carlsamson
 *
 */
public class ShippingMetaData {
	
	private List<String> modules;
	private List<String> preProcessors;
	private List<String> postProcessors;
	private List<Country> shipToCountry;
	private boolean useDistanceModule;
	
	
	
	public List<String> getModules() {
		return modules;
	}
	public List<String> getPostProcessors() {
		return postProcessors;
	}
	public List<String> getPreProcessors() {
		return preProcessors;
	}
	public List<Country> getShipToCountry() {
		return shipToCountry;
	}
	public boolean isUseDistanceModule() {
		return useDistanceModule;
	}
	public void setModules(List<String> modules) {
		this.modules = modules;
	}
	public void setPostProcessors(List<String> postProcessors) {
		this.postProcessors = postProcessors;
	}
	public void setPreProcessors(List<String> preProcessors) {
		this.preProcessors = preProcessors;
	}
	public void setShipToCountry(List<Country> shipToCountry) {
		this.shipToCountry = shipToCountry;
	}
	public void setUseDistanceModule(boolean useDistanceModule) {
		this.useDistanceModule = useDistanceModule;
	}

}
