package com.salesmanager.core.model.shipping;

import java.math.BigDecimal;

import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

/**
 * Object saved in the database maintaining various shipping options
 * @author casams1
 *
 */
public class ShippingConfiguration implements JSONAware {
	
	//enums
	private ShippingType shippingType = ShippingType.NATIONAL;
	private ShippingBasisType shippingBasisType = ShippingBasisType.SHIPPING;
	private ShippingOptionPriceType shippingOptionPriceType = ShippingOptionPriceType.ALL;
	private ShippingPackageType shippingPackageType = ShippingPackageType.ITEM;
	private ShippingDescription shippingDescription = ShippingDescription.SHORT_DESCRIPTION;
	private ShippingType freeShippingType = null;
	
	private int boxWidth = 0;
	private int boxHeight = 0;
	private int boxLength = 0;
	private double boxWeight = 0;
	private double maxWeight = 0;
	
	//free shipping
	private boolean freeShippingEnabled = false;
	private BigDecimal orderTotalFreeShipping = null;
	
	
	private BigDecimal handlingFees = null;
	private boolean taxOnShipping = false;
	
	
	//JSON bindings
	private String shipType;
	private String shipBaseType;
	private String shipOptionPriceType = ShippingOptionPriceType.ALL.name();
	private String shipPackageType;
	private String shipDescription;
	private String shipFreeType;
	
	//Transient
	private String orderTotalFreeShippingText = null;
	private String handlingFeesText = null;
	
	
	public int getBoxHeight() {
		return boxHeight;
	}


	public int getBoxLength() {
		return boxLength;
	}


	public double getBoxWeight() {
		return boxWeight;
	}



	public int getBoxWidth() {
		return boxWidth;
	}


	public ShippingType getFreeShippingType() {
		return freeShippingType;
	}


	public BigDecimal getHandlingFees() {
		return handlingFees;
	}


	public String getHandlingFeesText() {
		return handlingFeesText;
	}


	public double getMaxWeight() {
		return maxWeight;
	}


	public BigDecimal getOrderTotalFreeShipping() {
		return orderTotalFreeShipping;
	}
	
	public String getOrderTotalFreeShippingText() {
		return orderTotalFreeShippingText;
	}


	public String getShipBaseType() {
		return shipBaseType;
	}
	
	
	public String getShipDescription() {
		return shipDescription;
	}

	
	public String getShipFreeType() {
		return shipFreeType;
	}


	public String getShipOptionPriceType() {
		return shipOptionPriceType;
	}


	public String getShipPackageType() {
		return shipPackageType;
	}



	public ShippingBasisType getShippingBasisType() {
		return shippingBasisType;
	}
	
	public ShippingDescription getShippingDescription() {
		return shippingDescription;
	}
	
	public ShippingOptionPriceType getShippingOptionPriceType() {
		return shippingOptionPriceType;
	}

	public ShippingPackageType getShippingPackageType() {
		return shippingPackageType;
	}


	public ShippingType getShippingType() {
		return shippingType;
	}


	public String getShipType() {
		return shipType;
	}


	public boolean isFreeShippingEnabled() {
		return freeShippingEnabled;
	}


	public boolean isTaxOnShipping() {
		return taxOnShipping;
	}


	public void setBoxHeight(int boxHeight) {
		this.boxHeight = boxHeight;
	}


	public void setBoxLength(int boxLength) {
		this.boxLength = boxLength;
	}


	public void setBoxWeight(double boxWeight) {
		this.boxWeight = boxWeight;
	}


	public void setBoxWidth(int boxWidth) {
		this.boxWidth = boxWidth;
	}


	public void setFreeShippingEnabled(boolean freeShippingEnabled) {
		this.freeShippingEnabled = freeShippingEnabled;
	}


	public void setFreeShippingType(ShippingType freeShippingType) {
		this.freeShippingType = freeShippingType;
	}


	public void setHandlingFees(BigDecimal handlingFees) {
		this.handlingFees = handlingFees;
	}


