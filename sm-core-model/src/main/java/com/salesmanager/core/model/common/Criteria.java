package com.salesmanager.core.model.common;

public class Criteria {
	
	
	private int startIndex = 0;
	private int maxCount = 0;
	private String code;
	private String language;
	
	private CriteriaOrderBy orderBy = CriteriaOrderBy.DESC;
	
	
	public String getCode() {
		return code;
	}
	public String getLanguage() {
		return language;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public CriteriaOrderBy getOrderBy() {
		return orderBy;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public void setOrderBy(CriteriaOrderBy orderBy) {
		this.orderBy = orderBy;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}



}