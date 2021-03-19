package javaIntroduction;

public class StaticMethods {
	
	public void sayBye() {
		printHi();
		System.out.println("Bye!");
	}
	
	public static void printHi() {
		
		StaticMethods obj1 = new StaticMethods();
		obj1.sayBye();
		
		System.out.println("Hi Java Student");
	} 
	
	public static void main(String args[]) {
		
		printHi();
		
		
		//printHi(); //StaticMethods.printHi();
	}
}
