package com.kn.AnagramString;

public class AnagramString {
	public boolean isAnagram(String s1, String s2) {
		
		//boolean isAnagramorNot = false;
		if (s1.length() == s2.length()) {
			char[] crr1 = s1.toCharArray();
			char[] crr2 = s1.toCharArray();
			
			String first = sortingCharacterArray(crr1).toString();
			String second = sortingCharacterArray(crr2).toString();
			
//			int count = 0;
//			for(int i = 0; i < crr1.length;i++) {
//				if (crr1[i] == crr2[i]) {
//					count++;
//				}
//			}
			if(first.equals(second)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public char[] sortingCharacterArray(char[] crr) {
		
		for(int i = 0; i < crr.length;i++) {
			for(int j = 0;j < crr.length-1-i;j++) {
				if (crr[j] > crr[j+1]) {
					char temp = crr[j];
					crr[j] = crr[j+1];
					crr[j+1] = temp;
				}
			}
		}
		
		return crr;
	}
}
