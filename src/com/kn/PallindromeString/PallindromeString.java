package com.kn.PallindromeString;

public class PallindromeString {
	//method to check  the given String is pallindrome or not
	public boolean ispallindromeString(String s1) {
		
		char[] crr = s1.toCharArray();
		StringBuffer reverseString = new StringBuffer();
		for(int i = crr.length-1;i >= 0; i--) {
			reverseString = reverseString.append(crr[i]);
		}
		
		String s2 = reverseString.toString();
		if (s1.equals(s2)) {
			return true;
		}
		
		return false;
	}
}
