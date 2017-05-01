package com.mitarcon.grc.external.spotify;

import java.util.Arrays;

public class Album {
	
	private String album_type;
	private Artist[] artists;
	private String[] available_markets;
	private External_url external_urls;
	private String href;
	private String id;
	private Image[] images;
	private String name;
	private String type;
	private String uri;
	
	public String getAlbum_type() {
		return album_type;
	}
	public void setAlbum_type(String album_type) {
		this.album_type = album_type;
	}
	public Artist[] getArtists() {
		return artists;
	}
	public void setArtists(Artist[] artists) {
		this.artists = artists;
	}
	public String[] getAvailable_markets() {
		return available_markets;
	}
	public void setAvailable_markets(String[] available_markets) {
		this.available_markets = available_markets;
	}
	public External_url getExternal_urls() {
		return external_urls;
	}
	public void setExternal_urls(External_url external_urls) {
		this.external_urls = external_urls;
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
		return "Album [album_type=" + album_type + ", artists=" + Arrays.toString(artists) + ", available_markets="
				+ Arrays.toString(available_markets) + ", external_urls=" + external_urls + ", href=" + href + ", id="
				+ id + ", images=" + Arrays.toString(images) + ", name=" + name + ", type=" + type + ", uri=" + uri
				+ "]";
	}
	
	
}
