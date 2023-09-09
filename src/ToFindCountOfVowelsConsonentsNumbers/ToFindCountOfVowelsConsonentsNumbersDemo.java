package ToFindCountOfVowelsConsonentsNumbers;

public class ToFindCountOfVowelsConsonentsNumbersDemo {

	public static void main(String[] args) {
		String s1 = "mahesh@3goodone766%$";
		
		ToFindCountOfVowelsConsonentsNumbers result = new ToFindCountOfVowelsConsonentsNumbers();
		
		int vowels = result.countingVowels(s1);
		int consonents = result.countingConsonents(s1);
		int numbers = result.countingNumbers(s1);
		int specialCharecters = result.countingSpecialCharecters(s1);
		
		System.out.println("count of vowels is " + vowels);
		System.out.println("count of consonents is " + consonents);
		System.out.println("count of numbers is " + numbers);
		System.out.println("count of special Charecter is " + specialCharecters);
	}

}
