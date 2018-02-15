package com.salesmanager.core.model.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PermissionList implements Serializable {
	

	private static final long serialVersionUID = -3122326940968441727L;
	private int totalCount;
	private List<Permission> permissions = new ArrayList<Permission>();
	public List<Permission> getPermissions() {
		return permissions;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

}
