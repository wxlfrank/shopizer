package com.salesmanager.core.model.search;

public class SearchFacet {
	
	private String name;
	private String key;
	private long count;
	public long getCount() {
		return count;
	}
	public String getKey() {
		return key;
	}
	public String getName() {
		return name;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public void setName(String name) {
		this.name = name;
	};

}
