package javaIntroduction;

public class Statics {
	
	static int temp = 20; //private
    	
	public static void main(String[] args) {
	  
	   //System.out.println(Statics.temp); //ClassName.varibleName

       Statics sts1 = new Statics();
       Statics sts2 = new Statics();
       Statics sts3 = new Statics();
       
              
       System.out.println("sts1 before:"+ sts1.temp);
       System.out.println("sts2 before:"+ sts2.temp);
       System.out.println("sts3 before:"+ sts3.temp);
       
       temp += temp; //temp = temp + temp; = 20 +20
       
       System.out.println("sts1 after:"+ sts1.temp);
       
       sts2.temp = 99;
       
       System.out.println("sts2 after:"+ sts2.temp);
       System.out.println("sts3 after:"+ sts3.temp);
       System.out.println("sts1 after:"+ sts1.temp);
       
       
	}
}
