package PokerGame;

public enum Figura {
	Dwojka(2), Trojka(3), Czworka(4), Piatka(5), Szostka(6), Siodemka(7), Osemka(8), Dziewiatka(9), 
	Dziesiatka(10), J(11), Q(12), K(13), A(14);

	private int value;

	private Figura(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
