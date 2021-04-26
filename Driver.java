package gettingBetter;

public class Driver {
	
	private String name;
	private int age;
	
	//constructor
	public Driver(String name, int age) {
		setName(name);
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
    
	@Override
	public String toString() {
		return "name: "+name+" age:"+age;
	}
}
