package PokerGame;

import java.util.HashMap;

public class MapaPunktacji {
	private HashMap<Integer, Integer> mapaPunktow;

	public MapaPunktacji() {
		mapaPunktow = new HashMap<Integer, Integer>();
		fillMap();
	}

	public int hash(int maxStack, int nextStack, boolean inRow, boolean sameColor) {
		int hash = 0;
		hash += 25 * maxStack;
		hash += 17 * nextStack;
		if (inRow == true)
			hash += 5;
		if (sameColor == true)
			hash += 2;
		return hash;
	}

	public int get(int key) {
		return mapaPunktow.get(key);
	}

	private void fillMap() {
		mapaPunktow.put(hash(1, 1, false, false), 0);
		mapaPunktow.put(hash(2, 1, false, false), 1);
		mapaPunktow.put(hash(2, 2, false, false), 2);
		mapaPunktow.put(hash(3, 1, false, false), 3);
		mapaPunktow.put(hash(1, 1, true, false), 4);
		mapaPunktow.put(hash(1, 1, false, true), 5);
		mapaPunktow.put(hash(3, 2, false, false), 6);
		mapaPunktow.put(hash(4, 1, false, false), 7);
		mapaPunktow.put(hash(1, 1, true, true), 8);
	}

}
