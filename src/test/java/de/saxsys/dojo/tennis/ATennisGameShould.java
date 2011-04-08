package de.saxsys.dojo.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ATennisGameShould {

	private TennisGame tennisGame;

	@Before
	public void init() {
		tennisGame = new TennisGame();

	}

	@Test
	public void returnLoveAll() {
		assertTrue(tennisGame.getScore().equals("Love All"));

	}

	@Test
	public void return15Love() throws Exception {
		tennisGame.addPointForPlayerOne();
		assertThat(tennisGame.getScore(), is("Fifteen Love"));
	}

	@Test
	public void return30Love() throws Exception {
		tennisGame.addPointForPlayerOne();
		tennisGame.addPointForPlayerOne();

		assertThat(tennisGame.getScore(), is("Thirty Love"));
	}

	@Test
	public void return40Love() throws Exception {
		tennisGame.addPointForPlayerOne();
		tennisGame.addPointForPlayerOne();
		tennisGame.addPointForPlayerOne();

		assertThat(tennisGame.getScore(), is("Fourty Love"));
	}

	@Test
	public void returnLove15() throws Exception {
		tennisGame.addPointForPlayerTwo();
		assertThat(tennisGame.getScore(), is("Love Fifteen"));
	}

	@Test
	public void returnLove30() throws Exception {
		addPointsToPlayerTwo(2);
		assertThat(tennisGame.getScore(), is("Love Thirty"));
	}

	@Test
	public void returnThirtyAll() throws Exception {
		addPointsToPlayerOne(2);
		addPointsToPlayerTwo(2);
		assertThat(tennisGame.getScore(), is("Thirty All"));
	}

	@Test
	public void returnDeuceIfBothPlayersScore3Times() throws Exception {
		createSimpleDeuce();
		assertThat(tennisGame.getScore(), is("Deuce"));
	}

	@Test
	public void returnAdvantagePlayer1() throws Exception {
		createSimpleDeuce();
		tennisGame.addPointForPlayerOne();

		assertThat(tennisGame.getScore(), is("Advantage Player One"));
	}

	@Test
	public void returnPlayerOneWinsIfPlayerOneScores4Times() throws Exception {
		addPointsToPlayerOne(4);

		assertThat(tennisGame.getScore(), is("Player One wins"));
	}

	@Test
	public void returnDeuceAfterAdvantagePlayer1() throws Exception {
		createSimpleDeuce();
		tennisGame.addPointForPlayerOne();
		tennisGame.addPointForPlayerTwo();

		assertThat(tennisGame.getScore(), is("Deuce"));
	}

	@Test
	public void returnPlayer1WinsAfterDeuce() throws Exception {
		createSimpleDeuce();
		addPointsToPlayerOne(2);

		assertThat(tennisGame.getScore(), is("Player One wins"));
	}

	@Test
	public void returnAdvantagePlayer2() throws Exception {

		createSimpleDeuce();
		tennisGame.addPointForPlayerTwo();

		assertThat(tennisGame.getScore(), is("Advantage Player Two"));
	}

	private void createSimpleDeuce() {
		addPointsToPlayerOne(3);
		addPointsToPlayerTwo(3);
	}

	private void addPointsToPlayerOne(int points) {
		for (int i = 0; i < points; i++)
			tennisGame.addPointForPlayerOne();
	}

	private void addPointsToPlayerTwo(int points) {
		for (int i = 0; i < points; i++)
			tennisGame.addPointForPlayerTwo();
	}
}
