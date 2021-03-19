package javaIntroduction;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean isTall;
		
		System.out.println("Enter Name:");
		String name = input.nextLine();
		
		System.out.println("Enter age:");
		int age = input.nextInt();
		
		System.out.println("Enter Weight(in kg):");
		double weight = input.nextDouble();
		
		System.out.println("Enter Height(in cm):");
		double height = input.nextDouble();
		height = height / 100;//in m
		
		System.out.println("Gender: ");
		char gender = input.next().charAt(0);
		
		//metric units
		double bmi = weight / (height * height);
		
		//
		if(age < 18 && height > (150/100)) {
			isTall = true;
		}
		else {
			isTall = false;
		}
		
		//outputs to the user
		System.out.println();
		System.out.println("###############################");
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		
		System.out.println("BMI: "+ bmi);
		System.out.println("Tall? "+ isTall);
		
		System.out.println();
		System.out.println("###############################");
		
	}
}
