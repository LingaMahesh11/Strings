package com.kn.ConvertingNumbersIntoRomanNumber;

import java.util.Scanner;

public class ConvertingNumbersIntoRomanNumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to convert it into a roman number: ");
		
		int num = scan.nextInt();
		
		ConvertingNumbersIntoRomanNumber output = new ConvertingNumbersIntoRomanNumber();
		
		String romanNumber = output.convertingIntoRomanNumber(num);
		
		System.out.println("The roman Number of "+num+" is "+romanNumber);
		
		scan.close();
	}

}
