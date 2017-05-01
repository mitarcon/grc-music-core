package com.mitarcon.grc.external.spotify;

import java.util.Arrays;

public class Artists {
	
	private String href;
	private Artist[] items;
	private int limit;
	private String next;
	private int offset;
	private String previous;
	private int total;
	
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public Artist[] getItems() {
		return items;
	}
	public void setItems(Artist[] items) {
		this.items = items;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Artists [href=" + href + ", items=" + Arrays.toString(items) + ", limit=" + limit + ", next=" + next
				+ ", offset=" + offset + ", previous=" + previous + ", total=" + total + "]";
	}
	
	
}
