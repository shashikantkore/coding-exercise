package com.collageboard;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * Test class for {@link NumberGuessingGame}.
 * @author Shashikant
 *
 */
public class TestNumberGuessingGame
{
	NumberGuessingGame guessingGame = new NumberGuessingGame();
	
	@Test
	public void testfindGuessedNumber() {
		int expectedGuessedNumber = 35;
		int actualNumber = guessingGame.findGuessedNumber(0, 100);
		assertEquals(expectedGuessedNumber, actualNumber);
	}

	@Test
	public void testBoundryCondition_Min() {
		int actualMinNumber = guessingGame.findGuessedNumber(0, 100);
		assertEquals(1, actualMinNumber);
	}
	
	@Test
	public void testBoundryCondition_Max() {
		int actualMaxNumber = guessingGame.findGuessedNumber(0, 100);
		assertEquals(100, actualMaxNumber);
	}
}
