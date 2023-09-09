package com.kn.IpAdressChecking;

public class IpAdressChecking {
	public boolean ipAdressCheck(String s) {
		String[] srr = s.split(".");

		if (srr.length == 4) {
			int count = 0;
			for (int i = 0; i < srr.length; i++) {
				char[] crr = srr[i].toCharArray();
				int sum = 0;
				for (int j = 0; j < crr.length; j++) {
					int k = crr[j] - 48;
					sum = sum * 10 + k;
				}
				if (sum >= 0 && sum <= 255) {
					count++;
				} 
				else {
					return false;
				}
				
			}
			
			if (count == srr.length) {
				return true;
			}

		}
		return false;
	}
}
