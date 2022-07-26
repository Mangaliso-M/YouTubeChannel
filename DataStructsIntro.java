import java.util.*;

class DataStructsIntro{
    public static void main(String[] args){
        
        //Instantiate a LinkedList of stirngs
        LinkedList<String> llist = new LinkedList<String>();

        //add items
        llist.add("Paris");
        llist.add("Barcelona");
        llist.add("Pretoria");
        llist.add("Cape Town");
        llist.add("New York");
        
        //retrieve the first and last elements
        System.out.println("First item: "+llist.getFirst());
        System.out.println("Last item: "+llist.getLast());
        
        //retrieve an element by index
        System.out.println("3rd item: "+llist.get(3));
        
        //traverse the list
        for(String city: llist){
            System.out.println(city);
        } 

        //check if the list is empty
        System.out.println("The list is empty? : "+llist.isEmpty());

        //remove an item
        llist.remove("Paris");

        //traverse the list
        System.out.println("===============================================");
        for(String city: llist){
            System.out.println(city);
        }   
    }
}