package PokerGame;

public enum Figure {
	DWOJKA(2), TROJKA(3), CZWORKA(4), PIATKA(5), SZOSTKA(6), SIODEMKA(7), OSEMKA(8), DZIEWIATKA(9), 
	DZIESIATKA(10), J(11), Q(12), K(13), A(14);

	public int getValue() {
		return value;
	}
	
	private int value;

	private Figure(int value) {
		this.value = value;
	}

}
