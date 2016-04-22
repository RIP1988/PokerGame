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
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.H, Figure.J);
		Card karta3 = new Card(Color.C, Figure.DZIESIATKA);
		Card karta4 = new Card(Color.C, Figure.DWOJKA);
		Card karta5 = new Card(Color.C, Figure.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(0, wynik);
	}

	@Test
	public void shouldReturn1ForPara() {
		// given
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.H, Figure.A);
		Card karta3 = new Card(Color.C, Figure.DZIESIATKA);
		Card karta4 = new Card(Color.C, Figure.DWOJKA);
		Card karta5 = new Card(Color.C, Figure.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(1, wynik);
	}

	@Test
	public void shouldReturn2For2Pary() {
		// given
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.H, Figure.A);
		Card karta3 = new Card(Color.C, Figure.DZIESIATKA);
		Card karta4 = new Card(Color.H, Figure.PIATKA);
		Card karta5 = new Card(Color.C, Figure.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(2, wynik);
	}

	@Test
	public void shouldReturn3ForTrojka() {
		// given
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.H, Figure.A);
		Card karta3 = new Card(Color.S, Figure.A);
		Card karta4 = new Card(Color.C, Figure.DWOJKA);
		Card karta5 = new Card(Color.C, Figure.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(3, wynik);
	}

	@Test
	public void shouldReturn4ForStrit() {
		// given
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.H, Figure.K);
		Card karta3 = new Card(Color.C, Figure.DZIESIATKA);
		Card karta4 = new Card(Color.S, Figure.Q);
		Card karta5 = new Card(Color.D, Figure.J);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(4, wynik);
	}

	@Test
	public void shouldReturn5ForKolor() {
		// given
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.C, Figure.DZIEWIATKA);
		Card karta3 = new Card(Color.C, Figure.DZIESIATKA);
		Card karta4 = new Card(Color.C, Figure.DWOJKA);
		Card karta5 = new Card(Color.C, Figure.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(5, wynik);
	}

	@Test
	public void shouldReturn6ForFul() {
		// given
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.H, Figure.A);
		Card karta3 = new Card(Color.S, Figure.A);
		Card karta4 = new Card(Color.D, Figure.K);
		Card karta5 = new Card(Color.C, Figure.K);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(6, wynik);
	}

	@Test
	public void shouldReturn7ForKareta() {
		// given
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.H, Figure.A);
		Card karta3 = new Card(Color.D, Figure.A);
		Card karta4 = new Card(Color.S, Figure.A);
		Card karta5 = new Card(Color.C, Figure.PIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(7, wynik);
	}

	@Test
	public void shouldReturn8ForPoker() {
		// given
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.K);
		Card karta2 = new Card(Color.C, Figure.Q);
		Card karta3 = new Card(Color.C, Figure.DZIESIATKA);
		Card karta4 = new Card(Color.C, Figure.J);
		Card karta5 = new Card(Color.C, Figure.DZIEWIATKA);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(8, wynik);
	}

	@Test
	public void shouldReturn9ForPokerKrolewski() {
		// given
		ArrayList<Card> karty = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.C, Figure.K);
		Card karta3 = new Card(Color.C, Figure.DZIESIATKA);
		Card karta4 = new Card(Color.C, Figure.Q);
		Card karta5 = new Card(Color.C, Figure.J);
		karty.add(karta1);
		karty.add(karta2);
		karty.add(karta3);
		karty.add(karta4);
		karty.add(karta5);
		Hand reka1 = new Hand(karty);
		// when
		int wynik = reka1.getPoints();
		// then
		assertEquals(9, wynik);
	}

	@Test
	public void shouldReturnMinus1ParaAsowParaWaletowVSParaKroliParaDam() {
		// given
		ArrayList<Card> kartyGracza1 = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.D, Figure.A);
		Card karta3 = new Card(Color.S, Figure.J);
		Card karta4 = new Card(Color.H, Figure.Q);
		Card karta5 = new Card(Color.C, Figure.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Hand reka1 = new Hand(kartyGracza1);

		ArrayList<Card> kartyGracza2 = new ArrayList<Card>();
		Card karta6 = new Card(Color.C, Figure.K);
		Card karta7 = new Card(Color.D, Figure.K);
		Card karta8 = new Card(Color.S, Figure.Q);
		Card karta9 = new Card(Color.H, Figure.Q);
		Card karta10 = new Card(Color.C, Figure.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Hand reka2 = new Hand(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1KaretaVsFul() {
		// given
		ArrayList<Card> kartyGracza1 = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.D, Figure.A);
		Card karta3 = new Card(Color.S, Figure.A);
		Card karta4 = new Card(Color.H, Figure.A);
		Card karta5 = new Card(Color.C, Figure.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Hand reka1 = new Hand(kartyGracza1);

		ArrayList<Card> kartyGracza2 = new ArrayList<Card>();
		Card karta6 = new Card(Color.C, Figure.K);
		Card karta7 = new Card(Color.D, Figure.K);
		Card karta8 = new Card(Color.S, Figure.K);
		Card karta9 = new Card(Color.H, Figure.A);
		Card karta10 = new Card(Color.C, Figure.A);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Hand reka2 = new Hand(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1TrojkaVsPara() {
		// given
		ArrayList<Card> kartyGracza1 = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.D, Figure.A);
		Card karta3 = new Card(Color.S, Figure.A);
		Card karta4 = new Card(Color.H, Figure.Q);
		Card karta5 = new Card(Color.C, Figure.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Hand reka1 = new Hand(kartyGracza1);

		ArrayList<Card> kartyGracza2 = new ArrayList<Card>();
		Card karta6 = new Card(Color.C, Figure.K);
		Card karta7 = new Card(Color.D, Figure.K);
		Card karta8 = new Card(Color.S, Figure.Q);
		Card karta9 = new Card(Color.H, Figure.DZIESIATKA);
		Card karta10 = new Card(Color.C, Figure.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Hand reka2 = new Hand(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1ParaVsWysokaKarta() {
		// given
		ArrayList<Card> kartyGracza1 = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.D, Figure.A);
		Card karta3 = new Card(Color.S, Figure.J);
		Card karta4 = new Card(Color.H, Figure.Q);
		Card karta5 = new Card(Color.C, Figure.K);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Hand reka1 = new Hand(kartyGracza1);

		ArrayList<Card> kartyGracza2 = new ArrayList<Card>();
		Card karta6 = new Card(Color.C, Figure.K);
		Card karta7 = new Card(Color.D, Figure.A);
		Card karta8 = new Card(Color.S, Figure.J);
		Card karta9 = new Card(Color.H, Figure.DWOJKA);
		Card karta10 = new Card(Color.C, Figure.TROJKA);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Hand reka2 = new Hand(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1PokerVsPokerKrolewski() {
		// given
		ArrayList<Card> kartyGracza1 = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.C, Figure.K);
		Card karta3 = new Card(Color.C, Figure.J);
		Card karta4 = new Card(Color.C, Figure.Q);
		Card karta5 = new Card(Color.C, Figure.DZIESIATKA);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Hand reka1 = new Hand(kartyGracza1);

		ArrayList<Card> kartyGracza2 = new ArrayList<Card>();
		Card karta6 = new Card(Color.D, Figure.K);
		Card karta7 = new Card(Color.D, Figure.Q);
		Card karta8 = new Card(Color.D, Figure.DZIESIATKA);
		Card karta9 = new Card(Color.D, Figure.DZIEWIATKA);
		Card karta10 = new Card(Color.D, Figure.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Hand reka2 = new Hand(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturn1StritVsKolor() {
		// given
		ArrayList<Card> kartyGracza1 = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.D, Figure.K);
		Card karta3 = new Card(Color.S, Figure.J);
		Card karta4 = new Card(Color.H, Figure.Q);
		Card karta5 = new Card(Color.C, Figure.DZIESIATKA);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Hand reka1 = new Hand(kartyGracza1);

		ArrayList<Card> kartyGracza2 = new ArrayList<Card>();
		Card karta6 = new Card(Color.C, Figure.K);
		Card karta7 = new Card(Color.C, Figure.DWOJKA);
		Card karta8 = new Card(Color.C, Figure.Q);
		Card karta9 = new Card(Color.C, Figure.TROJKA);
		Card karta10 = new Card(Color.C, Figure.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Hand reka2 = new Hand(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(1, wynik);
	}

	@Test
	public void shouldReturn1ParaVS2Pary() {
		// given
		ArrayList<Card> kartyGracza1 = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.D, Figure.A);
		Card karta3 = new Card(Color.S, Figure.DZIEWIATKA);
		Card karta4 = new Card(Color.H, Figure.Q);
		Card karta5 = new Card(Color.C, Figure.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Hand reka1 = new Hand(kartyGracza1);

		ArrayList<Card> kartyGracza2 = new ArrayList<Card>();
		Card karta6 = new Card(Color.C, Figure.K);
		Card karta7 = new Card(Color.D, Figure.K);
		Card karta8 = new Card(Color.S, Figure.Q);
		Card karta9 = new Card(Color.H, Figure.Q);
		Card karta10 = new Card(Color.C, Figure.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Hand reka2 = new Hand(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(1, wynik);
	}

	@Test
	public void shouldReturnMinus1KaretaAsowVsKaretaKroli() {
		// given
		ArrayList<Card> kartyGracza1 = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.A);
		Card karta2 = new Card(Color.D, Figure.A);
		Card karta3 = new Card(Color.S, Figure.A);
		Card karta4 = new Card(Color.H, Figure.A);
		Card karta5 = new Card(Color.C, Figure.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Hand reka1 = new Hand(kartyGracza1);

		ArrayList<Card> kartyGracza2 = new ArrayList<Card>();
		Card karta6 = new Card(Color.C, Figure.K);
		Card karta7 = new Card(Color.D, Figure.K);
		Card karta8 = new Card(Color.S, Figure.K);
		Card karta9 = new Card(Color.H, Figure.K);
		Card karta10 = new Card(Color.C, Figure.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Hand reka2 = new Hand(kartyGracza2);
		// when
		int wynik = reka1.compareTo(reka2);
		// then
		assertEquals(-1, wynik);
	}

	@Test
	public void shouldReturnMinus1ParaDwojekZAsemVsParaDwojekZKrolem() {
		// given
		ArrayList<Card> kartyGracza1 = new ArrayList<Card>();
		Card karta1 = new Card(Color.C, Figure.DWOJKA);
		Card karta2 = new Card(Color.D, Figure.DWOJKA);
		Card karta3 = new Card(Color.S, Figure.A);
		Card karta4 = new Card(Color.H, Figure.Q);
		Card karta5 = new Card(Color.C, Figure.J);
		kartyGracza1.add(karta1);
		kartyGracza1.add(karta2);
		kartyGracza1.add(karta3);
		kartyGracza1.add(karta4);
		kartyGracza1.add(karta5);
		Hand reka1 = new Hand(kartyGracza1);

		ArrayList<Card> kartyGracza2 = new ArrayList<Card>();
		Card karta6 = new Card(Color.C, Figure.DWOJKA);
		Card karta7 = new Card(Color.D, Figure.DWOJKA);
		Card karta8 = new Card(Color.S, Figure.K);
		Card karta9 = new Card(Color.D, Figure.Q);
		Card karta10 = new Card(Color.H, Figure.J);
		kartyGracza2.add(karta6);
		kartyGracza2.add(karta7);
		kartyGracza2.add(karta8);
		kartyGracza2.add(karta9);
		kartyGracza2.add(karta10);
		Hand reka2 = new Hand(kartyGracza2);
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
		Game gra = new Game(wszystkieRozdaniaString);
		int wygranaGracza1 = 0;
		for (int i = 0; i < 1000; i++) {
			List<Card> rozdanie = gra.giveDealOut();
			ArrayList<Card> kartyGracza1 = new ArrayList<Card>(rozdanie.subList(0, LICZBA_KART_W_PIERWSZEJ_DLONI));
			ArrayList<Card> kartyGracza2 = new ArrayList<Card>(
					rozdanie.subList(LICZBA_KART_W_PIERWSZEJ_DLONI, LICZBA_KART_W_CALEJ_ROZGRYWCE));
			Hand rekaGracza1 = new Hand(kartyGracza1);
			Hand rekaGracza2 = new Hand(kartyGracza2);
			int wynik = rekaGracza1.compareTo(rekaGracza2);
			if (wynik == -1) {
				wygranaGracza1++;
			}
		}
		assertEquals(376, wygranaGracza1);

	}
}
