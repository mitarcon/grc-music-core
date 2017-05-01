package com.mitarcon.grc.external.last;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultTopTracks {
	
	private Track[] track;
	private Attr attr;
	
	public Track[] getTrack() {
		return track;
	}
	public void setTrack(Track[] track) {
		this.track = track;
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
		return "ResponseTrack [track=" + Arrays.toString(track) + ", attr=" + attr + "]";
	}
	
}
