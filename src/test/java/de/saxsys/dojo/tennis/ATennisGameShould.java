package de.saxsys.dojo.tennis;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ATennisGameShould {

	@Test
	public void shouldReturnLoveAll(){
		
		assertTrue(TennisGame.getScore().equals("LoveAll"));
		
	}
	
	
}
