package com.mitarcon.grc.external.spotify;

import java.util.Arrays;

public class Tracks {
	
	private Track[] tracks;

	public Track[] getTracks() {
		return tracks;
	}

	public void setTracks(Track[] tracks) {
		this.tracks = tracks;
	}

	@Override
	public String toString() {
		return "Tracks [tracks=" + Arrays.toString(tracks) + "]";
	}
	
	
}
