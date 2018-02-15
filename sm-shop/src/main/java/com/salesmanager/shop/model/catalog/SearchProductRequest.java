package com.salesmanager.shop.model.catalog;

import java.io.Serializable;

/**
 * Search product request
 * @author c.samson
 *
 */
public class SearchProductRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String query;
	private int count;
	private int start;

	public int getCount() {
		return count;
	}

	public String getQuery() {
		return query;
	}

	public int getStart() {
		return start;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public void setStart(int start) {
		this.start = start;
	}

}
