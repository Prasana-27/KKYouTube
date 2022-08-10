package Basic;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
    	int exitOrContinue = 1 ;
    	while(exitOrContinue == 1){
    	System.out.print("Please enter the number to check odd or even : ");
    	int num = scan.nextInt();
    	System.out.println("The enetered Number is :" + oddOrEven(num));
    	System.out.println("Please 1 to Continue, 0 to Exit");
    	 exitOrContinue = scan.nextInt();
    	System.out.println("----------------------------------------------");
    	}
	}
	
	static String oddOrEven(int num){
	    if(num%2==0 && num>1){
	        return "EVEN";
	    }
	    else{
	        return "ODD";
	    }
	}
}