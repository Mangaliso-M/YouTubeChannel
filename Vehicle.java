package javaIntroduction;

public class Vehicle {
	
	protected String vehicleName;
	protected double maxSpeed;
	
	
	Vehicle(){
		vehicleName = "";
		maxSpeed = 0;
	}
	
	Vehicle(String vehicleName, double maxSpeed){
		this.vehicleName = vehicleName;
		this.maxSpeed = maxSpeed;
	}
	
	protected String drive() {	
		return "The ("+vehicleName+") is moving @"+maxSpeed+"km/hr";
	}
}
