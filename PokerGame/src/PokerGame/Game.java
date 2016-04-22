package PokerGame;

import java.util.ArrayList;
import java.util.HashMap;

public class Game {

	private HashMap<String, Card> stringKeyToCardClassMap = new HashMap<String, Card>();
	private int nextDealOutIndex;
	private ArrayList<ArrayList<Card>> allDealOuts = new ArrayList<ArrayList<Card>>();

	public Game(ArrayList<ArrayList<String>> allDealOuts) {
		defineMap();
		fillDealOutsList(allDealOuts);

		nextDealOutIndex = 0;
	}

	public ArrayList<Card> giveDealOut() {
		return allDealOuts.get(nextDealOutIndex++);

	}

	public int giveNumberOfDealOuts() {
		return allDealOuts.size();
	}

	private void fillDealOutsList(ArrayList<ArrayList<String>> allDealOutsString) {

		for (ArrayList<String> dealOutString : allDealOutsString) {
			ArrayList<Card> tempDealOut = new ArrayList<Card>();
			for (String card : dealOutString) {
				tempDealOut.add(giveCard(card));
			}
			allDealOuts.add(tempDealOut);
		}
	}

	private void defineMap() {
		stringKeyToCardClassMap.put("2H", new Card(Color.H, Figure.DWOJKA));
		stringKeyToCardClassMap.put("3H", new Card(Color.H, Figure.TROJKA));
		stringKeyToCardClassMap.put("4H", new Card(Color.H, Figure.CZWORKA));
		stringKeyToCardClassMap.put("5H", new Card(Color.H, Figure.PIATKA));
		stringKeyToCardClassMap.put("6H", new Card(Color.H, Figure.SZOSTKA));
		stringKeyToCardClassMap.put("7H", new Card(Color.H, Figure.SIODEMKA));
		stringKeyToCardClassMap.put("8H", new Card(Color.H, Figure.OSEMKA));
		stringKeyToCardClassMap.put("9H", new Card(Color.H, Figure.DZIEWIATKA));
		stringKeyToCardClassMap.put("TH", new Card(Color.H, Figure.DZIESIATKA));
		stringKeyToCardClassMap.put("JH", new Card(Color.H, Figure.J));
		stringKeyToCardClassMap.put("QH", new Card(Color.H, Figure.Q));
		stringKeyToCardClassMap.put("KH", new Card(Color.H, Figure.K));
		stringKeyToCardClassMap.put("AH", new Card(Color.H, Figure.A));

		stringKeyToCardClassMap.put("2C", new Card(Color.C, Figure.DWOJKA));
		stringKeyToCardClassMap.put("3C", new Card(Color.C, Figure.TROJKA));
		stringKeyToCardClassMap.put("4C", new Card(Color.C, Figure.CZWORKA));
		stringKeyToCardClassMap.put("5C", new Card(Color.C, Figure.PIATKA));
		stringKeyToCardClassMap.put("6C", new Card(Color.C, Figure.SZOSTKA));
		stringKeyToCardClassMap.put("7C", new Card(Color.C, Figure.SIODEMKA));
		stringKeyToCardClassMap.put("8C", new Card(Color.C, Figure.OSEMKA));
		stringKeyToCardClassMap.put("9C", new Card(Color.C, Figure.DZIEWIATKA));
		stringKeyToCardClassMap.put("TC", new Card(Color.C, Figure.DZIESIATKA));
		stringKeyToCardClassMap.put("JC", new Card(Color.C, Figure.J));
		stringKeyToCardClassMap.put("QC", new Card(Color.C, Figure.Q));
		stringKeyToCardClassMap.put("KC", new Card(Color.C, Figure.K));
		stringKeyToCardClassMap.put("AC", new Card(Color.C, Figure.A));

		stringKeyToCardClassMap.put("2D", new Card(Color.D, Figure.DWOJKA));
		stringKeyToCardClassMap.put("3D", new Card(Color.D, Figure.TROJKA));
		stringKeyToCardClassMap.put("4D", new Card(Color.D, Figure.CZWORKA));
		stringKeyToCardClassMap.put("5D", new Card(Color.D, Figure.PIATKA));
		stringKeyToCardClassMap.put("6D", new Card(Color.D, Figure.SZOSTKA));
		stringKeyToCardClassMap.put("7D", new Card(Color.D, Figure.SIODEMKA));
		stringKeyToCardClassMap.put("8D", new Card(Color.D, Figure.OSEMKA));
		stringKeyToCardClassMap.put("9D", new Card(Color.D, Figure.DZIEWIATKA));
		stringKeyToCardClassMap.put("TD", new Card(Color.D, Figure.DZIESIATKA));
		stringKeyToCardClassMap.put("JD", new Card(Color.D, Figure.J));
		stringKeyToCardClassMap.put("QD", new Card(Color.D, Figure.Q));
		stringKeyToCardClassMap.put("KD", new Card(Color.D, Figure.K));
		stringKeyToCardClassMap.put("AD", new Card(Color.D, Figure.A));

		stringKeyToCardClassMap.put("2S", new Card(Color.S, Figure.DWOJKA));
		stringKeyToCardClassMap.put("3S", new Card(Color.S, Figure.TROJKA));
		stringKeyToCardClassMap.put("4S", new Card(Color.S, Figure.CZWORKA));
		stringKeyToCardClassMap.put("5S", new Card(Color.S, Figure.PIATKA));
		stringKeyToCardClassMap.put("6S", new Card(Color.S, Figure.SZOSTKA));
		stringKeyToCardClassMap.put("7S", new Card(Color.S, Figure.SIODEMKA));
		stringKeyToCardClassMap.put("8S", new Card(Color.S, Figure.OSEMKA));
		stringKeyToCardClassMap.put("9S", new Card(Color.S, Figure.DZIEWIATKA));
		stringKeyToCardClassMap.put("TS", new Card(Color.S, Figure.DZIESIATKA));
		stringKeyToCardClassMap.put("JS", new Card(Color.S, Figure.J));
		stringKeyToCardClassMap.put("QS", new Card(Color.S, Figure.Q));
		stringKeyToCardClassMap.put("KS", new Card(Color.S, Figure.K));
		stringKeyToCardClassMap.put("AS", new Card(Color.S, Figure.A));
	}

	private Card giveCard(String karta) {
		return stringKeyToCardClassMap.get(karta);
	}
}
