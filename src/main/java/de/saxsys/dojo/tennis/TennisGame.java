package de.saxsys.dojo.tennis;

public class TennisGame {

	int player1 = 0;
	private int player2 = 0;
	static String[] SCORES = { "Love", "Fifteen", "Thirty", "Fourty" };

	public String getScore() {
		if (player2 == 1) {
			return "Love Fifteen";
		}
		if (player2 == 2) {
			return "Love Thirty";
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
		player2++;

	}

}
