package com.kn.Strings;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the word :");
		String s1 = scan.next();
		
		char[] crr = s1.toCharArray();
		StringBuffer reverse = new StringBuffer();
		for(int i = s1.length()-1; i >= 0;i--) {
			reverse = reverse.append(crr[i]);
		}
		
		String s2 = reverse.toString();
		if(s1.equals(s2)) {
			System.out.println("Yes it is a pallindrome");
		}
		else {
			System.out.println("No it is not a pallindrome");
		}
		scan.close();
	}

}
