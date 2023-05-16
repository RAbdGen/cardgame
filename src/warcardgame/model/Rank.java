package warcardgame.model;

public enum Rank {
	ACE("1"), KING("K"), QUEEN("Q"), JACK("J"), TEN("10"), NINE("9"), EIGHT("8"), SEVEN("7"), SIX("6"), FIVE("5"),
	FOUR("4"), THREE("3"), TWO("2");

	private String code;

	private Rank(String code) {
		this.code = code;
	}

	public String code() {
		return code;
	}
}
