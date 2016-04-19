package PokerGame;

import java.util.ArrayList;
import java.util.HashMap;

public class Reka {
	private final int ILOSC_KART_W_RECE = 5;
	private final int ILOSC_FIGUR_W_KAZDYM_Z_KOLOROW = 13;
	private Karta[] reka;
	private int[] figureTable;
	private int points;
	private int[] notPairedIndexes = { 0, 0, 0, 0, 0 };
	private int maxStackIndex;
	private int nextStackIndex;
	private boolean sameColor;
	private boolean inRow;
	private MapaPunktacji mapaPunktow = new MapaPunktacji();

	public Reka(ArrayList<Karta> karty) {
		reka = new Karta[ILOSC_KART_W_RECE];
		figureTable = new int[ILOSC_FIGUR_W_KAZDYM_Z_KOLOROW];
		inRow = false;
		sameColor = true;
		points = 0;

		for (int i : figureTable) {
			i = 0;
		}

		for (int i = 0; i < ILOSC_KART_W_RECE; i++) {
			reka[i] = karty.get(i);
		}

		fillFigureTable();
		checkSameColor();
		generateResult();
	}

	private void fillFigureTable() {
		for (Karta karta : reka) {
			figureTable[karta.getFigureValue() - 2]++;
		}
	}

	public int[] getFigureTable() {
		return figureTable;
	}

	public int compareTo(Reka reka) {
		int thisHandPoints = points;
		int oppositeHandPoints = reka.getPoints();
		if (thisHandPoints > oppositeHandPoints) {
			return -1;
		} else if (thisHandPoints < oppositeHandPoints) {
			return 1;
		} else {
			if (maxStackIndex > reka.getMaxStackIndex()) {
				return -1;
			} else if (maxStackIndex < reka.getMaxStackIndex()) {
				return 1;
			} else if (nextStackIndex > reka.getNextStackIndex()) {
				return -1;
			} else if (nextStackIndex < reka.getNextStackIndex()) {
				return 1;
			}
			// sprawdzenie kolejnych kart spoza ukladu, gdy w ukladzie calkowity
			// remis
			int[] notPaired1 = getNotPairedIndexes();
			int[] notPaired2 = reka.getNotPairedIndexes();
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

	private void checkSameColor() {
		for (int i = 1; i < reka.length; i++) {
			if (reka[i].getKolor() != reka[0].getKolor()) {
				sameColor = false;
			}
		}
	}

	private void generateResult() {
		int maxStack = 0;
		int nextStack = 0;

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
		int notPairedIndexesIndex = 0;
		for (int i = figureTable.length - 1; i >= 0; i--) {
			if (figureTable[i] != 0 && i != maxStackIndex && i != nextStackIndex) {
				notPairedIndexes[notPairedIndexesIndex] = i;
				notPairedIndexesIndex++;
			}
		}
		int roznica = 0;
		int lastNotZeroIndex = 0;
		int licznik = 0;
		for (int i = 0; i < figureTable.length; i++) {
			if (figureTable[i] != 0) {
				if (lastNotZeroIndex == 0 && licznik == 0) {
					lastNotZeroIndex = i;
					licznik++;
				} else {
					roznica += i - lastNotZeroIndex;
					lastNotZeroIndex = i;
				}
			}
		}
		if (roznica == 4 && maxStack < 2) {
			inRow = true;
		} else
			inRow = false;

		if (maxStack == 1 && sameColor && inRow && figureTable[12] == 1) {
			points = 9;
		} else
			points = mapaPunktow.get(mapaPunktow.hash(maxStack, nextStack, inRow, sameColor));
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
