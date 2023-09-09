package com.kn.ConvertingNumbersIntoRomanNumber;

public class ConvertingNumbersIntoRomanNumber {
	public String convertingIntoRomanNumber(int num) {
		String[] srr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			while(num>=arr[i]) {
				num=num-arr[i];
				sb.append(srr[i]);
			}
		}
		
		String romanNumber = sb.toString();
		return romanNumber;
		
	}
}
