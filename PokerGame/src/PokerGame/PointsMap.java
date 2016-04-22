package PokerGame;

import java.util.HashMap;
import java.util.Map;

public class PointsMap {
	private Map<Integer, Integer> pointsMap;

	public PointsMap() {
		pointsMap = new HashMap<Integer, Integer>();
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
		return pointsMap.get(key);
	}

	private void fillMap() {
		pointsMap.put(hash(1, 1, false, false), 0);
		pointsMap.put(hash(2, 1, false, false), 1);
		pointsMap.put(hash(2, 2, false, false), 2);
		pointsMap.put(hash(3, 1, false, false), 3);
		pointsMap.put(hash(1, 1, true, false), 4);
		pointsMap.put(hash(1, 1, false, true), 5);
		pointsMap.put(hash(3, 2, false, false), 6);
		pointsMap.put(hash(4, 1, false, false), 7);
		pointsMap.put(hash(1, 1, true, true), 8);
	}

}
