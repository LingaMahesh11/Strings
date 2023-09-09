package ReversingStringByMaintainingSpaces;

import java.util.Scanner;

public class ReversingStringByMaintainingSpacesDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String inputString = scan.nextLine();
		
		ReversingStringByMaintainingSpaces r = new ReversingStringByMaintainingSpaces();
		String result = r.reversingString(inputString);
		System.out.println(result);
	}

}
