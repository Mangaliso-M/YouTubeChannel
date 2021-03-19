package javaIntroduction;

public class VehicleTester {

	public static void main(String[] args) {
		
		Vehicle rroyce  = new Vehicle("Rolls Royce", 260); //object of super class
		
		BMW bmw = new BMW("BMW 3 Series", 280);// object of BMW, BMW inherits Vehicle
		
		MercedesTruck mercTruck = new MercedesTruck("Axor", 220);// object of MercedesTruck, MercedesTruck inherits Vehicle
		
		
		Vehicle[] vehicle = new Vehicle[3];
		
		vehicle[0] = bmw;
		vehicle[1] = mercTruck;
		vehicle[2] = rroyce;
		
		
		//processing different objects in one collection (array)
		for(int i = 0; i < vehicle.length; i ++ )
			
			System.out.println(vehicle[i].drive()+"\n");
		
	}
}
