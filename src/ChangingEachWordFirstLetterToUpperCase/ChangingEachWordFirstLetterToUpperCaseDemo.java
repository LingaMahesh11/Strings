package ChangingEachWordFirstLetterToUpperCase;

import java.util.Scanner;

public class ChangingEachWordFirstLetterToUpperCaseDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the sentence:  ");
		String inputString = scan.nextLine();
		
		ChangingEachWordFirstLetterToUpperCase result = new ChangingEachWordFirstLetterToUpperCase();
		
		String r = result.changingFirstLetterofWordToUpperCase(inputString);
		System.out.println(r);
		scan.close();
	}

}
