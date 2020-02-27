package com.foundation;

public class foundation {
	private String makeup;
	private String packaging;
	private int grams;
	
	public foundation(String makeup, String packaging, int grams) {
		this.makeup = makeup;
		this.packaging = packaging;
		this.grams = grams;
	}
	
	public String getMakeup() {
		return makeup;
	}

	public void setMakeup(String makeup) {
		this.makeup = makeup;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packagingShape) {
		this.packaging = packagingShape;
	}

	public int getGrams() {
		return grams;
	}

	public void setGrams(int palette) {
		this.grams = palette;
	}

	public void coverage(String coverage) {
		System.out.println("It is " + coverage + " coverage");
	}
	
	public void shade(String shade) {
		System.out.println("It is in " + shade + " shade" + "\n");
	}
}
