package com.mitarcon.grc.external.last;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultArtist {
	
	private Query query;
	private int totalResults;
	private int startIndex;
	private int itemsPerPage;
	private ObjectArtist artistmatches;
	private Attr attr;
	
	@JsonProperty("opensearch:Query")
	public Query getQuery() {
		return query;
	}
	@JsonProperty("opensearch:Query")
	public void setQuery(Query query) {
		this.query = query;
	}
	@JsonProperty("opensearch:totalResults")
	public int getTotalResults() {
		return totalResults;
	}
	@JsonProperty("opensearch:totalResults")
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	@JsonProperty("opensearch:startIndex")
	public int getStartIndex() {
		return startIndex;
	}
	@JsonProperty("opensearch:startIndex")
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	@JsonProperty("opensearch:itemsPerPage")
	public int getItemsPerPage() {
		return itemsPerPage;
	}
	@JsonProperty("opensearch:itemsPerPage")
	public void setItemsPerPage(int itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public ObjectArtist getArtistmatches() {
		return artistmatches;
	}
	public void setArtistmatches(ObjectArtist artistmatches) {
		this.artistmatches = artistmatches;
	}
	@JsonProperty("@attr")
	public Attr getAttr() {
		return attr;
	}
	@JsonProperty("@attr")
	public void setAttr(Attr attr) {
		this.attr = attr;
	}
	@Override
	public String toString() {
		return "ResultArtist [query=" + query + ", totalResults=" + totalResults + ", startIndex=" + startIndex
				+ ", itemsPerPage=" + itemsPerPage + ", artistmatches=" + artistmatches + ", attr=" + attr + "]";
	}
	
	
	
}
