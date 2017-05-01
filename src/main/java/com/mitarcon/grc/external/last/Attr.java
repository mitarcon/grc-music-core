package com.mitarcon.grc.external.last;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attr {
	
	private String forSearch;
	private int rank;
	private String artist;
	private int page;
	private int perPage;
	private int totalPages;
	private int total;

	@JsonProperty("for")
	public String getForSearch() {
		return forSearch;
	}
	@JsonProperty("for")
	public void setForSearch(String forSearch) {
		this.forSearch = forSearch;
	}

	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Attr [forSearch=" + forSearch + ", rank=" + rank + ", artist=" + artist + ", page=" + page
				+ ", perPage=" + perPage + ", totalPages=" + totalPages + ", total=" + total + "]";
	}
	
	
}
