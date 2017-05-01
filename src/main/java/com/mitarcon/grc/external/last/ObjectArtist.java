package com.mitarcon.grc.external.last;

import java.util.Arrays;

public class ObjectArtist {

	private Artist[] artist;

	public Artist[] getArtist() {
		return artist;
	}

	public void setArtist(Artist[] artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "ObjectArtist [artist=" + Arrays.toString(artist) + "]";
	}


	
	
}
