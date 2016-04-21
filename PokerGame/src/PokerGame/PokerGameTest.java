package PokerGame;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PokerGameTest {
	private final int LICZBA_KART_W_PIERWSZEJ_DLONI = 5;
	private final int LICZBA_KART_W_CALEJ_ROZGRYWCE = 10;

	@Test
	public void shouldReturn0ForWysokaKarta() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.H, Figura.J);
		Karta karta3 = new Karta(Kolor.C, Figura.DZIESIATKA);
		Karta karta4 = new Karta(Kolor.C, Figura.DWOJKA);
		Karta karta5 = new Karta(Kolor.C, Figura.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(0, wynik);
	}

	@Test
	public void shouldReturn1ForPara() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.H, Figura.A);
		Karta karta3 = new Karta(Kolor.C, Figura.DZIESIATKA);
		Karta karta4 = new Karta(Kolor.C, Figura.DWOJKA);
		Karta karta5 = new Karta(Kolor.C, Figura.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(1, wynik);
	}

	@Test
	public void shouldReturn2For2Pary() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.H, Figura.A);
		Karta karta3 = new Karta(Kolor.C, Figura.DZIESIATKA);
		Karta karta4 = new Karta(Kolor.H, Figura.PIATKA);
		Karta karta5 = new Karta(Kolor.C, Figura.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(2, wynik);
	}

	@Test
	public void shouldReturn3ForTrojka() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.H, Figura.A);
		Karta karta3 = new Karta(Kolor.S, Figura.A);
		Karta karta4 = new Karta(Kolor.C, Figura.DWOJKA);
		Karta karta5 = new Karta(Kolor.C, Figura.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(3, wynik);
	}

	@Test
	public void shouldReturn4ForStrit() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.H, Figura.K);
		Karta karta3 = new Karta(Kolor.C, Figura.DZIESIATKA);
		Karta karta4 = new Karta(Kolor.S, Figura.Q);
		Karta karta5 = new Karta(Kolor.D, Figura.J);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(4, wynik);
	}

	@Test
	public void shouldReturn5ForKolor() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.C, Figura.DZIEWIATKA);
		Karta karta3 = new Karta(Kolor.C, Figura.DZIESIATKA);
		Karta karta4 = new Karta(Kolor.C, Figura.DWOJKA);
		Karta karta5 = new Karta(Kolor.C, Figura.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(5, wynik);
	}

	@Test
	public void shouldReturn6ForFul() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.H, Figura.A);
		Karta karta3 = new Karta(Kolor.S, Figura.A);
		Karta karta4 = new Karta(Kolor.D, Figura.K);
		Karta karta5 = new Karta(Kolor.C, Figura.K);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(6, wynik);
	}

	@Test
	public void shouldReturn7ForKareta() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.H, Figura.A);
		Karta karta3 = new Karta(Kolor.D, Figura.A);
		Karta karta4 = new Karta(Kolor.S, Figura.A);
		Karta karta5 = new Karta(Kolor.C, Figura.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(7, wynik);
	}

	@Test
	public void shouldReturn8ForPoker() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.K);
		Karta karta2 = new Karta(Kolor.C, Figura.Q);
		Karta karta3 = new Karta(Kolor.C, Figura.DZIESIATKA);
		Karta karta4 = new Karta(Kolor.C, Figura.J);
		Karta karta5 = new Karta(Kolor.C, Figura.DZIEWIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(8, wynik);
	}

	@Test
	public void shouldReturn9ForPokerKrolewski() {
		// given
		ArrayList<Karta> karty = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.C, Figura.K);
		Karta karta3 = new Karta(Kolor.C, Figura.DZIESIATKA);
		Karta karta4 = new Karta(Kolor.C, Figura.Q);
		Karta karta5 = new Karta(Kolor.C, Figura.J);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Reka reka1 = new Reka(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(9, wynik);
	}

	@Test
	public void shouldReturnMinus1ParaAsowParaWaletowVSParaKroliParaDam() {
		// given
		ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.D, Figura.A);
		Karta karta3 = new Karta(Kolor.S, Figura.J);
		Karta karta4 = new Karta(Kolor.H, Figura.Q);
		Karta karta5 = new Karta(Kolor.C, Figura.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Reka reka1 = new Reka(kartyGracza1);

		ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>();
		Karta karta6 = new Karta(Kolor.C, Figura.K);
		Karta karta7 = new Karta(Kolor.D, Figura.K);
		Karta karta8 = new Karta(Kolor.S, Figura.Q);
		Karta karta9 = new Karta(Kolor.H, Figura.Q);
		Karta karta10 = new Karta(Kolor.C, Figura.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Reka reka2 = new Reka(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1KaretaVsFul() {
		// given
		ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.D, Figura.A);
		Karta karta3 = new Karta(Kolor.S, Figura.A);
		Karta karta4 = new Karta(Kolor.H, Figura.A);
		Karta karta5 = new Karta(Kolor.C, Figura.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Reka reka1 = new Reka(kartyGracza1);

		ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>();
		Karta karta6 = new Karta(Kolor.C, Figura.K);
		Karta karta7 = new Karta(Kolor.D, Figura.K);
		Karta karta8 = new Karta(Kolor.S, Figura.K);
		Karta karta9 = new Karta(Kolor.H, Figura.A);
		Karta karta10 = new Karta(Kolor.C, Figura.A);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Reka reka2 = new Reka(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1TrojkaVsPara() {
		// given
		ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.D, Figura.A);
		Karta karta3 = new Karta(Kolor.S, Figura.A);
		Karta karta4 = new Karta(Kolor.H, Figura.Q);
		Karta karta5 = new Karta(Kolor.C, Figura.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Reka reka1 = new Reka(kartyGracza1);

		ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>();
		Karta karta6 = new Karta(Kolor.C, Figura.K);
		Karta karta7 = new Karta(Kolor.D, Figura.K);
		Karta karta8 = new Karta(Kolor.S, Figura.Q);
		Karta karta9 = new Karta(Kolor.H, Figura.DZIESIATKA);
		Karta karta10 = new Karta(Kolor.C, Figura.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Reka reka2 = new Reka(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1ParaVsWysokaKarta() {
		// given
		ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.D, Figura.A);
		Karta karta3 = new Karta(Kolor.S, Figura.J);
		Karta karta4 = new Karta(Kolor.H, Figura.Q);
		Karta karta5 = new Karta(Kolor.C, Figura.K);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Reka reka1 = new Reka(kartyGracza1);

		ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>();
		Karta karta6 = new Karta(Kolor.C, Figura.K);
		Karta karta7 = new Karta(Kolor.D, Figura.A);
		Karta karta8 = new Karta(Kolor.S, Figura.J);
		Karta karta9 = new Karta(Kolor.H, Figura.DWOJKA);
		Karta karta10 = new Karta(Kolor.C, Figura.TROJKA);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Reka reka2 = new Reka(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1PokerVsPokerKrolewski() {
		// given
		ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.C, Figura.K);
		Karta karta3 = new Karta(Kolor.C, Figura.J);
		Karta karta4 = new Karta(Kolor.C, Figura.Q);
		Karta karta5 = new Karta(Kolor.C, Figura.DZIESIATKA);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Reka reka1 = new Reka(kartyGracza1);

		ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>();
		Karta karta6 = new Karta(Kolor.D, Figura.K);
		Karta karta7 = new Karta(Kolor.D, Figura.Q);
		Karta karta8 = new Karta(Kolor.D, Figura.DZIESIATKA);
		Karta karta9 = new Karta(Kolor.D, Figura.DZIEWIATKA);
		Karta karta10 = new Karta(Kolor.D, Figura.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Reka reka2 = new Reka(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturn1StritVsKolor() {
		// given
		ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.D, Figura.K);
		Karta karta3 = new Karta(Kolor.S, Figura.J);
		Karta karta4 = new Karta(Kolor.H, Figura.Q);
		Karta karta5 = new Karta(Kolor.C, Figura.DZIESIATKA);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Reka reka1 = new Reka(kartyGracza1);

		ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>();
		Karta karta6 = new Karta(Kolor.C, Figura.K);
		Karta karta7 = new Karta(Kolor.C, Figura.DWOJKA);
		Karta karta8 = new Karta(Kolor.C, Figura.Q);
		Karta karta9 = new Karta(Kolor.C, Figura.TROJKA);
		Karta karta10 = new Karta(Kolor.C, Figura.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Reka reka2 = new Reka(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(1, wynik);
	}

	@Test
	public void shouldReturn1ParaVS2Pary() {
		// given
		ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.D, Figura.A);
		Karta karta3 = new Karta(Kolor.S, Figura.DZIEWIATKA);
		Karta karta4 = new Karta(Kolor.H, Figura.Q);
		Karta karta5 = new Karta(Kolor.C, Figura.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Reka reka1 = new Reka(kartyGracza1);

		ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>();
		Karta karta6 = new Karta(Kolor.C, Figura.K);
		Karta karta7 = new Karta(Kolor.D, Figura.K);
		Karta karta8 = new Karta(Kolor.S, Figura.Q);
		Karta karta9 = new Karta(Kolor.H, Figura.Q);
		Karta karta10 = new Karta(Kolor.C, Figura.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Reka reka2 = new Reka(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(1, wynik);
	}

	@Test
	public void shouldReturnMinus1KaretaAsowVsKaretaKroli() {
		// given
		ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.A);
		Karta karta2 = new Karta(Kolor.D, Figura.A);
		Karta karta3 = new Karta(Kolor.S, Figura.A);
		Karta karta4 = new Karta(Kolor.H, Figura.A);
		Karta karta5 = new Karta(Kolor.C, Figura.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Reka reka1 = new Reka(kartyGracza1);

		ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>();
		Karta karta6 = new Karta(Kolor.C, Figura.K);
		Karta karta7 = new Karta(Kolor.D, Figura.K);
		Karta karta8 = new Karta(Kolor.S, Figura.K);
		Karta karta9 = new Karta(Kolor.H, Figura.K);
		Karta karta10 = new Karta(Kolor.C, Figura.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Reka reka2 = new Reka(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1ParaDwojekZAsemVsParaDwojekZKrolem() {
		// given
		ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>();
		Karta karta1 = new Karta(Kolor.C, Figura.DWOJKA);
		Karta karta2 = new Karta(Kolor.D, Figura.DWOJKA);
		Karta karta3 = new Karta(Kolor.S, Figura.A);
		Karta karta4 = new Karta(Kolor.H, Figura.Q);
		Karta karta5 = new Karta(Kolor.C, Figura.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Reka reka1 = new Reka(kartyGracza1);

		ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>();
		Karta karta6 = new Karta(Kolor.C, Figura.DWOJKA);
		Karta karta7 = new Karta(Kolor.D, Figura.DWOJKA);
		Karta karta8 = new Karta(Kolor.S, Figura.K);
		Karta karta9 = new Karta(Kolor.D, Figura.Q);
		Karta karta10 = new Karta(Kolor.H, Figura.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Reka reka2 = new Reka(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturn376AsNumberOfPlayer1Wins() {
		ArrayList<ArrayList<String>> wszystkieRozdaniaString = new ReadFromFileConverter(
				new ReadFromFile("poker.txt")).getConvertedArrayList();
		ArrayList<Integer> wyniki = new ArrayList<Integer>();
		Gra gra = new Gra(wszystkieRozdaniaString);
		int wygranaGracza1 = 0;
		for (int i = 0; i < 1000; i++) {
			List<Karta> rozdanie = gra.dajRozdanie();
			ArrayList<Karta> kartyGracza1 = new ArrayList<Karta>(rozdanie.subList(0, LICZBA_KART_W_PIERWSZEJ_DLONI));
			ArrayList<Karta> kartyGracza2 = new ArrayList<Karta>(
					rozdanie.subList(LICZBA_KART_W_PIERWSZEJ_DLONI, LICZBA_KART_W_CALEJ_ROZGRYWCE));
			Reka rekaGracza1 = new Reka(kartyGracza1);
			Reka rekaGracza2 = new Reka(kartyGracza2);
			int wynik = rekaGracza1.compareTo(rekaGracza2);
			if (wynik == -1) {
				wygranaGracza1++;
			}
		}
		assertEquals(376, wygranaGracza1);

	}
}
