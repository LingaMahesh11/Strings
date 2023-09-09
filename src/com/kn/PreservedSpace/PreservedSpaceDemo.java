package com.kn.PreservedSpace;

import java.util.Scanner;

public class PreservedSpaceDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentencce");
		String input = scan.nextLine();
		
		PreservedSpace result = new PreservedSpace();
		
		char[] drr = result.reversingInPreservedSpaces(input);
		
		for(int i = 0; i<drr.length;i++) {
			System.out.print(drr[i]);
		}
		scan.close();
	}

}
