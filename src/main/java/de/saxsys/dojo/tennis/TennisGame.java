package de.saxsys.dojo.tennis;

public class TennisGame {

	private int scoreOfPlayer1 = 0;
	private int scoreOfPlayer2 = 0;
	private static final String[] SCORES = { "Love", "Fifteen", "Thirty",
			"Fourty" };

	public String getScore() {
		if (isAdvantageForPlayerOne()) {
			return "Advantage Player One";
		}

		if (isAdvantageForPlayerTwo()) {
			return "Advantage Player Two";
		}

		if (isDeuce()) {
			return "Deuce";
		}
		if (isEqualScores()) {
			return SCORES[scoreOfPlayer1] + " All";
		}
		if (isPlayerOneWinner()) {
			return "Player One wins";
		}
		return SCORES[scoreOfPlayer1] + " " + SCORES[scoreOfPlayer2];
	}

	public void addPointForPlayerOne() {
		scoreOfPlayer1++;
	}

	public void addPointForPlayerTwo() {
		scoreOfPlayer2++;
	}

	private boolean isAdvantageForPlayerTwo() {
		return scoreOfPlayer2 == 4 && scoreOfPlayer1 == 3;
	}

	private boolean isPlayerOneWinner() {
		return scoreOfPlayer1 >= 4;
	}

	private boolean isEqualScores() {
		return scoreOfPlayer1 == scoreOfPlayer2;
	}

	private boolean isAdvantageForPlayerOne() {
		return scoreOfPlayer1 == 4 && scoreOfPlayer2 == 3;
	}

	private boolean isDeuce() {
		return (scoreOfPlayer1 == scoreOfPlayer2) && (scoreOfPlayer1 >= 3);
	}
}
