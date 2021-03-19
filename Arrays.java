package javaIntroduction;

public class Arrays {

	public static void main(String[] args) {
	   
		int[] array = {3, 4, 5, 1 , 10, 89, 7};
		
		//display number of elements in  the array
		System.out.println("Length = "+array.length);
		
		
		//product of all elements in the array of integers
		int product = 1;
		for(int i = 0; i < array.length; i++) {
			product *= array[i]; //i = 0, 1,2 ... 4
		}
		System.out.println("Prodcut = "+product);
		
		//sum of all elements in the array of integers
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i]; //i = 0, 1,2 ... 4
		}
		System.out.println("Sum = "+sum);
		
		//average of all elements in the array of integers
		System.out.println("Avg = "+(sum / array.length));
		
		
		//maximum of all elements in the array	of integers
		int max = array[0];
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Max = "+max);
		
	}
}
