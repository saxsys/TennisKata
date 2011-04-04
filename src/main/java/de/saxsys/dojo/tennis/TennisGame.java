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
        final int diff = Math.abs(player2 - player1);
        String result = "Player 1 wins";
        if (1 == diff) {
            result = "Advantage Player 1";
        }
        if (player2 > player1) {
            result = result.replace('1', '2');
        }
        return result;
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
