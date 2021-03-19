package javaIntroduction;

public class Circle implements Quantifiable{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return PI * Math.pow(radius, 2);
	}
	
	@Override
	public double perimeter() {
		return 2 * PI * radius; 
	}
}
