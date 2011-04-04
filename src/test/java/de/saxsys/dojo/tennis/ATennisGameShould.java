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
        tennisGame.addPointForPlayerTwo();
        tennisGame.addPointForPlayerTwo();
        assertThat(tennisGame.getScore(), is("Love Thirty"));
    }

    @Test
    public void returnThirtyAll() throws Exception {
        tennisGame.addPointForPlayerOne();
        tennisGame.addPointForPlayerOne();
        tennisGame.addPointForPlayerTwo();
        tennisGame.addPointForPlayerTwo();
        assertThat(tennisGame.getScore(), is("Thirty All"));
    }

    @Test
    public void returnFourtyThirty() throws Exception {
        tennisGame.addPointForPlayerOne();
        tennisGame.addPointForPlayerTwo();
        tennisGame.addPointForPlayerOne();
        tennisGame.addPointForPlayerTwo();
        tennisGame.addPointForPlayerOne();
        assertThat(tennisGame.getScore(), is("Fourty Thirty"));
    }

}
