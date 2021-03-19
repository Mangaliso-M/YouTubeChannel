package javaIntroduction;

public class MercedesTruck extends Vehicle {
	
	MercedesTruck(){
		super();
	}
	MercedesTruck(String vehicleName, double maxSpeed){
		super(vehicleName, maxSpeed);
	}
	
	@Override 
	public String drive() {
		return super.drive()+", ##Mercedes!!";
	}
}
