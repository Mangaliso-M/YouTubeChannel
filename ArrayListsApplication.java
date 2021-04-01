package javaIntroduction;
import java.util.*;

public class ArrayListsApplication {

	public static void main(String[] args) {
	   
	   //What is the general format for initializing an ArrayList?
	   //ArrayList<DataType> variableName = new ArrayList<DataType>();
		
	   //Example of an ArrayList declaration and initializing
	   ArrayList<String> countries = new ArrayList<String>();
		
	   //How to add an item?
	   countries.add("South Africa"); //index 0
	   countries.add("Israel");       //index 1
	   countries.add("USA");          //index 2
	   
	   //How retrieve an item?
		System.out.println(countries.get(0));
		System.out.println(countries.get(1));
		
	   
	   
	   //How to find the index of and item in the ArrayList? indexOf(E e)
		int index = countries.indexOf("USA");
		System.out.println(index);
		
	   
	   
	   //How to remove an item in the ArrayList? remove (int index)
		countries.remove("Israel");
	   
		int index2 = countries.indexOf("USA");
		System.out.println(index2);
		
		
	   //How to see if an item is contained in the ArrayList?
		System.out.println(countries.contains("Egypt"));
	   
	   //How get the size of the ArrayList?
       int size = countries.size();
       
       
	}
}
