package javaIntroduction;

public class DeckOfCardsTester {

	public static void main(String[] args) {
		
		DeckOfCards deckOfCards = new DeckOfCards();
		
		for(int i = 0; i < 52; i ++) {
			System.out.print(deckOfCards.dealCard()+"      ");
			
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
