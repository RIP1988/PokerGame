package BowlingGame;

public class BowlingGame implements BowlingGameResultCalculator {
	private int score;
	private boolean isFinished;
	private int round;
	private int rollsInRound;
	private int scoreInRound;
	private int strikeStack;
	private boolean spare;
	private boolean strike;
	private boolean lastRoundStrike;
	private boolean lastRoundSpare;
	
	
	public BowlingGame() {
		score = 0;
		round = 1;
		isFinished = false;
		rollsInRound = 0;
		spare = false;
		strike = false;
		strikeStack = 0;
		scoreInRound = 0;
		lastRoundStrike = false;
		lastRoundSpare = false;
	}
	
	public int score() {
		return score;
	}
	
	public boolean isFinished() {
		return isFinished;
	}
	
	public void roll(int numberOfPins) {
		//przypadek dla pierwszych 9ciu rund i prawidlowych rzutow
		if (numberOfPins>=0 && numberOfPins<=10) {
			//przypadek dla pierwszego rzutu w rundzie
			//inkrementacja rundy oraz zachowanie wyniku w tej rundzie
			if (rollsInRound == 0) {
				//round++;
				scoreInRound = numberOfPins;
				//w przypadku spare'a do wyniku dodaj podwojona liczbe punktow z kolejnego
				//rzutu i wyzeruj zmienna spare
				if (spare) {
					score += numberOfPins*2;
					spare = false;
					//jesli rzucono strike oznacz to zmienna logiczna i inkrementuj stos
					if (numberOfPins == 10) {
						if (round<10) {
						strike = true;
						}
						else 
							lastRoundStrike = true;
						if (round==10) {
							rollsInRound++;
						}
						strikeStack++;
					}
					//jesli nie rzucono strike'a, wyzeruj zmienna logiczna i stos
					else {
						strike = false;
						strikeStack = 0;
						rollsInRound++;
					}
				}
				//jesli wczesniej rzucono strike'a podwoj liczbe punktow za ten rzut
				else if (strike) {
					score += numberOfPins*2;
					//dodatkowo jesli to ktorys strike z rzedu, dodaj 10 do wyniku
					if (strikeStack>1) {
						score+=10;
					}
					//jesli znow strike, inkrementuj stos
					if (numberOfPins == 10) {
						strikeStack++;
						if(round<10) {
						round++;
						}
						else 
							rollsInRound++;
						    lastRoundStrike = true;
					}
					//w przeciwnym razie wyzeruj stos
					else {
						strikeStack = 0;
						rollsInRound++;
					}
				}
				//gdy ani strike, ani spare w poprzedniej rundzie, dodaj punkty normalnie
				else {
					score += numberOfPins;
					//potem jesli rzucono strike, inkrementuj stos i oznacz zmienna logiczna
					if (numberOfPins == 10) {
						strikeStack++;
						strike = true;
						if (round<10)
						round++;
						else
							rollsInRound++;
					}
					else { 
						
						rollsInRound++;
					}
				}
			
			}
			//przypadek dla drugiego rzutu w pierwszych 9-ciu rundach
			else if (rollsInRound == 1) {
				//jesli w poprzedniej rundzie byl strike, dodac do punktacji podwojona punktacje z tego rzutu
				//i odznaczyc zmienna logiczna strike'a bo w drugiej rundzie jest niemozliwy
				if (strike) {
					score += numberOfPins*2;
					if (round<10) 
						rollsInRound = 0;
					
					
					//jesli suma punktow w dwoch rzutach =10, true dla spare
					if (!lastRoundStrike) {
						if ((scoreInRound + numberOfPins)==10) {
							if (round<10)
								spare = true;
							else {
								lastRoundSpare = true;
								rollsInRound++;
								isFinished = true;
							}
						}
						else {
							isFinished=true;
						}
					}
					else {
						rollsInRound++;
					}
				}
				//jesli w poprzedniej rundzie nie bylo strike, dodaj normalnie punkty
				else {
				score += numberOfPins;
				//jesli suma punktow w dwoch rzutach =10, true dla spare
				if ((scoreInRound + numberOfPins)==10) {
					if (round<10) {
						spare = true;
					}
					else {
						lastRoundSpare = true;
						rollsInRound++;
					}
				}
				else if (round==10) {
					isFinished = true;
				}
				
				}
				if (round<10) { 
					round++;
					rollsInRound = 0;
				}
			}
			else if (rollsInRound == 2 && round==10 && (lastRoundStrike || lastRoundSpare)) {
				score += numberOfPins;
				isFinished = true;
			}
			
	}
	}
}
