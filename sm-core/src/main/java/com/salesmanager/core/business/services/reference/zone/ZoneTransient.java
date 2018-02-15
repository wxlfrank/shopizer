package com.salesmanager.core.business.services.reference.zone;

public class ZoneTransient {
	
	private String zoneCode;
	private String zoneName;
	private String countryCode;
	
	public String getCountryCode() {
		return countryCode;
	}
	public String getZoneCode() {
		return zoneCode;
	}
	public String getZoneName() {
		return zoneName;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

}
