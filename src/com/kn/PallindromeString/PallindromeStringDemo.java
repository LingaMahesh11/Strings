package com.kn.PallindromeString;

import java.util.Scanner;

public class PallindromeStringDemo {

	public static void main(String[] args) {
		//Take the input from the user
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word :");
		String s1 = scan.nextLine();
		//Create object of pallindrome string class
		
		PallindromeString pallindromeString = new PallindromeString();
		
		//Method of pallindrome string
		
		
		//boolean result = pallindromeString.ispallindromeString(s1);
		//System.out.println(result);
		if( pallindromeString.ispallindromeString(s1)) {
			System.out.println(s1+" is a pallindrome ");
		}
		else {
			System.out.println(s1+" is not a pallindrome ");
		}
		
		//print output
		
		
		//Release resource
		
		scan.close();
	}

}
