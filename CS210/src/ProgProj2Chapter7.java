import java.util.Scanner;

/* 
 * CS210 Chapter7 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.22 - Spring quarter
 *
 * This program is a Hangman game.
 */
public class ProgProj2Chapter7 {
	public static void main(String[] args) {
		String word = "island"; // The guessing word.
		playGame(word); // Plays the game
	}

	private static void playGame(String word) {
		char[] successGuess = new char[word.length()]; // Array stores the successful guess
		for (int i = 0; i < successGuess.length; i++) { // how many char in the word.
			successGuess[i] = '_'; // set every char as '_'.
		}
		char[] failedGuess = new char[6]; // Array stores failed guesses.
		int failedCount = 0; // Failed guess count.
		boolean isSuccess = false; // has user guessed out whole word.
		Scanner console = new Scanner(System.in);
		while (!isSuccess && failedCount < 6) { // while still in the game
			char c = askForOneChar(console); // Ask for a character.
			if (!isSuccessGuess(c, word, successGuess, failedGuess, failedCount)) { // If it's not a successful guess
				failedCount++; // Add the failure count.
			}
			printResult(successGuess, failedGuess, failedCount); // Print current guess result.

			isSuccess = true;
			for (int i = 0; i < word.length(); i++) { // how many char in word.
				if (successGuess[i] == '_') { // If there is one char not guessed out.
					isSuccess = false; // set flag showing user is not win yet.
				}
			}
		}

		if (isSuccess) { // If user guessed out all the characters.
			System.out.println("You win.");
		} else { // If user tried too many failed guess.
			System.out.println("You lost.");
		}
	}

	private static void printResult(char[] successGuess, char[] failedGuess, int failedCount) {
		System.out.print("Word: ");
		printArray(successGuess); // print the guessed out word.
		System.out.println();

		System.out.printf("Your failed guess(%d/6): ", failedCount);// print failed guesses details
		printArray(failedGuess);// print failed guesses
		System.out.println();
	}

	private static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) { // how many characters in array
			System.out.print(array[i]); // print the char
			System.out.print(' ');
		}
	}

	private static boolean isSuccessGuess(char c, String word, char[] successGuess, char[] failedGuess,
			int failedCount) {
		boolean isSuccessGuess = false; // is a successful guess
		for (int i = 0; i < word.length(); i++) { // how many chars in word
			if (word.charAt(i) == c) { // if char matches user's guess
				isSuccessGuess = true; // set as successful guess
				successGuess[i] = c; // set char in the guess result.
			}
		}

		if (!isSuccessGuess) { // if user made wrong guess
			failedGuess[failedCount] = c; // set char in the failed guess
		}
		return isSuccessGuess;

	}

	private static char askForOneChar(Scanner console) {
		String input = "";
		while (input.length() != 1) { // while user has invalid input
			System.out.print("Guess a character: "); // ask for a char
			input = console.nextLine(); // read input
		}

		return input.charAt(0); // get char from user's input.
	}

}
