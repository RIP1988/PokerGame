package PokerGame;

import java.util.ArrayList;

public class ReadFromFileConverter {
	private ReadFromFile reader;

	public ReadFromFileConverter(ReadFromFile reader) {
		this.reader = reader;
	}

	public ArrayList<ArrayList<String>> getConvertedArrayList() {
		ArrayList<String> konwertowaneDane = reader.read();
		ArrayList<ArrayList<String>> wszystkieKartyZRozgrywki = new ArrayList<ArrayList<String>>();
		for (String wiersz : konwertowaneDane) {
			ArrayList<String> rozdanie = new ArrayList<String>();
			String wierszBezSpacji = wiersz.replaceAll("\\s+", "");
			for (int i = 0; i < wierszBezSpacji.length(); i += 2) {
				rozdanie.add(wierszBezSpacji.substring(i, i + 2));
			}
			wszystkieKartyZRozgrywki.add(rozdanie);
		}

		return wszystkieKartyZRozgrywki;
	}
}
