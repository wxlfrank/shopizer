package com.salesmanager.core.business.modules.email;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Email implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6481794982612826257L;
	private String from;
	private String fromEmail;
	private String to;
	private String subject;
	private String templateName;
	
	private Map<String,String> templateTokens = new HashMap<String,String>();

	public String getFrom() {
		return from;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public String getSubject() {
		return subject;
	}

	public String getTemplateName() {
		return templateName;
	}

	public Map<String, String> getTemplateTokens() {
		return templateTokens;
	}

	public String getTo() {
		return to;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public void setTemplateTokens(Map<String, String> templateTokens) {
		this.templateTokens = templateTokens;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
