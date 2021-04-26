package gettingBetter;

public class Car {
	
	private String make;
	private int year; //the year in which the car was made
	private Driver driver;
	
	
	//default constructor
	public Car() {

		make ="";
		year = 0;
		driver = null;
	}
	
	//overloaded constructor
	public Car(String make, int year, Driver driver) {
		setMake(make);
		setYear(year);
		setDriver(driver);
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String toString() {
		return ">>Make: "+make+" , Year: "+year+" , driven by => ["+driver.toString()+"]";
	}
}
