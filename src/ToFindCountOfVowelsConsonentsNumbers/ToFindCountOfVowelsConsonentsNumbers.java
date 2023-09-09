package ToFindCountOfVowelsConsonentsNumbers;

public class ToFindCountOfVowelsConsonentsNumbers {

	// private static final String = null;

	public int countingVowels(String s1) {
		char[] crr = s1.toCharArray();
		int count = 0;
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] == 'a' || crr[i] == 'e' || crr[i] == 'i' || crr[i] == 'o' || crr[i] == 'u') {
				count++;
			}
		}
		return count;
	}

	public int countingNumbers(String s1) {
//		char[] crr = s1.toCharArray();
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {

			char c = s1.charAt(i);
			if (Character.isDigit(c)) {
				count++;
			}
		}
		return count;
	}
	
	public int countingSpecialCharecters(String s1) {
		char[] crr = s1.toCharArray();
		int count = 0;
		for(int i = 0; i < crr.length;i++) {
			if (crr[i] == '@' || crr[i] == '!' || crr[i] == '#' || crr[i] == '$' || crr[i] == '%' || crr[i] == '&' || crr[i] == '*' || crr[i] == '?' || crr[i] == '^') {
				count++;
			}
		}
		return count;
	}
	
	public int countingConsonents(String s1) {
		char[] crr = s1.toCharArray();
		int count = 0;
		for(int i = 0; i < crr.length;i++) {
			if(crr[i] != 'a' || crr[i] != 'e' || crr[i] != 'i' || crr[i] != 'o' || crr[i] != 'u') {
				count++;
			}
		}
		return count;
	}
}
