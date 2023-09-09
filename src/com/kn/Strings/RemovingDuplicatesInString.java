package com.kn.Strings;

import java.util.Scanner;

public class RemovingDuplicatesInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		
		char[] crr = s.toCharArray();
		crr=sorting(crr);
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<crr.length-1;i++) {
			if(crr[i] !=crr[i+1]) {
				sb.append(crr[i]);
			}
		}
		sb.append(crr[crr.length-1]);
		System.out.println(sb);
		
	}
	public static char[] sorting(char[] crr) {
		
		for(int i =0; i < crr.length;i++) {
			for(int j=0;j<crr.length-1-i;j++) {
				if(crr[j] > crr[j+1]) {
					char temp = crr[j];
					crr[j] = crr[j+1];
					crr[j+1] = temp;
				}
			}
		}
		return crr;
	}

}
