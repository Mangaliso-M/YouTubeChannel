package javaIntroduction;

public class Square implements Quantifiable{
	
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	public double area() {
		return side * side;
	}
	
	public double perimeter() {
		return 4 * side;
	}
}
