package com.salesmanager.core.model.customer.connection;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.salesmanager.core.constants.SchemaConstant;

@MappedSuperclass
@Table(name="USERCONNECTION", schema=SchemaConstant.SALESMANAGER_SCHEMA, uniqueConstraints = { @UniqueConstraint(columnNames = { "userId",
		"providerId", "rank" }) })
public abstract class AbstractUserConnectionWithCompositeKey extends
		AbstractUserConnection<UserConnectionPK> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private UserConnectionPK primaryKey = new UserConnectionPK();

	@Override
	public String getProviderId() {
		return primaryKey.getProviderId();
	}

	@Override
	public String getProviderUserId() {
		return primaryKey.getProviderUserId();
	}

	@Override
	public String getUserId() {
		return primaryKey.getUserId();
	}

	@Override
	public void setProviderId(String providerId) {
		primaryKey.setProviderId(providerId);
	}

	@Override
	public void setProviderUserId(String providerUserId) {
		primaryKey.setProviderUserId(providerUserId);
	}

	@Override
	public void setUserId(String userId) {
		primaryKey.setUserId(userId);
	}

	@Override
	protected UserConnectionPK getId() {
		return primaryKey;
	}

}
