package com.salesmanager.shop.store.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.Ordered;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

public class ServicesAuthenticationEntryPoint implements AuthenticationEntryPoint, InitializingBean, Ordered {

	
	private String realmName = "services-realm";
	
	@Override
	public void afterPropertiesSet() throws Exception {
		if ((realmName == null) || "".equals(realmName)) {
			throw new IllegalArgumentException("realmName must be specified");
		}
		
	}

	@Override
	public void commence( HttpServletRequest request, HttpServletResponse response, 
			AuthenticationException authException ) throws IOException{
		response.sendError( HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized" );
	}

	@Override
	public int getOrder() {
		return 0;
	}

}