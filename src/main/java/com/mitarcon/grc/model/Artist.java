package com.mitarcon.grc.model;

import java.util.Arrays;

public class Artist {

	private String name;
	private int followers;
	private String id;
	private String img;
	private String from;
	private String url;
	private Track[] tracks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Track[] getTracks() {
		return tracks;
	}
	public void setTracks(Track[] tracks) {
		this.tracks = tracks;
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + ", followers=" + followers + ", id=" + id + ", img=" + img + ", from=" + from
				+ ", url=" + url + ", tracks=" + Arrays.toString(tracks) + "]";
	}
	
	
}
