package ChangingEachWordFirstLetterToUpperCase;

public class ChangingEachWordFirstLetterToUpperCase {
	public String changingFirstLetterofWordToUpperCase(String inputString) {
		String[] srr = inputString.split(" ");
		
		StringBuffer s = new StringBuffer();

		for (int i = 0; i < srr.length; i++) {
			char[] crr = srr[i].toCharArray();

			int a = (int) crr[0];

			for (int j = 0; j < crr.length; j++) {
				if (a >= 97 && a <= 122) {
					crr[0] = (char) (a - 32);
				}
				//System.out.print(crr[j]);
				s.append(crr[j]);
			}
			s.append(" ");
		}
		
		String afterString = s.toString();
//		System.out.println(afterString);
		
		return afterString;
	}
}
