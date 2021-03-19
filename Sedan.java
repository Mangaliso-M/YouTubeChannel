package javaIntroduction;

public class Sedan {
	
	//attributes
	protected int numWheels;
	protected String color;
	
	//constructor(Default)
	public Sedan() {
		numWheels = 4;
		color = "Red";
	}
	
	//constructor(overloaded)
	public Sedan(String color, int numWheels) {
		this.color = color;
		this.numWheels = numWheels;
	}
	
	//method
	public String sound() {
		return "vroom";
	}
}
