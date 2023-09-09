package com.kn.Strings;

import java.util.Scanner;

public class SubStringSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		
		print(str);
	}
	public static void print(String str) {
		
		char[] crr = str.toCharArray();
		
		for(int i=0;i<crr.length;i++) {
			for(int j =i;j<crr.length;j++) {
				for(int k=0;k<=j;k++) {
					System.out.print(crr[k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
