package com.foundation;

public class polymorphismBbCream {

	public static void main(String[] args) {
		foundation f1 = new foundation("Foundation", "Dropper", 30);
		System.out.println(f1.getMakeup());
		System.out.println("Packaging Type: " + f1.getPackaging());
		System.out.println("Grams: " + f1.getGrams());
		f1.coverage("full");
		f1.shade("beige");

		facePowder fp1 = new facePowder("Face Powder", "Compact", 10, "Pressed Powder");
			System.out.println(f1.getMakeup());
			System.out.println("Packaging Type: " + fp1.getPackaging());
			System.out.println("Grams: " + fp1.getGrams());
			System.out.println("Type of Powder: " + fp1.getPowderType());
			fp1.spf(50);
			fp1.coverage("sheer", 12);
			fp1.shade("natural");
		
		foundation bbCream = new foundation("BB Cream", "Tube", 20);
	
		acceptFoundation(bbCream);	
	}

	public static void acceptFoundation(foundation bbCream) {
		System.out.println(bbCream.getMakeup());
		System.out.println("Packaging Type: " + bbCream.getPackaging());
		System.out.println("Grams: " + bbCream.getGrams());
	
		bbCream.coverage("medium");
		bbCream.shade("nude");
	
	}


}
