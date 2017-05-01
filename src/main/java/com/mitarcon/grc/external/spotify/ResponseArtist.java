package com.mitarcon.grc.external.spotify;

public class ResponseArtist {
	private Artists artists;

	public Artists getArtists() {
		return artists;
	}

	public void setArtists(Artists artists) {
		this.artists = artists;
	}

	@Override
	public String toString() {
		return "ResponseArtist [artists=" + artists + "]";
	}
	
	
}
