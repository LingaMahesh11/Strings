package com.kn.Strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Jai Sri Ram";
		String s2 = "RAM";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Unequal");
		}
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.substring(8));
		
		System.out.println(s1.indexOf('R'));
		
		System.out.println(s1.indexOf('r'));
		
	}

}
