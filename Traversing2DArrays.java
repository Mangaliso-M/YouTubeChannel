package javaIntroduction;
import java.util.Arrays;

public class Traversing2DArrays {
	public static void main(String[] args) {
		
		
		int[][] array = {{1 ,2 ,4},
				          {5 ,7 ,6},
				          {-99 ,1 ,-9},
				          {2 ,8 ,3}};
		
		//traversing a twoDimensional Array
		for(int row = 0 ; row < array.length; row ++) { //rows
			for(int col = 0 ; col < array[row].length; col ++) { //columns
				System.out.print(array[row][col] + ", ");
			}
			System.out.println();
		}
		
		
		
		//find the smallest/largest element
		int smallest = array[0][0];
		
		for(int row = 0 ; row < array.length; row ++) { //rows
			for(int col = 0 ; col < array[row].length; col ++) { //columns
				
			     if(array[row][col] < smallest) {
			    	 smallest = array[row][col];
			     }	
			}
		}
		
		System.out.println("Smallest = "+ smallest);
	}
}
