package javaIntroduction;

public class BreakContinueStatements {
	public static void main(String[] args) {
		
		//break: when condition is met, stop the execution
		for(int i = 0 ; i < 5; i++) {
			
			if(i == 2)
				break;
			
			System.out.println(i);	
		}
		
		//continue: skip i = 2, i.e i = 0 , 1, 3, , 4 ...
		for(int i = 0 ; i < 5; i++) {
			
			if(i == 2)
				continue;
			
			System.out.println(i);	
		}
	}
}
