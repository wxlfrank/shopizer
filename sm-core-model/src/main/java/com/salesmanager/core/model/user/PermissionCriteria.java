package com.salesmanager.core.model.user;

import java.util.List;
import java.util.Set;

import com.salesmanager.core.model.common.Criteria;

public class PermissionCriteria extends Criteria {
	
	
	private String permissionName;

	
	private Boolean available = null;
	
	private Set<Integer> groupIds;
	
	private List<String> availabilities;


	public List<String> getAvailabilities() {
		return availabilities;
	}

	public Boolean getAvailable() {
		return available;
	}

	public Set<Integer> getGroupIds() {
		return groupIds;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setAvailabilities(List<String> availabilities) {
		this.availabilities = availabilities;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public void setGroupIds(Set<Integer> groupIds) {
		this.groupIds = groupIds;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}


}
