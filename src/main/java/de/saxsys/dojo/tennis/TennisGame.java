package de.saxsys.dojo.tennis;

public class TennisGame {

    private int player1 = 0;
    private int player2 = 0;
    private static String[] SCORES = { "Love", "Fifteen", "Thirty", "Fourty" };

    public String getScore() {
        if ((4 <= player1) || (4 <= player2)) {
            return getScoreForPlayerPointsComparation();
        }
        if ((3 == player1) && (3 == player2)) {
            return getScoreForPlayerPointsComparation();
        }
        return getScoreForSimpleCounting();
    }

    private String getScoreForPlayerPointsComparation() {
        if (player1 == player2) {
            return "Deuce";
        }
        if (player1 > player2) {
            return "Player 1 wins";
        }
        return "Player 2 wins";
    }

    private String getScoreForSimpleCounting() {
        if (player1 == player2) {
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
