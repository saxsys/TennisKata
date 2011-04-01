package de.saxsys.dojo.tennis;

public class TennisGame {

	int player1 = 0;
	static String[] SCORES = { "Love", "Fifteen", "Thirty", "Fourty" };

	public String getScore() {
		if (player1 == -1) {
			return "Love Fifteen";
		}
		if (player1 == 0) {
			return "LoveAll";
		}
		return SCORES[player1] + " Love";

	}

	public void addPointForPlayerOne() {
		player1++;

	}

	public void addPointForPlayerTwo() {
		player1 = -1;

	}

}
