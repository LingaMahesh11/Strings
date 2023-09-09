package com.kn.CeaserCipher;

import java.util.Scanner;

public class CeaserCipherDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String inputString = scan.next();
		
		System.out.println("Enter jump number: ");
		int k = scan.nextInt();
		
		CeaserCipher result = new CeaserCipher();
		String ceaserCipher = result.changingToCeaserCipher(inputString,k);
		
		System.out.println(ceaserCipher);
		scan.close();
	}

}
