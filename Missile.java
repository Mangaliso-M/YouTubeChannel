package javaIntroduction;

/*
 * @Author: Mangaliso Mngomezulu.
 * @Channel: https://youtube.com/channel/UCNgcWqzPYDLSitGo2QnKUdw
 * @Description: A simple class on the concept of encapsulation. This class code should be evaluted in conjunction with the 
 *               MissileTester.java file. 
 *               
 *@Tips: if using jGrasp, you may want to remove the first line
 * * */

public class Missile {
	
	//attributes
	private String missileID;   
	private double weight;      //has a fractional part/ decimal
	private String manufacturer; //should be surrounded by double quotes
	private boolean isFast;    //true, false
	
	//constructors/constructor
	public Missile(){
		
		missileID = "";
		weight = 0;
		manufacturer = "";
		isFast = false;
	}
	
	//constructor with parameters
	public Missile(String missileIDValue , double weightValue, String manufacturerName, boolean isFastValue) {
		
		setMissileID(missileIDValue);
		setWeight(weightValue);
		setManufacturer(manufacturerName);
		setIsFast(isFastValue);
	}
	
	/*
	 * Getters
	 * */
	public String getMissileID() {
		return missileID;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public boolean getIsFast() {
		return isFast;
	}
	
	/*
	 * Setters: setters are methods used to initialize attribute values. The reason we use methods and not just the
	 * simply initializing is that we want to control the way the attributes values are assigned to the attributes.
	 * The methods allow us to have this control. The methods are then called/invoked in the Constructor. 
	 * */
    public void setIsFast(boolean isFastValue) {
    	if(isFastValue == true) {
    		isFast = isFastValue;	
    	}
    	else {
    		throw new IllegalArgumentException("Sorry!, We only use fast Missiles.");
    	}
    }
    
	public void setManufacturer(String manufacturerName) {
		if(manufacturerName.equalsIgnoreCase("Denel")) {
			manufacturer = manufacturerName;
		}
		else {
			throw new IllegalArgumentException("Sorry!, We only take use Missiles from Denel.");
		}
	}
	
	public void setMissileID(String missileIDValue) {
		if(missileIDValue.length() >= 10) {
			missileID = missileIDValue;
		}
		else {
			throw new IllegalArgumentException("Missile Id Must be at least 10 charecters");
		}
	}
	
	public void setWeight(double weightValue) {
		
		if(weightValue >= 200) {
			weight = weightValue;
		}
		else {
			throw new IllegalArgumentException("Weight should be at least 200kg");
		}
	}
	
	
	/*
	 * This method simply returns a string representation of the object invoking it.
	 * */
	public void displayInfo(){	
		System.out.println(missileID+", "+weight+", "+manufacturer+", "+isFast);
	}
}