package com.kn.ChangeLowerCaseToUpperCaseAndViseVersa;

public class ChangeLowerCaseToUpperCaseAndViseVersa {
	public String changinUpperCaseToLowerCaseAndViseVersa(String inputString) {
		String[] srr = inputString.split(" ");

		StringBuffer s = new StringBuffer();

		for (int i = 0; i < srr.length; i++) {
			char[] crr = srr[i].toCharArray();
			for (int j = 0; j < crr.length; j++) {
				int a = (int) crr[j];
				if (a >= 97 && a <= 122) {
					crr[j] = (char) (a - 32);
				} 
				else {
					crr[j] = (char) (a + 32);
				}

				s.append(crr[j]);
			}

			s.append(" ");
		}

		String finalString = s.toString();
		return finalString;
	}
}
