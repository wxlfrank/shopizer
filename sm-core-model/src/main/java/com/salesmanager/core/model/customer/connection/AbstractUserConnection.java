package com.salesmanager.core.model.customer.connection;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;



@MappedSuperclass
public abstract class AbstractUserConnection<P> implements RemoteUser,
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String accessToken;
	private String displayName;
	private Long expireTime;
	private String imageUrl;
	private String profileUrl;
	private int rank;
	private String refreshToken;
	private String secret;


	public String getAccessToken() {
		return accessToken;
	}

	public String getDisplayName() {
		return displayName;
	}

	public Long getExpireTime() {
		return expireTime;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public abstract String getProviderId();

	public abstract String getProviderUserId();

	public int getRank() {
		return rank;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public String getSecret() {
		return secret;
	}

	public abstract String getUserId();

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public abstract void setProviderId(String providerId);

	public abstract void setProviderUserId(String providerUserId);

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public abstract void setUserId(String userId);

	protected abstract P getId();
}
