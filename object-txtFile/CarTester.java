/*
  @Author: Mangaliso Mngomezulu
  BSc Computer Science and Information Technology Student, University Of KwaZulu Natal South Africa
  Description: A CarTester class that tests the Driver and Car class by instiating objects and writing the objects to a text file
*/

import java.io.*;
import java.util.*;

public class CarTester {
	
   public static Driver createDriver() {
	   
	   //declare variables
	   String name="";
	   int age = 0;
	   Scanner in = new Scanner(System.in);
	   
	   //get the input
	   System.out.print("Driver name: ");  name = in.nextLine();
	   System.out.print("Driver age : ");  age = in.nextInt();
	   
	   //use the input to create the object
	   Driver driver = new Driver(name, age); //create driver object
	   
	   //return the Driver object
	   return driver;
   } //ends
   
   
   
   public static Car createCar() {
	   
	   //declare variables
	   Scanner in = new Scanner(System.in);
	   String carName = "";
	   int year = 0;
	   
	   //get the user input
	   System.out.print("Car make: ");  carName = in.nextLine();
	   System.out.print("Car year: ");  year = in.nextInt();
	   Driver driver = createDriver();
	   
	   //create the Car object
	   Car carObject = new Car(carName, year, driver);
	   
	   //return the Car object
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
	   catch(IOException e) { //what to do if the file does not exist? tell the user
		   System.out.println("THE file does not exist");
	   }
	   
	   //close the file connection
	   pw.close();
   }
}
