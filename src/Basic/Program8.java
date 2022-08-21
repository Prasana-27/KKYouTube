package Basic;

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class Program8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the number to check for Armstrong Number : ");
		int userInput = scan.nextInt();
		
		System.out.println(checkArmStrongNumber(userInput));
		
		

	}
	
	public static boolean checkArmStrongNumber (int num) {
		
		int result = 0;
		int test = num,userinput = num;
		int count = 0 ;
		while(num>0) {
			num = num/10;
			count++;
		}
		
		while(test>0) {
			result += Math.pow((test%10),count);
			test = test/10;
			
			
		}
		if (result == userinput) return true;
		return false;
		
	}

}
