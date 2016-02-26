package com.collageboard;

import java.util.Scanner;

/**
 * Class to find guessed number between given range. This logic based on concept
 * on binary search.
 * 
 * @author Shashikant
 * @version 1.1
 */
public class NumberGuessingGame {
	private static final int MAX_NUMBER = 100;
	private static final int MIN_NUMBER = 0;
	private Scanner scanner = new Scanner(System.in);;

	public static void main(String[] args) 
	{
		NumberGuessingGame guessingGame = new NumberGuessingGame();
		System.out.println("Guess a number between 1 - " + MAX_NUMBER);
		guessingGame.findGuessedNumber(MIN_NUMBER, MAX_NUMBER);
	}

	/**
	 * Method to find guessed number between min and max.
	 * 
	 * @param low - int
	 * @param high - int
	 */
	public int findGuessedNumber(int low, int high) 
	{
		int mid = 0;
		while (true)
		{
			mid = getMid(low, high);
			System.out.println("Is number " + mid);

			String userInput = scanner.next();

			if ("Yes".equalsIgnoreCase(userInput)) {
				return mid;
			} else if ("Lower".equalsIgnoreCase(userInput)) {
				high = mid;
			} else if ("Higher".equalsIgnoreCase(userInput)) {
				low = mid;
			} else {
				System.out.println("Please enter Yes/Lower/Higher.");
			}
		}
	}

	/**
	 * Method to get middle number.
	 * @param low - int
	 * @param high - int
	 * @return middle number - int
	 */
	public static int getMid(int low, int high) 
	{
		return ((low + high + 1) / 2);
	}

}
