package PokerGame;

public enum Figura {
	DWOJKA(2), TROJKA(3), CZWORKA(4), PIATKA(5), SZOSTKA(6), SIODEMKA(7), OSEMKA(8), DZIEWIATKA(9), 
	DZIESIATKA(10), J(11), Q(12), K(13), A(14);

	private int value;

	private Figura(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
