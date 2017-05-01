package com.mitarcon.grc.model;

public class Track {
	
	private String name;
	private String id;
	private String url;
	private String image;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Track [name=" + name + ", id=" + id + ", url=" + url + ", image=" + image + "]";
	}
	
	
}
