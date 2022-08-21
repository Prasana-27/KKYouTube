package Basic;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Program4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("Please press 1 to enter the calculator program or 0 exit ");
	    int option = scan.nextInt();
	    
	    while(option == 1) {
		System.out.print("Please enter 2 number for calculation : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.print("Please enter the operator : ");
		char ch = scan.next().charAt(0);
			calculate(num1,num2,ch);
			break;
	    }
	    if (option != 1 && option!=0) {
	    	System.out.println("Please enter 1 or 0.");
	    	}
	    if(option==0) {
	    	break;
	    }
		}
	    
	    	System.out.println("Exiting the program. Thank You for Trying");
	    
	   
		
		
	}
	
	public static void calculate(int num1 ,int num2 , char ch) {
		int result = 0 ;
		if (ch == '+') {
			result = num1+num2;
		}
		
		if (ch == '-') {
			result = num1-num2;
		}
		
		if (ch == '*') {
			result = num1*num2;
		}
	
		if (ch == '/') {
			result = num1/num2;
		}
		
		System.out.println("The answer of "+num1+" "+ch+" "+num2+" is : " + result);
		
	}

}
