package javaIntroduction;

public class Card {
	
	private String face;
	private String suit;
	
	public Card(String cardFace, String cardSuite) {
		face = cardFace;
	    suit = cardSuite;
	}
	
	public String toString() {
		return face+" of "+ suit;
	}
}
