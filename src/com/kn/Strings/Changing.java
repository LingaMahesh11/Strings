package com.kn.Strings;

public class Changing {

	public static void main(String[] args) {
		String s = "i love java programing";

		String[] srr = s.split(" ");

		for (int i = 0; i < srr.length; i++) {
			char[] crr = srr[i].toCharArray();
			int a = (int) crr[0];
			for (int j = 0; j < crr.length; j++) {
				if (a >= 97 && a <= 122) {
					crr[0] = (char) (a - 32);
				}
				System.out.print(crr[j]);
			}

			System.out.print(" ");
		}
	}

}
