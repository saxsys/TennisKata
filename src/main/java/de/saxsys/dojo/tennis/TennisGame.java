package de.saxsys.dojo.tennis;

public class TennisGame {

	private int scoreOfPlayer1 = 0;
	private int scoreOfPlayer2 = 0;
	private static final String[] SCORES = { "Love", "Fifteen", "Thirty", "Fourty" };

	public String getScore() {
		
		if (isDeuce()) {
			return "Deuce";
		}
		if(scoreOfPlayer1 == scoreOfPlayer2) {
			return SCORES[scoreOfPlayer1] + " All";
		}
		return SCORES[scoreOfPlayer1] + " " + SCORES[scoreOfPlayer2];
	}

	public void addPointForPlayerOne() {
		scoreOfPlayer1++;
	}

	public void addPointForPlayerTwo() {
		scoreOfPlayer2++;
	}
	
	private boolean isDeuce() {
		return scoreOfPlayer1 == 3 && scoreOfPlayer2 == 3;
	}
}
