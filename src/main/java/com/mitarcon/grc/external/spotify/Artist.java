package com.mitarcon.grc.external.spotify;

import java.util.Arrays;

public class Artist {

	private External_url external_urls;
	private Followers followers;
	private String[] genres;
	private String href;
	private String id;
	private Image[] images;
	private String name;
	private int popularity;
	private String type;
	private String uri;
	
	public External_url getExternal_urls() {
		return external_urls;
	}
	public void setExternal_urls(External_url external_urls) {
		this.external_urls = external_urls;
	}
	public Followers getFollowers() {
		return followers;
	}
	public void setFollowers(Followers followers) {
		this.followers = followers;
	}
	public String[] getGenres() {
		return genres;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Image[] getImages() {
		return images;
	}
	public void setImages(Image[] images) {
		this.images = images;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	@Override
	public String toString() {
		return "Artist [external_urls=" + external_urls + ", followers=" + followers + ", genres="
				+ Arrays.toString(genres) + ", href=" + href + ", id=" + id + ", images=" + Arrays.toString(images)
				+ ", name=" + name + ", popularity=" + popularity + ", type=" + type + ", uri=" + uri + "]";
	}
	
	
	
}
