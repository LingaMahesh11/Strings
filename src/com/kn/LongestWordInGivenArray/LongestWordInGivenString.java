package com.kn.LongestWordInGivenArray;

public class LongestWordInGivenString {
	public String findLongestWord(String s1) {
		String[] srr = s1.split(" ");
		String longstword = "";
		for(int i =0;i < srr.length-1;i++) {
			if(srr[i].length() < srr[i+1].length()) {
				longstword = srr[i+1];
			}
		}
		return longstword;
	}
}
