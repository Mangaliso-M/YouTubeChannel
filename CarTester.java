package gettingBetter;

public class CarTester {
	
   
   public static void main(String[] args) {
	   
	   //create driver objects
	   Driver driver1 = new Driver("Musa", 38);
	   Driver driver2 = new Driver("Leon", 49);
	   
	   //create Car object and associate them with the drivers.
	   Car car1 = new Car("Mercedes-Benz GLB", 2020, driver1);
	   Car car2 = new Car("BMW X6 ", 2020, driver1);
	   Car car3 = new Car("BMW X6 ", 2020, driver2);
	    
	   System.out.println(car1.toString());
	   System.out.println(car3.toString());
    }
}
