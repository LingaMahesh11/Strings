package com.kn.CountingVowelsConsonentsNumbersSpaces;

public class TypeOfCharacters {
	public void countingTypeOfCharacters(String input) {

		char[] crr = input.toCharArray();
		int upperCaseVowel = 0;
		int upperCaseConsonants = 0;
		int lowerCaseVowel = 0;
		int lowerCaseConsonants = 0;
		int numbers = 0;
		int spaces = 0;
		int specialCharacter = 0;

		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 65 && crr[i] < 90) {
				if (crr[i] == 'A' || crr[i] == 'E' || crr[i] == 'I' || crr[i] == 'O' || crr[i] == 'U') {
					upperCaseVowel++;
				} 
				else {
					upperCaseConsonants++;
				}
			} 
			else if (crr[i] >= 97 && crr[i] < 122) {
				if (crr[i] == 'a' || crr[i] == 'e' || crr[i] == 'i' || crr[i] == 'o' || crr[i] == 'u') {
					lowerCaseVowel++;
				} 
				else {
					lowerCaseConsonants++;
				}
			} 
			else if (crr[i] >= 48 && crr[i] <= 57) {
				numbers++;
			} 
			else if (crr[i] == 32) {
				spaces++;
			} 
			else {
				specialCharacter++;
			}

		}

		System.out.println("Upper case vowels count is " + upperCaseVowel);
		System.out.println("Upper case consonants count is " + upperCaseConsonants);
		System.out.println("Lower case vowels count is " + lowerCaseVowel);
		System.out.println("Upper case consonants count is " + lowerCaseConsonants);
		System.out.println("Numbers count is " + numbers);
		System.out.println("Spaces count is " + spaces);
		System.out.println("Special Character count is " + specialCharacter);
	}
}
