package com.kn.ReverseString;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		//Take input from the user
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to reverse :");
		String s1 = scan.nextLine();
		
		//Create object to reverse string
		ReverseString result = new ReverseString();
		
		//
		String s2 = result.reverseingString(s1);
		System.out.println(s2);
		
		scan.close();
	}

}
