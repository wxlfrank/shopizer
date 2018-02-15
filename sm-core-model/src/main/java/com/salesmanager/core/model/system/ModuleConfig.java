package com.salesmanager.core.model.system;

public class ModuleConfig {

	
	private String scheme;
	private String host;
	private String port;
	private String uri;
	private String env;
	private String config1;
	private String config2;
	public String getConfig1() {
		return config1;
	}
	public String getConfig2() {
		return config2;
	}
	public String getEnv() {
		return env;
	}
	public String getHost() {
		return host;
	}
	public String getPort() {
		return port;
	}
	public String getScheme() {
		return scheme;
	}
	public String getUri() {
		return uri;
	}
	public void setConfig1(String config1) {
		this.config1 = config1;
	}
	public void setConfig2(String config2) {
		this.config2 = config2;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}
