package com.mitarcon.grc.external.last;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Track {
	
	private String name;
	private int playcount;
	private int listeners;
	private String mbid;
	private String url;
	private int streamable;
	private Artist artist;
	private Image[] image;
	private Attr attr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlaycount() {
		return playcount;
	}
	public void setPlaycount(int playcount) {
		this.playcount = playcount;
	}
	public int getListeners() {
		return listeners;
	}
	public void setListeners(int listeners) {
		this.listeners = listeners;
	}
	public String getMbid() {
		return mbid;
	}
	public void setMbid(String mbid) {
		this.mbid = mbid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getStreamable() {
		return streamable;
	}
	public void setStreamable(int streamable) {
		this.streamable = streamable;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public Image[] getImage() {
		return image;
	}
	public void setImage(Image[] image) {
		this.image = image;
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
		return "Track [name=" + name + ", playcount=" + playcount + ", listeners=" + listeners + ", mbid=" + mbid
				+ ", url=" + url + ", streamable=" + streamable + ", artist=" + artist + ", image="
				+ Arrays.toString(image) + ", attr=" + attr + "]";
	} 
	
}
