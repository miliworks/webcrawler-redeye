package com.aoapp.redeye.webcrawler;

import org.bson.types.ObjectId;


public class Content {
	

	  private ObjectId id; // auto-generated, if not set (see ObjectId)
	  private String url, text, linksUrl; // value types are automatically persisted
	  private Long ts = 0L; // only non-null values are stored 
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Long getTs() {
		return ts;
	}
	public void setTs(Long ts) {
		this.ts = ts;
	}
	public String getLinksUrl() {
		return linksUrl;
	}
	public void setLinksUrl(String linksUrl) {
		this.linksUrl = linksUrl;
	}
	
}
