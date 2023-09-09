package com.kn.ChangeLowerCaseToUpperCaseAndViseVersa;

import java.util.Scanner;

public class ChangeLowerCaseToUpperCaseAndViseVersaDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		
		
		ChangeLowerCaseToUpperCaseAndViseVersa result = new ChangeLowerCaseToUpperCaseAndViseVersa();
		
		String finalResult = result.changinUpperCaseToLowerCaseAndViseVersa(inputString);
		System.out.println(finalResult);
		scan.close();
	}

}
