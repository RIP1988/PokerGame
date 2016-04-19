package BowlingGame;

import static org.junit.Assert.*;


import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame bowlingGame = new BowlingGame();
	//test zwracania false dla isFinished(), gdy gra jeszcze siê nie zaczê³a
	@Test
	public void shouldReturnNotFinishedIfNoRollsYet() {
		//given nothing
		
		//when
		boolean isFinished = bowlingGame.isFinished();
		//then
		assertEquals(false, isFinished);
	}
	//test zwracania 0 dla score(), gdy gra siê jeszcze nie zaczê³a
	@Test
	public void shouldReturnZeroScoreIfNoRollsYet() {
		//given nothing
		//when
		int score = bowlingGame.score();
		//then
		assertEquals(0, score);
	}
	//test zwracania 2 punktów, gdy tylko jeden rzut równy 2
	@Test 
	public void shouldReturnTwoForOneShotWithTwoPins() {
		//given
		int pins = 2;
		//when
		bowlingGame.roll(2);
		int score = bowlingGame.score(); 
		//then
		assertEquals(2, score);
	}
	//test zwracania 7, gdy pierwszy rzut 5 i drugi 2
	@Test
	public void shouldReturnSevenWithFiveAndTwoPinsHit() {
		//given
		int[] pins = {5,2};
		//when
		for (int i: pins) {
			bowlingGame.roll(i);
		}
		int score = bowlingGame.score();
		//then
		assertEquals(7, score);
	}
	//Test zwracania wyniku 11, gdy rzuty 5,2 i 4
	@Test
	public void shouldReturnElevenWithFiveAndTwoAndFourPinsHit() {
		//given
		int[] pins = {5,2,4};
		//when
		for (int i: pins) {
			bowlingGame.roll(i);
		}
		int score = bowlingGame.score();
		//then
		assertEquals(11, score);
	}
	//test czy isFinished false, dla jednego oddanego rzutu
	@Test
	public void shouldReturnIsFinishedFalseForOneRoll() {
		//given
		int pins = 2;
		//when
		bowlingGame.roll(2);
		boolean isFinished = bowlingGame.isFinished();
		//then
		assertFalse(isFinished);
	}
	//test czy wynik 23 dla rzutów 5,5,4,5
	@Test
	public void shouldReturn23For5And5And5And5Pins() {
		//given
		int[] pins = {5, 5, 4, 5};
		//when
		for (int i: pins) {
			bowlingGame.roll(i);
		}
		int score = bowlingGame.score();
		//then
		assertEquals(23, score);
	}
	//test czy wynik 24 dla rzutów 10,3,4
	@Test
	public void shouldReturn24For10And3And4() {
		//given
		int[] pins = {10, 3, 4};
		//when
		for (int i: pins) {
			bowlingGame.roll(i);
		}
		int score = bowlingGame.score();
		//then
		assertEquals(24, score);
	}
	
	@Test
	//test jeœli 3xstrike, to wynik 60
	public void shouldReturn60For3xStrike() {
		//given
		int[] pins = {10, 10, 10};
		//when
		for (int i: pins) {
			bowlingGame.roll(i);
		}
		int score = bowlingGame.score();
		//then
		assertEquals(60, score);
	}
	//test jeœli 12xstrike, to wynik 300
	@Test
		public void shouldReturn300For12xStrike() {
			//given
			int[] pins = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
			//when
			for (int i: pins) {
				bowlingGame.roll(i);
			}
			int score = bowlingGame.score();
			//then
			assertEquals(300, score);
		}
		//test jesli rzut ujemny zignoruj rzut
	@Test
		public void shouldIgnoreRollLessThenZero() {
			//given
			int[] pins = {5, -2};
			//when
			for (int i: pins) {
				bowlingGame.roll(i);
			}
			int score = bowlingGame.score();
			//than
			assertEquals(5, score);
		}
		//test jesli rzut > 10 zignoruj rzut
	@Test
		public void shouldIgnoreRollBetterThan10() {
			//given
			int[] pins = {5, 12};
			//when
			for (int i: pins) {
				bowlingGame.roll(i);
			}
			int score = bowlingGame.score();
			//than
			assertEquals(5, score);
		}
	//Jesli 20 rzutow bez spare i strike, gra skonczona
	@Test
	public void shouldBeFinishedAfter20NormalRolls() {
		//given
		int[] pins = {5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
		//when
		for (int i: pins) {
			bowlingGame.roll(i);
		}
		boolean isFinished = bowlingGame.isFinished();
		//then
		assertTrue(isFinished);
	}
	//Jesli 12 strike'ow, gra skonczona
	@Test
	public void shouldBeFinishedAfter12Strikes() {
		//given
		int[] pins = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		//when
		for (int i: pins) {
			bowlingGame.roll(i);
		}	
		boolean isFinished = bowlingGame.isFinished();
		//then
		assertTrue(isFinished);
	}
	//Jesli spare w 10 rundzie, gra skonczona bezposrednio po nim
	@Test
	public void shouldNotBeFinishedDirectAfterSpareIn10Round() {
		//given
		int[] pins = {5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 7};
		//when
		for (int i: pins) {
			bowlingGame.roll(i);
		}	
		boolean isFinished = bowlingGame.isFinished();
		//then
		assertFalse(isFinished);
	}
	
	@Test 
	public void shouldBeFinishedAfterThreeShootsInLastRoundWithSpareInSecondShot() {
		//given
				int[] pins = {5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 7, 5};
				//when
				for (int i: pins) {
					bowlingGame.roll(i);
				}	
				boolean isFinished = bowlingGame.isFinished();
				//then
				assertTrue(isFinished);
	}
}
