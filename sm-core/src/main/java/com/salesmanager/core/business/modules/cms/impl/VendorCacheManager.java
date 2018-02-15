package com.salesmanager.core.business.modules.cms.impl;

import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VendorCacheManager {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VendorCacheManager.class);
	private static VendorCacheManager vendorCacheManager = null;
	public static VendorCacheManager getInstance() {
		if(vendorCacheManager==null) {
			vendorCacheManager = new VendorCacheManager();

		}
		return vendorCacheManager;
	}
	private EmbeddedCacheManager manager = null;
	

	
	private String repositoryFileName = "cms/infinispan_configuration.xml";


	private VendorCacheManager(){
		
		try {
			manager = new DefaultCacheManager(repositoryFileName);
		} catch (Exception e) {
			LOGGER.error("Cannot start manager " + e.toString());
		}
		
	}


	public EmbeddedCacheManager getManager() {
		return manager;
	}

}
