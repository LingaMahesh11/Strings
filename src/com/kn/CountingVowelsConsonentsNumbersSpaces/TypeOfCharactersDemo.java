package com.kn.CountingVowelsConsonentsNumbersSpaces;

import java.util.Scanner;

public class TypeOfCharactersDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		TypeOfCharacters result = new TypeOfCharacters();
		
		result.countingTypeOfCharacters(input);
		scan.close();
	}

}
