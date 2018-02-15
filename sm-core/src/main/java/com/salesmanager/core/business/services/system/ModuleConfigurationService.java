package com.salesmanager.core.business.services.system;

import java.util.List;

import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityService;
import com.salesmanager.core.model.system.IntegrationModule;

public interface ModuleConfigurationService extends
		SalesManagerEntityService<Long, IntegrationModule> {

	void createOrUpdateModule(String json) throws ServiceException;

	IntegrationModule getByCode(String moduleCode);
	
	List<IntegrationModule> getIntegrationModules(String module);
	


}
