package de.saxsys.dojo.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Test;


public class ATennisGameShould {

	@Test
	public void returnLoveAll(){
		TennisGame tennisGame = new TennisGame();
		assertTrue(tennisGame.getScore().equals("LoveAll"));
		
	}
	
	@Test
	public void return15Love() throws Exception {
		TennisGame tennisGame = new TennisGame();
		tennisGame.addPointForPlayerOne();
		
		assertThat(tennisGame.getScore(), is("Fifteen Love"));
	}
	
	
}
