package readingFiles;

public class Patient {
	
	private String fullName;
	private int age; 
	private double weight;
	private String illness;
	
	public Patient(String fullName, int age, double weight, String illness) {
		this.fullName = fullName;
		this.age = age;
		this.weight = weight;
		this.illness = illness;
	}
	
	public String toString() {
		return fullName+","+age+","+weight+","+illness;
	}
}
