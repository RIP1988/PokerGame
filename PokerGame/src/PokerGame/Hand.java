package PokerGame;

import java.util.ArrayList;
import java.util.HashMap;

public class Hand {
	private final int NUMBER_OF_CARDS_IN_HAND = 5;
	private final int NUMBER_OF_FIGURES_IN_EACH_COLOR = 13;
	private Card[] hand;
	private int[] figureTable;
	private int points;
	private int[] notPairedIndexes = { 0, 0, 0, 0, 0 };
	private int maxStackIndex;
	private int nextStackIndex;
	private boolean ifSameColor;
	private boolean ifInRow;
	private PointsMap pointsMap = new PointsMap();

	public Hand(ArrayList<Card> cards) {
		hand = new Card[NUMBER_OF_CARDS_IN_HAND];
		figureTable = new int[NUMBER_OF_FIGURES_IN_EACH_COLOR];
		ifInRow = false;
		ifSameColor = true;
		points = 0;

		for (int i : figureTable) {
			i = 0;
		}

		for (int i = 0; i < NUMBER_OF_CARDS_IN_HAND; i++) {
			hand[i] = cards.get(i);
		}

		fillFigureTable();
		checkSameColor();
		generateResult();
	}

	public int[] getFigureTable() {
		return figureTable;
	}

	public int compareTo(Hand hand) {
		int thisHandPoints = points;
		int oppositeHandPoints = hand.getPoints();
		//sprawdzenie relacji punktowej miedzy obiema rekami
		if (thisHandPoints > oppositeHandPoints) {
			return -1;
		} else if (thisHandPoints < oppositeHandPoints) {
			return 1;
			// porownanie wartosci kart w ukladach (np. w przypadku pary w obu
			// rekach, ktora para jest mocniejsza)
		} else {
			if (maxStackIndex > hand.getMaxStackIndex()) {
				return -1;
			} else if (maxStackIndex < hand.getMaxStackIndex()) {
				return 1;
			} else if (nextStackIndex > hand.getNextStackIndex()) {
				return -1;
			} else if (nextStackIndex < hand.getNextStackIndex()) {
				return 1;
			}
			// sprawdzenie kolejnych kart spoza ukladu, gdy w ukladzie calkowity
			// remis
			int[] notPaired1 = getNotPairedIndexes();
			int[] notPaired2 = hand.getNotPairedIndexes();
			for (int i = 0; i < 5; i++) {
				if (notPaired1[i] > notPaired2[i]) {
					return -1;
				} else if (notPaired1[i] < notPaired2[i]) {
					return 1;
				}
			}
			return 0;
		}
	}

	public int getPoints() {
		return points;
	}

	// wypelnienie 13-elementowej tablicy informacja, ile jakich kart jest w
	// ukladzie
	private void fillFigureTable() {
		for (Card card : hand) {
			figureTable[card.getFigureValue() - 2]++;
		}
	}

	private void checkSameColor() {
		for (int i = 1; i < hand.length; i++) {
			if (hand[i].getColor() != hand[0].getColor()) {
				ifSameColor = false;
			}
		}
	}

	private void generateResult() {
		int maxStack = 0;
		int nextStack = 0;
		// okreslenie najwiekszej grupy takich samych figur, oraz kolejnej
		for (int i = 0; i < figureTable.length; i++) {
			if (figureTable[i] != 0) {
				if (figureTable[i] > maxStack) {
					nextStack = maxStack;
					nextStackIndex = maxStackIndex;
					maxStack = figureTable[i];
					maxStackIndex = i;
				} else if (figureTable[i] == maxStack) {
					nextStack = figureTable[i];
					nextStackIndex = i;
				} else if (figureTable[i] >= nextStack) {
					nextStack = figureTable[i];
					nextStackIndex = i;
				}
			}
		}

		if (maxStack == nextStack) {
			if (maxStackIndex < nextStackIndex) {
				int temp = maxStackIndex;
				maxStackIndex = nextStackIndex;
				nextStackIndex = temp;
			}
		}
		//wypelnienie tablicy kart nie bedacych w zadnym ukladzie
		int notPairedIndexesIndex = 0;
		for (int i = figureTable.length - 1; i >= 0; i--) {
			if (figureTable[i] != 0 && i != maxStackIndex && i != nextStackIndex) {
				notPairedIndexes[notPairedIndexesIndex] = i;
				notPairedIndexesIndex++;
			}
		}
		//wyliczenie roznicy miedzy kartami
		int difference = 0;
		int lastNotZeroIndex = 0;
		int counter = 0;
		for (int i = 0; i < figureTable.length; i++) {
			if (figureTable[i] != 0) {
				if (lastNotZeroIndex == 0 && counter == 0) {
					lastNotZeroIndex = i;
					counter++;
				} else {
					difference += i - lastNotZeroIndex;
					lastNotZeroIndex = i;
				}
			}
		}
		ifInRow = (difference == 4 && maxStack < 2);
		//sprawdzenie, czy poker krolewski. jesli nie, pobranie liczby punktow z mapy
		if (maxStack == 1 && ifSameColor && ifInRow && figureTable[12] == 1) {
			points = 9;
		} else {
			points = pointsMap.get(pointsMap.hash(maxStack, nextStack, ifInRow, ifSameColor));
		}
	}

	private int[] getNotPairedIndexes() {
		return notPairedIndexes;
	}

	private int getMaxStackIndex() {
		return maxStackIndex;
	}

	private int getNextStackIndex() {
		return nextStackIndex;
	}

}
