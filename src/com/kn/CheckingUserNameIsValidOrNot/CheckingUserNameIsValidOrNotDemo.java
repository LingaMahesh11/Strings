package com.kn.CheckingUserNameIsValidOrNot;

import java.util.Scanner;

public class CheckingUserNameIsValidOrNotDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username: ");
		
		String input = scan.next();
		
		CheckingUserNameIsValidOrNot result = new CheckingUserNameIsValidOrNot();
		
		boolean output = result.validUserName(input);
		
		if(output) {
			System.out.println(input + " VALID USERNAME");
		}
		else {
			System.out.println(input+ " INVALID USERNAME");
		}
		scan.close();
	}

}
