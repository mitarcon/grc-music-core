package com.mitarcon.grc.external.last;

public class ResponseArtist {
	
	private ResultArtist results;

	public ResultArtist getResults() {
		return results;
	}

	public void setResults(ResultArtist results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "ResponseArtist [results=" + results.toString() + "]";
	}


}
