package javaIntroduction;
import java.util.*;

public class Operators {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int firstNum = in.nextInt();
		
		System.out.println("Enter second number:");
		double secondNum = in.nextDouble();
		
		double sum = firstNum + secondNum;
		
		if(sum > 100) {
			System.out.println("The sum is:"+sum );
		}
		else {
			System.out.println("Sum is too low!");	
		}
		
	}
}
