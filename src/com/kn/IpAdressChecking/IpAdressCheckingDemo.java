package com.kn.IpAdressChecking;

public class IpAdressCheckingDemo {

	public static void main(String[] args) {
		String s = "98.162.254.222";
		
		IpAdressChecking result = new IpAdressChecking();
		
		boolean Ip = result.ipAdressCheck(s);
		
		if(Ip) {
			System.out.println("IP adresss valid");
		}
		else {
			System.out.println("IP adresss is not valid");
		}
	}

}
