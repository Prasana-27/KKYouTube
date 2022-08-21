package Basic;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Program7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number to which you want to calculate the fibonacci Numbers : ");
		int number = scan.nextInt();
		fibonacciNumbers(number);
		
	}
	
	public static void fibonacciNumbers(int num) {
		int start = 0 ;
		int next = 1 ;
		System.out.print(start + " " + next +" ");
		int count = 1 ;
		
		while (count <=num) {
			count++;
			int temp = next;
			next = start+next;
			start =temp;
			
			System.out.print(next + " " );
		}
	}

}
