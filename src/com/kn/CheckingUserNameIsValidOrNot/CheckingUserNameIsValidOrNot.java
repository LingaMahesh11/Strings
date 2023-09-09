package com.kn.CheckingUserNameIsValidOrNot;

public class CheckingUserNameIsValidOrNot {
	public boolean validUserName(String input) {
		boolean isValid = false;
		
		if(input.length()>=8 && input.length()<=30) {
			char[] crr = input.toCharArray();
			for(int i=0;i<crr.length;i++) {
				if(crr[0] >=(char)65 && crr[0] <=(char)97 &&crr[0] != '_') {
					if(crr[i]!='!' && crr[i]!='^'&& crr[i]!='%'&& crr[i]!='&' && crr[i]!='?'&& crr[i]!='@'&& crr[i]!='#'&& crr[i]!='$') {
						isValid = true;
					}
					else {
						isValid = false;
						break;
					}
				}
				else {
					isValid = false;
					break;
				}
			}
			
		}
		return isValid;
	}
}
