package com.mitarcon.grc.external.spotify;

import java.util.Arrays;

public class Track {

	private Album album;
	private Artist[] artists;
	private String[] available_markets;
	private int disc_number;
	private int duration_ms;
	private boolean explicit;
	private External_id external_ids;
	private External_url external_urls;
	private String href;
	private String id;
	private String name;
	private int popularity;
	private String preview_url;
	private int track_number;
	private String type;
	private String uri;
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
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
	public int getDisc_number() {
		return disc_number;
	}
	public void setDisc_number(int disc_number) {
		this.disc_number = disc_number;
	}
	public int getDuration_ms() {
		return duration_ms;
	}
	public void setDuration_ms(int duration_ms) {
		this.duration_ms = duration_ms;
	}
	public boolean isExplicit() {
		return explicit;
	}
	public void setExplicit(boolean explicit) {
		this.explicit = explicit;
	}
	public External_id getExternal_ids() {
		return external_ids;
	}
	public void setExternal_ids(External_id external_ids) {
		this.external_ids = external_ids;
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
	public String getPreview_url() {
		return preview_url;
	}
	public void setPreview_url(String preview_url) {
		this.preview_url = preview_url;
	}
	public int getTrack_number() {
		return track_number;
	}
	public void setTrack_number(int track_number) {
		this.track_number = track_number;
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
		return "Track [album=" + album + ", artists=" + Arrays.toString(artists) + ", available_markets="
				+ Arrays.toString(available_markets) + ", disc_number=" + disc_number + ", duration_ms=" + duration_ms
				+ ", explicit=" + explicit + ", external_ids=" + external_ids + ", external_urls=" + external_urls
				+ ", href=" + href + ", id=" + id + ", name=" + name + ", popularity=" + popularity + ", preview_url="
				+ preview_url + ", track_number=" + track_number + ", type=" + type + ", uri=" + uri + "]";
	}
	
	
}
