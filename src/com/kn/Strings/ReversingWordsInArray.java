package com.kn.Strings;

public class ReversingWordsInArray {

	public static void main(String[] args) {
		String s1 = "I am learning strings in java";
		
		String[] srr = s1.split(" ");
		
		for(int i = srr.length-1;i >= 0; i--) {
			System.out.print(srr[i] + " ");
		}
	}

}
