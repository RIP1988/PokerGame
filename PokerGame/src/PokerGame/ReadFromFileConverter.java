package PokerGame;

import java.util.ArrayList;

public class ReadFromFileConverter {
	private ReadFromFile reader;

	public ReadFromFileConverter(ReadFromFile reader) {
		this.reader = reader;
	}

	public ArrayList<ArrayList<String>> getConvertedArrayList() {
		ArrayList<String> dataToBeConverted = reader.read();
		ArrayList<ArrayList<String>> allCardsInGame = new ArrayList<ArrayList<String>>();
		for (String line : dataToBeConverted) {
			ArrayList<String> dealOut = new ArrayList<String>();
			String lineWithoutWhitespace = line.replaceAll("\\s+", "");
			for (int i = 0; i < lineWithoutWhitespace.length(); i += 2) {
				dealOut.add(lineWithoutWhitespace.substring(i, i + 2));
			}
			allCardsInGame.add(dealOut);
		}

		return allCardsInGame;
	}
}
