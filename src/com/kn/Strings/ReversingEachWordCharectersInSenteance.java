package com.kn.Strings;

public class ReversingEachWordCharectersInSenteance {

	public static void main(String[] args) {
		String s1 = "I am learning strings in java";
		
		String[] srr = s1.split(" ");
//		for(int i = 0; i < srr.length;i++) {
//			printCharecterInReverse(s1);
//		}
		printCharecterInReverse(s1);
	}
	
	public static void printCharecterInReverse(String s1) {
		char[] crr = s1.toCharArray();
		for (int i = crr.length-1;i >= 0; i--) {
			System.out.print(crr[i]);
		}
	}

}
