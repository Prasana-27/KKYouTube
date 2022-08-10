package Basic;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Simple Interest Calculation");
		System.out.print("Please Enter the Principal Amount : ");
		int p = scan.nextInt();
		System.out.print("Interest Rate in % : ");
		double i = scan.nextDouble();
		System.out.print("Tenure in Years : ");
		double y = scan.nextDouble();
		
		double interestAmount = calculateSI(p,i,y);
		
		System.out.print("Your Interest Amount for Princical :"+p+" is "+interestAmount);
		
		

	}
	
	static double calculateSI(int p , double i , double y ) {
		
		double interestAmount = (p*i*y) /100 ;
		return interestAmount;
		
	}

}
