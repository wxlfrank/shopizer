package com.salesmanager.core.business.repositories.catalog.product.relationship;

import java.util.List;

import com.salesmanager.core.model.catalog.product.Product;
import com.salesmanager.core.model.catalog.product.relationship.ProductRelationship;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;


public interface ProductRelationshipRepositoryCustom {

	List<ProductRelationship> getByGroup(MerchantStore store, String group);

	List<ProductRelationship> getByType(MerchantStore store, String type);

	List<ProductRelationship> getByType(MerchantStore store, String type,
			Language language);

	List<ProductRelationship> getByType(MerchantStore store, String type,
			Product product);

	List<ProductRelationship> getByType(MerchantStore store, String type,
			Product product, Language language);

	List<ProductRelationship> getGroups(MerchantStore store);

	List<ProductRelationship> listByProducts(Product product);
	

}
