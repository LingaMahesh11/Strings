package com.kn.CeaserCipher;

public class CeaserCipher {
	public String changingToCeaserCipher(String inputString,int k) {

		char[] crr = inputString.toCharArray();
		
		for (int i = 0; i < crr.length; i++) {
			if ((int) (crr[i] + k) < 122) {
				crr[i] = (char) (crr[i] + k);
			} 
			else {
				int value = (int) (crr[i] + k) - 90;
				crr[i] = (char) (64 + value);
			}
		}

		String outputString = new String(crr);
		return outputString;
	}
}
