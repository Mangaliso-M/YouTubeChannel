package javaIntroduction;

public class Strings {
	public static void main(String[] args) {
		
	  //String methods
	  
	  String fileName  = "file1.png";
	  String fileNumber = "file1.png";
	  
	  System.out.println(fileName.charAt(5));
	  
	  System.out.println(fileName.concat(fileNumber));
	  
	  if(fileName.endsWith(".png")) {
		  System.out.println("This is an image file");
	  }
	  else {
		  System.out.println("The specified file is not an image!");
	  }
	  
	  System.out.println(fileName.equals(fileNumber));
	    
	}
}
