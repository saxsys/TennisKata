package de.saxsys.dojo.tennis;

public class TennisGame {

	int player1 = 0;
	private int player2 = 0;
	static String[] SCORES = { "Love", "Fifteen", "Thirty", "Fourty" };

	public String getScore() {
		if (player1 == 3 && player2 == 3) {
			return "Deuce";
		}
		if(player1 == player2) {
			return SCORES[player1] + " All";
		}
		return SCORES[player1] + " " + SCORES[player2];
	}

	public void addPointForPlayerOne() {
		player1++;

	}

	public void addPointForPlayerTwo() {
		player2++;

	}

}
