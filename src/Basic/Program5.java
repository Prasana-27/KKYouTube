package Basic;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.

public class Program5 {

	public static void main(String[] args) {
		int num1,num2;

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter two number for comparison : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + " is greater than " + num2);
		}
		else {
			System.out.println(num2 + " is greater than " + num1);;
		}

	}

}
