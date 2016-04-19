package BowlingGame;


public interface BowlingGameResultCalculator {
	public void roll(int numberOfPins);
	public int score();
	public boolean isFinished();
}

/*
 * CHECKLISTA	
 * Je�li rzut1 = 2 wynik 2
 * Je�li rzut1 = 2 isFinished = false;
 * Je�li rzut1 = 0 i rzut2 = 0, wynik 0
 * Je�li rzut1 = 5 i rzut2 = 2, wynik 7
 * Je�li rzut1 = 5, rzut2 = 2, rzut3 = 4, wynik 11
 *  Je�li rzut1 = 5, rzut2 = 5, rzut3 = 4, rzut4=5, wynik 23
 * Je�li �adnego oddanego rzutu, isFinished false
 * Je�li rzut1 = 10, rzut2=3, rzut3=4 wynik 24
 * Je�li rzut 1 = 10, rzut2=10, rzut3=10 wynik 60;
 * Jesli rzut ujemny zignoruj rzut
 * Jesli rzut > 10 zignoruj rzut
 * Jesli 20 rzutow bez spare i strike, gra skonczona
 * Jesli 12 strike'ow, gra skonczona
 * Jesli 12 kolejnych strike'ow, wynik 300
 * Jesli spare w 10 rundzie, gra nie konczy sie bezposrednio po nim
 * Jesli spare w 10 rundzie, gra konczy si� po kolejnym rzucie
 * */
