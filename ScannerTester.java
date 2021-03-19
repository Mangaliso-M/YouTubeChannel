package javaIntroduction;
import java.util.Scanner;

public class ScannerTester {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter name, age, weight. Separate by spaces:");
		
		String name = read.next();
		int age = read.nextInt();
		double weight = read.nextDouble();
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	 
	}
}
