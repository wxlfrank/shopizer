package com.salesmanager.core.modules;

/**
 * Root interface for all modules
 * @author carlsamson
 *
 */
public interface Module {
	
	String getCode();
	String getName();
	void setCode(String code);
	void setName(String name);

}
