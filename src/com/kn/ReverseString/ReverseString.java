package com.kn.ReverseString;

public class ReverseString {
	//Method to reverse the string
	public String reverseingString(String s1) {
		char[] crr = s1.toCharArray();
		
		StringBuilder reverseString = new StringBuilder();
		for(int i = crr.length-1;i >= 0;i--) {
			reverseString = reverseString.append(crr[i]);
		}
		return reverseString.toString();
	}
}
