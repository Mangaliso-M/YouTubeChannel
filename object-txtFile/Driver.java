/*
  @Author: Mangaliso Mngomezulu
  BSc Computer Science and Information Technology Student, University Of KwaZulu, Natal South Africa
  Description: Driver class that represents a driver using two attributes, the name and the age of the driver.
*/

public class Driver {
	
	private String name;
	private int age;
	
	//constructor
	public Driver(String name, int age) {
		setName(name); //this.name = name;
		setAge(age);
	}
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
	public String toString() {
		return "name: "+name+" age:"+age;
	}
}
