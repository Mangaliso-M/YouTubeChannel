//package gettingBetter;

import java.util.Scanner;

public class ExceptionHandlingApp {

	public static int divide(int numerator, int denominator) {
		return numerator / denominator;
	}
	
	public static void main(String[] args) {
		
		
		try {
			//the code that has a possibility of throwing an exception
			//Scanner for taking user input
			Scanner scan = new Scanner(System.in);
			
			//get numerator
			System.out.print("Integer numerator = ");
			int numerator = scan.nextInt();
			
			//get denominator
			System.out.print("Integer denominator = ");
			int denominator = scan.nextInt();
			
			//display quotient
			System.out.println("Quotient = "+divide(numerator,denominator));
		
		}catch(ArithmeticException exception) {
			//the code that responds to the exception in try block, it if is thrown
			
			System.err.println("You cannot divide by 0");
		}
	}

}
