package javaIntroduction;

public class Car{
	
	//attributes
	String carName = "Rolls Royce";
	double maximumSpeed = 320;
	String color = "Silver-grey";
	
	//method
	public String viewInfo() {
		return "["+carName+"],["+maximumSpeed+"km/h],["+color+"]";
	}
	
	public static void main(String[] args) {
		
		Car carOne = new Car();
		System.out.println(carOne.viewInfo());
				
		System.out.println("==================================");
		System.out.println("Name:" + carOne.carName);
		System.out.println("Max Speed:" + carOne.maximumSpeed);
		System.out.println("Color: " + carOne.color);
		//System.out.println("Color: " + carOne.Color);
	}
}