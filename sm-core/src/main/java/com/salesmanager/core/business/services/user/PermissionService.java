package com.salesmanager.core.business.services.user;

import java.util.List;

import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityService;
import com.salesmanager.core.model.user.Group;
import com.salesmanager.core.model.user.Permission;
import com.salesmanager.core.model.user.PermissionCriteria;
import com.salesmanager.core.model.user.PermissionList;



public interface PermissionService extends SalesManagerEntityService<Integer, Permission> {

	void deletePermission(Permission permission) throws ServiceException;

	Permission getById(Integer permissionId);

	List<Permission> getByName();


//	void deletePermission(Permission permission) throws ServiceException;

	List<Permission> getPermissions(List<Integer> groupIds) throws ServiceException;

	PermissionList listByCriteria(PermissionCriteria criteria) throws ServiceException ;

	List<Permission> listPermission()  throws ServiceException;

	void removePermission(Permission permission, Group group) throws ServiceException;

}
