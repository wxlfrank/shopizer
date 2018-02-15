package com.salesmanager.core.business.services.merchant;

import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityService;
import com.salesmanager.core.model.merchant.MerchantStore;

public interface MerchantStoreService extends SalesManagerEntityService<Integer, MerchantStore>{
	

	MerchantStore getByCode(String code) throws ServiceException ;
	
	MerchantStore getMerchantStore(String merchantStoreCode)
			throws ServiceException;

	void saveOrUpdate(MerchantStore store) throws ServiceException;
}
