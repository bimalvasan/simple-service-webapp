package com.example;

import java.util.List;

import org.ektorp.support.CouchDbDocument;

public class ConfigData extends CouchDbDocument {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8430492838690557010L;
	private String product;
	private List<Config> config;
	private String created_by;
	private String created_on;
	private String updated_by;
	private String updated_on;
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public List<Config> getConfig() {
		return config;
	}
	public void setConfig(List<Config> config) {
		this.config = config;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(String updated_on) {
		this.updated_on = updated_on;
	}    
}
