package com.kn.Strings;

import java.util.Scanner;

public class RemovingDuplicatesInStringWithoutSorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String s = scan.next();
		
		char[] crr =s.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0;i< crr.length;i++) {
			for(int j =0; j <crr.length;j++) {
				if(crr[i] != crr[j]) {
					sb.append(crr[i]);
				}
			}
		}
		System.out.println(sb);
		String s2 = sb.toString();
		
		char[] crr2 = s2.toCharArray();
		StringBuffer sb2 = new StringBuffer();
		
		for(int i=0;i<crr2.length-1;i++) {
			if(crr2[i] != crr2[i+1]) {
				sb2.append(crr2[i]);
			}
		}
		sb2.append(crr2[crr2.length-1]);
		System.out.println(sb2);
	}

}
