package com.salesmanager.shop.model.catalog.category;

import java.io.Serializable;

public class CategoryEntity extends Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	private int sortOrder;
	private boolean visible;
	private boolean featured;
	private String lineage;
	private int depth;
	private Category parent;
	

	public int getDepth() {
		return depth;
	}
	public String getLineage() {
		return lineage;
	}
	public Category getParent() {
		return parent;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public boolean isFeatured() {
		return featured;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	public void setLineage(String lineage) {
		this.lineage = lineage;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
