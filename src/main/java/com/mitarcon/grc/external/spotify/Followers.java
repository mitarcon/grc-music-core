package com.mitarcon.grc.external.spotify;

public class Followers {

	private String href;
	private int total;
	
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Followers [href=" + href + ", total=" + total + "]";
	}
	
	
}
