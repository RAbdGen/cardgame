package warcardgame.model;

public class Card {
	private Suit suit;
	private Rank rank;

	public Rank rank() {
		return rank;
	}

	public Suit suit() {
		return suit;
	}

	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toText() {
		return this.rank.code() + this.suit.code();
	}

}
