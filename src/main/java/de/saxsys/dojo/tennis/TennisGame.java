package de.saxsys.dojo.tennis;

public class TennisGame {

	int player1 = 0;

	public String getScore() {

		switch (player1) {
		case -1:
			return "Love Fifteen";
		case 1:
			return "Fifteen Love";
		case 2:
			return "Thirty Love";
		case 3:
			return "Fourty Love";
		default:
			return "LoveAll";
		}
	}

	public void addPointForPlayerOne() {
		player1++;

	}

	public void addPointForPlayerTwo() {
		player1=-1;
		
	}

}
