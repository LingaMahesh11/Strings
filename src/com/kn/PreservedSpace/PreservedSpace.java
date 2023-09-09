package com.kn.PreservedSpace;

public class PreservedSpace {
	public char[] reversingInPreservedSpaces(String input) {

		char[] crr = input.toCharArray();

		char[] rrr = new char[crr.length];

		for (int j = 0; j < crr.length; j++) {
			if (crr[j] == ' ') {
				rrr[j] = ' ';
			}
		}
		
		int a = 0;
		for (int i = crr.length-1 ; i >= 0; i--) {
			if(crr[i] != ' ') {
				if(rrr[a] != ' ') {
					rrr[a] = crr[i];
					a++;
				}
				else {
					rrr[a+1] = crr[i];
					a=a+2;
				}
			}
		}

		System.out.println("The output is :");
		return rrr;
	}

}
