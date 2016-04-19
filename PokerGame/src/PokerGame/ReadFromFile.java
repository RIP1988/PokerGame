package PokerGame;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFromFile {
	private final int OCZEKIWANA_DLUGOSC_WIERSZA = 29;
	private BufferedReader reader = null;

	public ReadFromFile(String zrodlo) {
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(zrodlo)));
		} catch (FileNotFoundException e) {
			System.out.println("nie znaleziono pliku");
		}
	}

	public ArrayList<String> read() {
		ArrayList<String> listaWierszy = new ArrayList<String>();
		try {
			String data = reader.readLine();
			while (data != null) {
				try {
					if (data.length() != OCZEKIWANA_DLUGOSC_WIERSZA) {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("Niepoprawna dlugosc wiersza w pliku");
				}
				listaWierszy.add(data);
				data = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Blad wejscia");
		}
		return listaWierszy;
	}
}
