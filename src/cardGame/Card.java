/*
 * Name: Mark Gonzales, 
 * Date: 9/24/26
 * Program: Blackjack Card Game
 * Represents an individual playing card with its suit, name, value, and picture.
 */

package cardGame;

public class Card {
	
	private String cardSuit;
	private String cardName;
	private int cardValue;
	private String cardPicture;
	
	public Card(String cardSuit, String cardName, int cardValue, String cardPicture) {
		this.cardSuit = cardSuit;
		this.cardName = cardName;
		this.cardValue = cardValue;
		this.cardPicture = cardPicture;
	}
	
	public String getCardSuit() {
		return cardSuit;
	}
	
	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public int getCardValue() {
		return cardValue;
	}
	
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
	
	public String getCardPicture() {
		return cardPicture;
	}
	
	public void setCardPicture(String cardPicture) {
		this.cardPicture = cardPicture;
	}
	
	@Override
	public String toString() {
		return cardName + " of " + cardSuit + "s (value " + cardValue + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Card)) {
			return false;
		}
		
		Card otherCard = (Card) obj;
		
		return cardName.equalsIgnoreCase(otherCard.cardName);
	}
	
	public boolean isFaceCard() {
		return cardName.equalsIgnoreCase("jack")
				|| cardName.equalsIgnoreCase("queen")
				|| cardName.equalsIgnoreCase("king");
				
	}
}


