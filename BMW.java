package javaIntroduction;

public class BMW  extends Vehicle{
	
	BMW(){
		super();
	}
	
	BMW(String vehicleName, double maxSpeed){
		super(vehicleName, maxSpeed);
	}
	
	@Override 
	public String drive() {
		return super.drive()+", ##BMW!!";
	}
}
