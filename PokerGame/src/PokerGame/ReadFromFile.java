package PokerGame;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFromFile {
	private final int EXPECTED_LINE_LENGTH = 29;
	private BufferedReader reader = null;

	public ReadFromFile(String source) {
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(source)));
		} catch (FileNotFoundException e) {
			System.out.println("nie znaleziono pliku");
		}
	}

	public ArrayList<String> read() {
		ArrayList<String> linesList = new ArrayList<String>();
		try {
			String data = reader.readLine();
			while (data != null) {
				try {
					if (data.length() != EXPECTED_LINE_LENGTH) {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("Niepoprawna dlugosc wiersza w pliku");
				}
				linesList.add(data);
				data = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Blad wejscia");
		}
		return linesList;
	}
}
