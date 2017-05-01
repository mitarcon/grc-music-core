package com.mitarcon.grc.external.last;

import java.util.Arrays;

public class Artist {

	private String name;
	private int  listeners;
	private String mbid;
	private String url;
	private int streamable;
	private Image[] image;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Image[] getImage() {
		return image;
	}
	public void setImage(Image[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + ", listeners=" + listeners + ", mbid=" + mbid + ", url=" + url + ", streamable="
				+ streamable + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
}
