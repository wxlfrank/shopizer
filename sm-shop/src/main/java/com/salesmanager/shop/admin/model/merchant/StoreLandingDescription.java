package com.salesmanager.shop.admin.model.merchant;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import com.salesmanager.core.model.reference.language.Language;

public class StoreLandingDescription implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotEmpty
	private String title;
	private String description;
	private String keywords;
	private String homePageContent;
	
	
	private Language language;

	
	
	
	public String getDescription() {
		return description;
	}

	public String getHomePageContent() {
		return homePageContent;
	}

	public String getKeywords() {
		return keywords;
	}

	public Language getLanguage() {
		return language;
	}

	public String getTitle() {
		return title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setHomePageContent(String homePageContent) {
		this.homePageContent = homePageContent;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
