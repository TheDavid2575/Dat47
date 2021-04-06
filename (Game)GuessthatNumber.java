/* 

Objective:
Write an application that plays “guess the number” as follows: Your program chooses the
number to be guessed by selecting a random integer in the range 1 to 1000. The application displays
the prompt Guess a number between 1 and 1000. The player inputs a first guess. If the player's guess
is incorrect, your program should display Too high. Try again. or Too low. Try again. to help the
player “zero in” on the correct answer. The program should prompt the user for the next guess.
When the user enters the correct answer, display Congratulations. You guessed the number!
 
 */

import java.util.Scanner;
import java.util.Random;

public class Probando {
	
	static void guessThatNumber() {
		//Imports and Variables
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int num;
		int ran;
		int scr = 100;
		
		//Random Number Generator
		ran = 1 + r.nextInt(1000);
		
		//Game-play
		System.out.print("Enter your number: ");
		num = s.nextInt();
		
		while (num != ran) {
			if (num < ran) {
				System.out.println("Too low! Try again.");
				System.out.print("Enter your number: ");
				scr--;
				num = s.nextInt();
			}
			else if (num > ran) {
				System.out.println("Too high! Try again.");
				System.out.print("Enter your number: ");
				scr--;
				num = s.nextInt();
			}
		}
			
		if (num == ran)	
		System.out.println("Congratulations! You guessed the number. The number was: " + ran + ". Your score was: " + scr + "/100");
			
		
	}
	
	public static void main(String[] args) {
		
		//Introduction
		System.out.println("Welcome to \"Guess that number\"!");
		System.out.println("In this game you will guess a number from 1 - 1000.");
		System.out.println("The goal of this game is to obtain the answer in the least amount of guesses possible.");
		System.out.println("If you guess too high, try a lower number. If you guess too low, try a higher number.");
		System.out.println("The score is out of 100. Try and beat your \"high-score\".");
		System.out.println("Lets Start!");
		
		//Game function
		guessThatNumber();
	}
}
