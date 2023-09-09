package com.kn;

import java.util.Scanner;

public class RomanNumberToIntegerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your roman number :");
		String s = scan.next();
		
		RomanNumberToInteger result = new RomanNumberToInteger();
		int output=result.romanToInt(s);
		System.out.println(output);
		
		scan.close();
	}

}
