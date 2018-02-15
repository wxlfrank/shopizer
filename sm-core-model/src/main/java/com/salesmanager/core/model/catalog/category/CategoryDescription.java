package com.salesmanager.core.model.catalog.category;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.description.Description;
import com.salesmanager.core.model.reference.language.Language;


@Entity
@Table(name="CATEGORY_DESCRIPTION", schema=SchemaConstant.SALESMANAGER_SCHEMA,uniqueConstraints={
		@UniqueConstraint(columnNames={
			"CATEGORY_ID",
			"LANGUAGE_ID"
		})
	}
)
public class CategoryDescription extends Description {
	private static final long serialVersionUID = -3248423008455359301L;
	

	@ManyToOne(targetEntity = Category.class)
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private Category category;

	@Column(name="SEF_URL", length=120)
	private String seUrl;
	
	@Column(name = "CATEGORY_HIGHLIGHT")
	private String categoryHighlight;

	@Column(name="META_TITLE", length=120)
	private String metatagTitle;

	@Column(name="META_KEYWORDS")
	private String metatagKeywords;

	@Column(name="META_DESCRIPTION")
	private String metatagDescription;
	
	public CategoryDescription() {
	}
	
	public CategoryDescription(String name, Language language) {
		this.setName(name);
		this.setLanguage(language);
		super.setId(0L);
	}
	
	public Category getCategory() {
		return category;
	}
	
	public String getCategoryHighlight() {
		return categoryHighlight;
	}
	
	public String getMetatagDescription() {
		return metatagDescription;
	}

	public String getMetatagKeywords() {
		return metatagKeywords;
	}

	public String getMetatagTitle() {
		return metatagTitle;
	}

	public String getSeUrl() {
		return seUrl;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setCategoryHighlight(String categoryHighlight) {
		this.categoryHighlight = categoryHighlight;
	}

	public void setMetatagDescription(String metatagDescription) {
		this.metatagDescription = metatagDescription;
	}

	public void setMetatagKeywords(String metatagKeywords) {
		this.metatagKeywords = metatagKeywords;
	}

	public void setMetatagTitle(String metatagTitle) {
		this.metatagTitle = metatagTitle;
	}

	public void setSeUrl(String seUrl) {
		this.seUrl = seUrl;
	}
}
