package com.salesmanager.core.model.customer.connection;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * Identity key for storing spring social objects
 * @author carlsamson
 *
 */
@Embeddable
public class UserConnectionPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userId;
	private String providerId;
	private String providerUserId;

	public boolean equals(Object o) {
		if (o instanceof UserConnectionPK) {
			UserConnectionPK other = (UserConnectionPK) o;
			return other.getProviderId().equals(getProviderId())
					&& other.getProviderUserId().equals(getProviderUserId())
					&& other.getUserId().equals(getUserId());
		} else {
			return false;
		}
	}

	public String getProviderId() {
		return providerId;
	}

	public String getProviderUserId() {
		return providerUserId;
	}

	public String getUserId() {
		return userId;
	}

	public int hashCode() {
		return getUserId().hashCode() + getProviderId().hashCode()
				+ getProviderUserId().hashCode();
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
