package com.kn.CountingReapeatedCharecters;

import java.util.Scanner;

public class CountingReapeatedCharectersDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String inputString = scan.next();
		
		CountingReapeatedCharecters sorting = new CountingReapeatedCharecters();
		
		sorting.countingRepetedCharectersInString(inputString);
		scan.close();
	}

}
