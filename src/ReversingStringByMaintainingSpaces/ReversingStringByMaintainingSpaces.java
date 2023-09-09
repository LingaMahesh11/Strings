package ReversingStringByMaintainingSpaces;

public class ReversingStringByMaintainingSpaces {
	public String reversingString(String inputString) {
		String[] srr = inputString.split(" ");

		StringBuffer s = new StringBuffer();
		for (int i = srr.length - 1; i >= 0; i--) {
			char[] crr = srr[i].toCharArray();
			for (int j = crr.length - 1; j >= 0; j--) {
				 s.append(crr[j]);
			}
			s.append(" ");
		}
		String result = s.toString();
		return result;
	}
}
