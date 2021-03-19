package javaIntroduction;

public class Person {
	private String name;
	
	public Person(String name) {
		setName(name);
	}
	
	public void setName(String name) {
		if(name.length() >= 2) {
			this.name = name;
		}else {
			throw new IllegalArgumentException("Name too short!");
		}
		
	}
	
	public String  getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		Person person = new Person("N");
		System.out.println(person.getName());
		person.setName("YouTube");
		System.out.println(person.getName());
		
	}
}
