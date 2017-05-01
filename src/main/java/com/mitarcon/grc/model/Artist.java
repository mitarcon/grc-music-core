package com.mitarcon.grc.model;

import java.util.ArrayList;

import com.mitarcon.grc.model.Track;

public class Artist {

	private String name;
	private Integer followers;
	private String id;
	private String image;
	private String from;
	private String url;
	private ArrayList<Track> tracks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getFollowers() {
		return followers;
	}
	public void setFollowers(Integer followers) {
		this.followers = followers;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + ", followers=" + followers + ", id=" + id + ", image=" + image + ", from=" + from
				+ ", url=" + url + ", tracks=" + tracks + "]";
	}

	
	
}
