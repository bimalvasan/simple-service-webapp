package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Config {
	@JsonProperty("Server")
	private String server;
	@JsonProperty("Site")
	private String site;
	@JsonProperty("CC")
	private String cC;
	@JsonProperty("Env")
	private String env;
	@JsonProperty("Market")
	private String market;
	
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getcC() {
		return cC;
	}
	public void setcC(String cC) {
		this.cC = cC;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
}
