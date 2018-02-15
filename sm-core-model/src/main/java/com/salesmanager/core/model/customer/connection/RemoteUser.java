package com.salesmanager.core.model.customer.connection;

import org.springframework.social.UserIdSource;

public interface RemoteUser extends UserIdSource{

	public String getAccessToken();
	
	public String getDisplayName();
	public Long getExpireTime();

	public String getImageUrl();

	public String getProfileUrl();

	public String getProviderId();

	/*
	 * Provider identifier: Facebook, Twitter, LinkedIn etc
	 */
	public String getProviderUserId();

	public int getRank();

	public String getRefreshToken();

	public String getSecret();

	public String getUserId();

	public void setAccessToken(String accessToken);

	public void setDisplayName(String displayName);

	public void setExpireTime(Long expireTime);

	public void setImageUrl(String imageUrl);

	public void setProfileUrl(String profileUrl);

	public void setProviderId(String providerId);

	public void setProviderUserId(String provider);

	public void setRank(int rank);

	public void setRefreshToken(String refreshToken);

	public void setSecret(String secret);

	public void setUserId(String id);
	
}
