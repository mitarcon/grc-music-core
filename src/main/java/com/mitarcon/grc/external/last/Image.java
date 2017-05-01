package com.mitarcon.grc.external.last;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {

	private String text;
	private String size;
	
	@JsonProperty("#text")
	public String getText() {
		return text;
	}
	@JsonProperty("#text")
	public void setText(String text) {
		this.text = text;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Image [text=" + text + ", size=" + size + "]";
	}
	
	
}
