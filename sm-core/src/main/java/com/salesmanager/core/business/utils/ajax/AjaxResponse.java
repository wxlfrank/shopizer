package com.salesmanager.core.business.utils.ajax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

public class AjaxResponse implements JSONAware {
	
	public final static int RESPONSE_STATUS_SUCCESS=0;
	public final static int RESPONSE_STATUS_FAIURE=-1;
	public final static int RESPONSE_STATUS_VALIDATION_FAILED=-2;
	public final static int RESPONSE_OPERATION_COMPLETED=9999;
	public final static int CODE_ALREADY_EXIST=9998;
	
	private int status;
	private List<Map<String,String>> data = new ArrayList<Map<String,String>>();
	private Map<String,String> dataMap = new HashMap<String,String>();
	private Map<String,String> validationMessages = new HashMap<String,String>();
	private String statusMessage = null;
	public void addDataEntry(Map<String,String> dataEntry) {
		this.data.add(dataEntry);
	}
	public void addEntry(String key, String value) {
		dataMap.put(key, value);
	}
	public void addValidationMessage(String fieldName, String message) {
		this.validationMessages.put(fieldName, message);
	}
	public Map<String,String> getDataMap() {
		return dataMap;
	}
	
	public int getStatus() {
		return status;
	}
	
	public String getStatusMessage() {
		return statusMessage;
	}
	
	
	public Map<String, String> getValidationMessages() {
		return validationMessages;
	}
	
	public void setDataMap(Map<String,String> dataMap) {
		this.dataMap = dataMap;
	}
	

	public void setErrorMessage(Throwable t) {
		this.setStatusMessage(t.getMessage());
	}
	
	public void setErrorString(String t) {
		this.setStatusMessage(t);
	}
	
	
	public void setStatus(int status) {
		this.status = status;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	
	
	public void setValidationMessages(Map<String, String> validationMessages) {
		this.validationMessages = validationMessages;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String toJSONString() {
		StringBuilder returnString = new StringBuilder();
		
		returnString.append(getJsonInfo());

		if(this.getData().size()>0) {
			StringBuilder dataEntries = null;
			int count = 0;
			for(Map keyValue : this.getData()) {
				if(dataEntries == null) {
					dataEntries = new StringBuilder();
				}
				JSONObject data = new JSONObject();
				Set<String> keys = keyValue.keySet();
				for(String key : keys) {
					data.put(key, keyValue.get(key));
				}
				String dataField = data.toJSONString();
				dataEntries.append(dataField);
				if(count<this.data.size()-1) {
					dataEntries.append(",");
				}
				count ++;
			}
			
			returnString.append(",").append("\"data\"").append(":[");
			if(dataEntries!=null) {
				returnString.append(dataEntries.toString());
			}
			returnString.append("]");
		}
		
		if(this.getDataMap().size()>0) {
			StringBuilder dataEntries = null;
			int count = 0;
			for(String key : this.getDataMap().keySet()) {
				if(dataEntries == null) {
					dataEntries = new StringBuilder();
				}
				
				dataEntries.append("\"").append(key).append("\"");
				dataEntries.append(":");
				dataEntries.append("\"").append(this.getDataMap().get(key)).append("\"");

				if(count<this.getDataMap().size()-1) {
					dataEntries.append(",");
				}
				count ++;
			}

			if(dataEntries!=null) {
				returnString.append(",").append(dataEntries.toString());
			}
		}
		
		if(CollectionUtils.isNotEmpty(this.getValidationMessages().values())) {
			StringBuilder dataEntries = null;
			int count = 0;
			for(String key : this.getValidationMessages().keySet()) {
				if(dataEntries == null) {
					dataEntries = new StringBuilder();
				}
				dataEntries.append("{");
				dataEntries.append("\"field\":\"").append(key).append("\"");
				dataEntries.append(",");
				dataEntries.append("\"message\":\"").append(this.getValidationMessages().get(key)).append("\"");
				dataEntries.append("}");

				if(count<this.getValidationMessages().size()-1) {
					dataEntries.append(",");
				}
				count ++;
			}
			
			returnString.append(",").append("\"validations\"").append(":[");
			if(dataEntries!=null) {
				returnString.append(dataEntries.toString());
			}
			returnString.append("]");

		}
		
		returnString.append("}}");

		
		return returnString.toString();

		
	}
	protected List<Map<String,String>> getData() {
		return data;
	}
	protected String getJsonInfo() {
		
		StringBuilder returnString = new StringBuilder();
		returnString.append("{");
		returnString.append("\"response\"").append(":");
		returnString.append("{");
		returnString.append("\"status\"").append(":").append(this.getStatus());
		if(this.getStatusMessage()!=null && this.getStatus()!=0) {
			returnString.append(",").append("\"statusMessage\"").append(":\"").append(JSONObject.escape(this.getStatusMessage())).append("\"");
		}
		return returnString.toString();
		
	}

}
