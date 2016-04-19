package PokerGame;

public enum Kolor {
	H(1), D(2), C(3), S(4);

	private int value;

	private Kolor(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
