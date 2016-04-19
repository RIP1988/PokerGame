package PokerGame;

public class Karta {

	private final Kolor kolor;
	private final Figura figura;

	public Karta(Kolor kolor, Figura figura) {
		this.kolor = kolor;
		this.figura = figura;
	}

	public Figura getFigura() {
		return figura;
	}

	public Kolor getKolor() {
		return kolor;
	}

	public int getFigureValue() {
		return figura.getValue();
	}

}
