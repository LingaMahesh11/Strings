package com.kn.AnagramString;

import java.util.Scanner;

public class AnagramStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String inputString1 = scan.next();
		String inputString2 = scan.next();
		
		AnagramString result = new AnagramString();
		
		boolean anagram = result.isAnagram(inputString1, inputString2);
		if(anagram) {
			System.out.println("Yes it a ANAGRAM");
		}
		else {
			System.out.println("No it is NOT ANAGRAM");
		}
		scan.close();
	}

}
