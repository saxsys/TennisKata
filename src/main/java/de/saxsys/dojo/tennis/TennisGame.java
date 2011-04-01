package de.saxsys.dojo.tennis;

public class TennisGame {

	int player1 = 0;
	
	public String getScore() {

		if(player1 == 1)
			return "Fifteen Love";
		if (player1 == 2)	{
			return "Thirty Love";
		}
		return "LoveAll";
	}

	public void addPointForPlayerOne() {
		player1++;
		
	}

}
