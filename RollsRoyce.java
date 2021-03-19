package javaIntroduction;

public class RollsRoyce extends Sedan{
    
	//attributes
	private String  model;	
		
	//constructor(Default)
	public RollsRoyce() {
		
		super();
		model = "Ghost Series II";
	}
	
	//constructor(overloaded)
	public RollsRoyce(String color, int numWheels, String model) {
		
		super(color , numWheels);
		this.model = model;
	}
	
	//method overriding
	@Override
	public String sound() {
		
		return super.sound()+"mmmm";
	}
    
	
	public static void main(String [] args) {
		
		RollsRoyce rr = new RollsRoyce();
		RollsRoyce rr2 = new RollsRoyce("Darkest Tungsten", 4 ,"Wraith(2021)");
		
		System.out.println("Color:  "+rr.color);
		System.out.println("Model:  "+rr.model);
		System.out.println("Wheels: "+rr.numWheels);
		System.out.println("Sound:  "+rr.sound());
		
		System.out.println("\n######################################\n");
		
		System.out.println("Color:  "+rr2.color);
		System.out.println("Model:  "+rr2.model);
		System.out.println("Wheels: "+rr2.numWheels);
		System.out.println("Sound:  "+rr2.sound());
		
	}
}
