package javaIntroduction;

public class House{
	private int numRooms;
	
	public House(int numRooms) {
		this.numRooms = numRooms;
	}
	
	public int getNumRooms(){
		return numRooms;
	}
	
	public static void main(String[] args) {
		
		House house = new House(15);
		System.out.println(house.getNumRooms());
		
	}
}