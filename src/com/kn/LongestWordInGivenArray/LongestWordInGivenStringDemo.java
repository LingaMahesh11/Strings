package com.kn.LongestWordInGivenArray;

public class LongestWordInGivenStringDemo {

	public static void main(String[] args) {
		String s1 = "i am a good boy";
		
		LongestWordInGivenString longestWord = new LongestWordInGivenString();
		String s2 = longestWord.findLongestWord(s1);
		System.out.println(s2);
	}

}
