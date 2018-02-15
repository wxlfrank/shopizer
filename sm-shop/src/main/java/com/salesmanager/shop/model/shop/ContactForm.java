package com.salesmanager.shop.model.shop;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class ContactForm {
	
	@NotEmpty
	private String name;
	@NotEmpty
	private String subject;
	@Email
	private String email;
	@NotEmpty
	private String comment;

	
	public String getComment() {
		return comment;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}


}