	public void setHandlingFeesText(String handlingFeesText) {
		this.handlingFeesText = handlingFeesText;
	}


	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}


	public void setOrderTotalFreeShipping(BigDecimal orderTotalFreeShipping) {
		this.orderTotalFreeShipping = orderTotalFreeShipping;
	}


	public void setOrderTotalFreeShippingText(String orderTotalFreeShippingText) {
		this.orderTotalFreeShippingText = orderTotalFreeShippingText;
	}


	public void setShipBaseType(String shipBaseType) {
		this.shipBaseType = shipBaseType;
		ShippingBasisType sType = ShippingBasisType.SHIPPING;
		if(shipBaseType.equals(ShippingBasisType.BILLING.name())) {
			sType = ShippingBasisType.BILLING;
		}
		setShippingBasisType(sType);
	}


	public void setShipDescription(String shipDescription) {
		this.shipDescription = shipDescription;
		ShippingDescription sType = ShippingDescription.SHORT_DESCRIPTION;
		if(shipDescription.equals(ShippingDescription.LONG_DESCRIPTION.name())) {
			sType = ShippingDescription.LONG_DESCRIPTION;
		}
		this.setShippingDescription(sType);
	}


	public void setShipFreeType(String shipFreeType) {
		this.shipFreeType = shipFreeType;
		ShippingType sType = ShippingType.NATIONAL;
		if(shipFreeType.equals(ShippingType.INTERNATIONAL.name())) {
			sType = ShippingType.INTERNATIONAL;
		}
		setFreeShippingType(sType);
	}





	public void setShipOptionPriceType(String shipOptionPriceType) {
		this.shipOptionPriceType = shipOptionPriceType;
		ShippingOptionPriceType sType = ShippingOptionPriceType.ALL;
		if(shipOptionPriceType.equals(ShippingOptionPriceType.HIGHEST.name())) {
			sType = ShippingOptionPriceType.HIGHEST;
		}
		if(shipOptionPriceType.equals(ShippingOptionPriceType.LEAST.name())) {
			sType = ShippingOptionPriceType.LEAST;
		}
		setShippingOptionPriceType(sType);
	}


	public void setShipPackageType(String shipPackageType) {
		this.shipPackageType = shipPackageType;
		ShippingPackageType sType = ShippingPackageType.ITEM;
		if(shipPackageType.equals(ShippingPackageType.BOX.name())) {
			sType = ShippingPackageType.BOX;
		}
		this.setShippingPackageType(sType);
	}


	public void setShippingBasisType(ShippingBasisType shippingBasisType) {
		this.shippingBasisType = shippingBasisType;
		this.shipBaseType = this.shippingBasisType.name();
	}


	public void setShippingDescription(ShippingDescription shippingDescription) {
		this.shippingDescription = shippingDescription;
	}


	public void setShippingOptionPriceType(ShippingOptionPriceType shippingOptionPriceType) {
		this.shippingOptionPriceType = shippingOptionPriceType;
		this.shipOptionPriceType = this.shippingOptionPriceType.name();
	}



	public void setShippingPackageType(ShippingPackageType shippingPackageType) {
		this.shippingPackageType = shippingPackageType;
		this.shipPackageType = shippingPackageType.name();
	}


	public void setShippingType(ShippingType shippingType) {
		this.shippingType = shippingType;
		this.shipType = this.shippingType.name();
	}


	/** JSON bindding **/
	public void setShipType(String shipType) {
		this.shipType = shipType;
		ShippingType sType = ShippingType.NATIONAL;
		if(shipType.equals(ShippingType.INTERNATIONAL.name())) {
			sType = ShippingType.INTERNATIONAL;
		}
		setShippingType(sType);
	}


	public void setTaxOnShipping(boolean taxOnShipping) {
		this.taxOnShipping = taxOnShipping;
	}


	@SuppressWarnings("unchecked")
	@Override
	public String toJSONString() {
		JSONObject data = new JSONObject();
		data.put("shipBaseType", this.getShippingBasisType().name());
		data.put("shipOptionPriceType", this.getShippingOptionPriceType().name());
		data.put("shipType", this.getShippingType().name());
		data.put("shipPackageType", this.getShippingPackageType().name());
		if(shipFreeType!=null) {
			data.put("shipFreeType", this.getFreeShippingType().name());
		}
		data.put("shipDescription", this.getShippingDescription().name());
		
		
		data.put("boxWidth", this.getBoxWidth());
		data.put("boxHeight", this.getBoxHeight());
		data.put("boxLength", this.getBoxLength());
		data.put("boxWeight", this.getBoxWeight());
		data.put("maxWeight", this.getMaxWeight());
		data.put("freeShippingEnabled", this.freeShippingEnabled);
		data.put("orderTotalFreeShipping", this.orderTotalFreeShipping);
		data.put("handlingFees", this.handlingFees);
		data.put("taxOnShipping", this.taxOnShipping);
		
		
		return data.toJSONString();
	}











}
