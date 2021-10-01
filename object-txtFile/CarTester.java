package gettingBetter;
import java.io.*;
import java.util.*;

public class CarTester {
	
   public static Driver createDriver() {
	   
	   String name="";
	   int age = 0;
	   Scanner in = new Scanner(System.in);
	   
	   System.out.print("Driver name: ");  name = in.nextLine();
	   System.out.print("Driver age : ");  age = in.nextInt();
	   
	   Driver driver = new Driver(name, age); //create driver object
	   
	   return driver;
   } //ends
   
   
   
   public static Car createCar() {
	   
	   Scanner in = new Scanner(System.in);
	   String carName = "";
	   int year = 0;
	   
	   
	   System.out.print("Car make: ");  carName = in.nextLine();
	   System.out.print("Car year: ");  year = in.nextInt();
	   Driver driver = createDriver();
	   
	   Car carObject = new Car(carName, year, driver);
	   
	   return carObject;
   }
   
   
 
   public static void main(String[] args) {
	   
    
	   //Task: write the Car Objects into a file
	   
	   //open the file connection
	   File file = new File("carsFromUser.txt");
	   PrintWriter pw = null;
	   
       //attempt to write to the file
	   try {
		   pw = new PrintWriter(file);
		   Car car = null;
		   
		   for(int i=0; i < 3; i++) {
			   car = createCar();
			   pw.println(car.toString());
		   }
		      
	   }
	   catch(IOException e) {
		   System.out.println("THE file does not exist");
	   }
	   
	   //close the file connection
	   pw.close();
   }
}
