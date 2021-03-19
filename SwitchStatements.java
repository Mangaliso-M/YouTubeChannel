package javaIntroduction;

public class SwitchStatements {
	public static void main(String[] args) {
		
		//switch statements
		
		String name = "Manga";
		
		switch(name) {
			
			case "Manga":
				System.out.println("I like your lessons");
				break;
				
			case "Doe":
				System.out.println("I knew it would be Doe!!");
				break;
			
		   default:
			   System.out.println("Your name is not in our books!");
			   break;
		}
		
		
		
	}
}
