
/* 
 * CS210 chapter4 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.05.05 - Spring quarter
 *
 * This program is a random number guessing game.
 */
import java.util.Scanner;

public class GuessingGame {
	static int max;
	static int min;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the max range:"); // Ask for max range.
		max = console.nextInt(); // Get the max number from user.

		System.out.print("Enter the min range:"); // Ask for min range.
		min = console.nextInt(); // Get the min number from user.
		console.nextLine(); // Seems need to read additional line. Otherwise nextLine() is empty.

		for (int i = 1; i <= 1; i++) { // Loop for 1 time. Play again will reset the loop.
			System.out.println();
			System.out.println("Initializing...");
			System.out.println("Player is thinking of a number between " + min + " and " + max);

			playOneRound(console, min, max); // Play one round.
			if (askIfPlayAgain(console)) { // If user ask for playing again. Minus one to restart for loop.
				i--;
			}
		}
	}

	private static void playOneRound(Scanner console, int min, int max) {
		int count = 1;
		for (count = 1; max > min; count++) { // Loop until both max and min are the final number.
			int guess = (min + max) / 2; // Guess the middle number of min, max
			System.out.println("computer guesses:" + guess); // Print guess.
			System.out.print("Player responds,this is (high, low, correct):");
			String response = console.nextLine(); // Read user response.

			if (response.equals("correct") || response.equals("C")) { // If guess is correct, quit the loop.
				min = guess; // Set min number to final number
				max = guess; // Set max number to final number
				count--; // Minus one guess since current guess is correct.
			} else if (response.equals("low") || response.equals("L") || response.equals("too low")) {
				// Guess is low. Set min number to higher so next guess will be higher.
				min = guess + 1;
			} else if (response.equals("high") || response.equals("H") || response.equals("too high")) {
				// Guess is high. Set max number to lower so next guess will be lower.
				max = guess - 1;
			}
		}

		System.out.println("Then the answer must be ... " + (min + max) / 2); // Print correct number.
		System.out.println("Gme complete! that took " + count + " turn(s)"); // Print how many turns.
	}

	private static boolean askIfPlayAgain(Scanner console) {
		System.out.print("Play again?"); // Ask if play again.
		String response = console.nextLine(); // Read user answer.
		if (response.startsWith("y") || response.startsWith("Y")) { // User want to play again.
			return true;
		} else { // User don't want to play again.
			return false;
		}
	}

}
