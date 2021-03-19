package javaIntroduction;

public class Pass {
   
   //attributes
   private int x;
   private String s;
   
   //constructor
   public Pass(String s, int x) {
	   this.s =s;
	   this.x =x;
   }
   
   //takes an int x and doubles the int x
   public static void doubleNum(int x) {
	   x = x * 2; 
   }
   
  //takes an object of type Pass and doubles it's x value
   public static void doublePassX(Pass obj) {
	   obj.x = obj.x * 2;
   }
   
   public static void main(String args[]) {
	  
	  int x1 = 7;
	  Pass obj = new Pass("string", 13);
	  
	  
	    doublePassX(obj);
	    System.out.println("x of obj = "+obj.x);
   }
}
