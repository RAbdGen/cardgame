package warcardgame.application;

import warcardgame.model.Card;
import warcardgame.model.Rank;
import warcardgame.model.Suit;

public class CardMain {

	public static void main(String[] args) {
		createCard();

		transformEachSuitElementIntoRightCode();

		transformEachRankElementIntoRightCode();
	}

	private static void createCard() {
		Card aceOfHearts = new Card(Rank.ACE, Suit.HEARTS);
		System.out.println("Ace of Hearts well created !");
		System.out.println("with " + (aceOfHearts).rank() + " as rank and " + aceOfHearts.suit() + " as suit.");
		System.out.println("The display of this card is : " + aceOfHearts.toText());
	}

	private static void transformEachSuitElementIntoRightCode() {
		System.out.println("-------------------");
		System.out.println("Transform each suit elements into right code");
		System.out.println("-------------------");
		System.out.println("The display of " + Suit.CLUBS + " is " + Suit.CLUBS.code());
		System.out.println("The display of " + Suit.DIAMONDS + " is " + Suit.DIAMONDS.code());
		System.out.println("The display of " + Suit.HEARTS + " is " + Suit.HEARTS.code());
		System.out.println("The display of " + Suit.SPADES + " is " + Suit.SPADES.code());
	}

	private static void transformEachRankElementIntoRightCode() {
		System.out.println("-------------------");
		System.out.println("Transform each rank elements into right code");
		System.out.println("-------------------");
		System.out.println("The display of " + Rank.ACE + " is " + Rank.ACE.code());
		System.out.println("The display of " + Rank.TWO + " is " + Rank.TWO.code());
		System.out.println("The display of " + Rank.THREE + " is " + Rank.THREE.code());
		System.out.println("The display of " + Rank.FOUR + " is " + Rank.FOUR.code());
		System.out.println("The display of " + Rank.FIVE + " is " + Rank.FIVE.code());
		System.out.println("The display of " + Rank.SIX + " is " + Rank.SIX.code());
		System.out.println("The display of " + Rank.SEVEN + " is " + Rank.SEVEN.code());
		System.out.println("The display of " + Rank.EIGHT + " is " + Rank.EIGHT.code());
		System.out.println("The display of " + Rank.NINE + " is " + Rank.NINE.code());
		System.out.println("The display of " + Rank.TEN + " is " + Rank.TEN.code());
		System.out.println("The display of " + Rank.JACK + " is " + Rank.JACK.code());
		System.out.println("The display of " + Rank.QUEEN + " is " + Rank.QUEEN.code());
		System.out.println("The display of " + Rank.KING + " is " + Rank.KING.code());
	}
}
