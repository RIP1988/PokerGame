package PokerGame;

public enum Color {
	H(1), D(2), C(3), S(4);

	public int getvalue() {
		return value;
	}

	private int value;

	private Color(int value) {
		this.value = value;
	}

}
