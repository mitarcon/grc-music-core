package com.mitarcon.grc.external.last;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Query {

	private String text;
	private String role;
	private String searchTerms;
	private int startPage;
	
	@JsonProperty("#text")
	public String getText() {
		return text;
	}
	@JsonProperty("#text")
	public void setText(String text) {
		this.text = text;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSearchTerms() {
		return searchTerms;
	}
	public void setSearchTerms(String searchTerms) {
		this.searchTerms = searchTerms;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	@Override
	public String toString() {
		return "Query [text=" + text + ", role=" + role + ", searchTerms=" + searchTerms + ", startPage=" + startPage
				+ "]";
	}
	

}
