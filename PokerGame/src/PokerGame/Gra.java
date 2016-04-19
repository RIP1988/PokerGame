package PokerGame;

import java.util.ArrayList;
import java.util.HashMap;

public class Gra {

	private HashMap<String, Karta> mapa = new HashMap<String, Karta>();
	private int indeksNastepnegoRozdania;
	private ArrayList<ArrayList<Karta>> wszystkieRozdania = new ArrayList<ArrayList<Karta>>();

	public Gra(ArrayList<ArrayList<String>> wszystkieRozdania) {
		zdefiniujMape();
		wypelnijListeRozdan(wszystkieRozdania);

		indeksNastepnegoRozdania = 0;
	}

	public ArrayList<Karta> dajRozdanie() {
		return wszystkieRozdania.get(indeksNastepnegoRozdania++);

	}

	public int dajLiczbeRozdan() {
		return wszystkieRozdania.size();
	}

	private void wypelnijListeRozdan(ArrayList<ArrayList<String>> wszystkieRozdaniaString) {

		for (ArrayList<String> rozdanieString : wszystkieRozdaniaString) {
			ArrayList<Karta> tempRozdanie = new ArrayList<Karta>();
			for (String karta : rozdanieString) {
				tempRozdanie.add(dajKarte(karta));
			}
			wszystkieRozdania.add(tempRozdanie);
		}
	}

	private void zdefiniujMape() {
		mapa.put("2H", new Karta(Kolor.H, Figura.Dwojka));
		mapa.put("3H", new Karta(Kolor.H, Figura.Trojka));
		mapa.put("4H", new Karta(Kolor.H, Figura.Czworka));
		mapa.put("5H", new Karta(Kolor.H, Figura.Piatka));
		mapa.put("6H", new Karta(Kolor.H, Figura.Szostka));
		mapa.put("7H", new Karta(Kolor.H, Figura.Siodemka));
		mapa.put("8H", new Karta(Kolor.H, Figura.Osemka));
		mapa.put("9H", new Karta(Kolor.H, Figura.Dziewiatka));
		mapa.put("TH", new Karta(Kolor.H, Figura.Dziesiatka));
		mapa.put("JH", new Karta(Kolor.H, Figura.J));
		mapa.put("QH", new Karta(Kolor.H, Figura.Q));
		mapa.put("KH", new Karta(Kolor.H, Figura.K));
		mapa.put("AH", new Karta(Kolor.H, Figura.A));

		mapa.put("2C", new Karta(Kolor.C, Figura.Dwojka));
		mapa.put("3C", new Karta(Kolor.C, Figura.Trojka));
		mapa.put("4C", new Karta(Kolor.C, Figura.Czworka));
		mapa.put("5C", new Karta(Kolor.C, Figura.Piatka));
		mapa.put("6C", new Karta(Kolor.C, Figura.Szostka));
		mapa.put("7C", new Karta(Kolor.C, Figura.Siodemka));
		mapa.put("8C", new Karta(Kolor.C, Figura.Osemka));
		mapa.put("9C", new Karta(Kolor.C, Figura.Dziewiatka));
		mapa.put("TC", new Karta(Kolor.C, Figura.Dziesiatka));
		mapa.put("JC", new Karta(Kolor.C, Figura.J));
		mapa.put("QC", new Karta(Kolor.C, Figura.Q));
		mapa.put("KC", new Karta(Kolor.C, Figura.K));
		mapa.put("AC", new Karta(Kolor.C, Figura.A));

		mapa.put("2D", new Karta(Kolor.D, Figura.Dwojka));
		mapa.put("3D", new Karta(Kolor.D, Figura.Trojka));
		mapa.put("4D", new Karta(Kolor.D, Figura.Czworka));
		mapa.put("5D", new Karta(Kolor.D, Figura.Piatka));
		mapa.put("6D", new Karta(Kolor.D, Figura.Szostka));
		mapa.put("7D", new Karta(Kolor.D, Figura.Siodemka));
		mapa.put("8D", new Karta(Kolor.D, Figura.Osemka));
		mapa.put("9D", new Karta(Kolor.D, Figura.Dziewiatka));
		mapa.put("TD", new Karta(Kolor.D, Figura.Dziesiatka));
		mapa.put("JD", new Karta(Kolor.D, Figura.J));
		mapa.put("QD", new Karta(Kolor.D, Figura.Q));
		mapa.put("KD", new Karta(Kolor.D, Figura.K));
		mapa.put("AD", new Karta(Kolor.D, Figura.A));

		mapa.put("2S", new Karta(Kolor.S, Figura.Dwojka));
		mapa.put("3S", new Karta(Kolor.S, Figura.Trojka));
		mapa.put("4S", new Karta(Kolor.S, Figura.Czworka));
		mapa.put("5S", new Karta(Kolor.S, Figura.Piatka));
		mapa.put("6S", new Karta(Kolor.S, Figura.Szostka));
		mapa.put("7S", new Karta(Kolor.S, Figura.Siodemka));
		mapa.put("8S", new Karta(Kolor.S, Figura.Osemka));
		mapa.put("9S", new Karta(Kolor.S, Figura.Dziewiatka));
		mapa.put("TS", new Karta(Kolor.S, Figura.Dziesiatka));
		mapa.put("JS", new Karta(Kolor.S, Figura.J));
		mapa.put("QS", new Karta(Kolor.S, Figura.Q));
		mapa.put("KS", new Karta(Kolor.S, Figura.K));
		mapa.put("AS", new Karta(Kolor.S, Figura.A));
	}

	private Karta dajKarte(String karta) {
		return mapa.get(karta);
	}
}
