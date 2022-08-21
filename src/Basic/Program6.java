package Basic;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Program6 {
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the amount in Indian Rupees to be converted to US Dollars.");
		float rupee = scan.nextFloat();
		
		System.out.print("Please enter US dollar conversion rate : ");
		float conversionRate = scan.nextFloat();
		
		float result = rupee/conversionRate;
		
		System.out.println("The RUPEE to US dollar is : " + result);
		
	}

}
