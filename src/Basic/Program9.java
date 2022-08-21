package Basic;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Program9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter a word to check for palindrome : ");
		String userInput = scan.next();
		
		System.out.println(palindrome(userInput));
		

	}
	
	public static boolean palindrome(String input) {
		String result = "";
		for (int i = input.length()-1; i >=0 ; i -= 1 ) {
			 result += input.charAt(i)+"";
		}
		if (result.equals(input)) {
			return true;
		}else {
			return false;
		}
	}

}
