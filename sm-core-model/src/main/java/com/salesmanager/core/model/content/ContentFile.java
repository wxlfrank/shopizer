package com.salesmanager.core.model.content;

public abstract class ContentFile {
	
	
	private String fileName;
	private String mimeType;
	public String getFileName() {
		return fileName;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}


}
