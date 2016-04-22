package PokerGame;

public class Card {

	private final Color color;
	private final Figure figure;

	public Card(Color kolor, Figure figura) {
		this.color = kolor;
		this.figure = figura;
	}

	public Figure getFigure() {
		return figure;
	}

	public Color getColor() {
		return color;
	}

	public int getFigureValue() {
		return figure.getValue();
	}

}
