package com.salesmanager.core.business.services.reference.zone;

import java.util.List;
import java.util.Map;

import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityService;
import com.salesmanager.core.model.reference.country.Country;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.core.model.reference.zone.Zone;
import com.salesmanager.core.model.reference.zone.ZoneDescription;

public interface ZoneService extends SalesManagerEntityService<Long, Zone> {
	
	void addDescription(Zone zone, ZoneDescription description) throws ServiceException;

	Zone getByCode(String code);

	List<Zone> getZones(Country country, Language language)
			throws ServiceException;

	Map<String, Zone> getZones(Language language) throws ServiceException;


}
