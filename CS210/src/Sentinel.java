
/* 
 * CS210 Chapter5 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.14 - Spring quarter
 *
 * This program is to be create a sentinel program that asks for a password.   */
import java.util.*;

public class Sentinel {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		login(console);// Function to login
		chooseAndPlayGames(console);// Function to ask user to choose a game and play.
	}

	private static void login(Scanner console) {
		boolean hasLogin = false; // A flag shows if user has logged in.
		while (!hasLogin) { // While user is not logged in
			System.out.print("Enter the password: "); // Ask for password.
			String password = console.next(); // Read the password.
			if (password.equalsIgnoreCase("cs210")) { // If password is correct.
				System.out.println("Logging in ,Please wait...");
				hasLogin = true;
			} else { // If password is wrong.
				System.out.println("Wrong password.Please try again.");
			}
		}
	}

	private static void chooseAndPlayGames(Scanner console) {
		boolean isExit = false; // Flag if exit the game.
		Random r = new Random();
		while (!isExit) {// While user are still in the game.
			displayMenu(); // Display the menu.
			
			System.out.print("Choose a proramming to run: "); // Ask for a choice.
			try {
				int num = console.nextInt(); // Read the choice.

				if (num == 1) { // User chose rock paper scissors game.
					System.out.println();
					System.out.println("You ask for a Rock paper scissors game");
				} else if (num == 2) { // User chose calculator game.
					System.out.println();
					System.out.println("You ask for a Tip calculator game");
				} else if (num == 3) { // User chose adding number game.
					System.out.println();
					System.out.println("You ask for a Number adding game");
				} else if (num == 4) { // User chose guessing number game.
					System.out.println();
					System.out.println("You ask for a Guessing number game");
				} else if (num == 5) { // User chose random game.
					System.out.println();
					System.out.println("You ask for a Random game");
					num = r.nextInt(4) + 1;
				} else if (num == 6) { // User chose to exit.
					System.out.println("Thank you for using Qing's Sentinel");
					isExit = true;
				} else { // Not a valid choice.
					System.out.println("That is not a valid selection.");
				}

				if (num >= 1 && num <= 4) { // Plays the game.
					playGame(num);
				}
			} catch (Exception e) { // User input invalid integer.
				System.out.println("That is not a valid selection.");
			}
		}
	}

	private static void playGame(int num) {
		try {
			if (num == 1) { // Play rock paper scissors game
				System.out.println("Launching Rock,paper,scissors game");
				System.out.println();
				rock();
			} else if (num == 2) { // Play tip calculator game.
				System.out.println("Launching Tip calculator game");
				System.out.println();
				tip();
			} else if (num == 3) {// Play number adding game.
				System.out.println("Launching Number adding game");
				System.out.println();
				adding();
			} else if (num == 4) { // Play guessing number game.
				System.out.println("Lanuching Guessing number game");
				System.out.println();
				guessing();
			}
		} catch (Exception e) { // Game ended with error.
			System.out.println("Game error.");
		}
	}

	public static void displayMenu() {
		System.out.println();
		int index = 1; // The index of each menu.
		System.out.println("please choose following menu:");
		System.out.printf("%2d. Rock,paper,scissiors\n", index++);
		System.out.printf("%2d. Tip calculator\n", index++);
		System.out.printf("%2d. Number adding\n", index++);
		System.out.printf("%2d. Guessing number\n", index++);
		System.out.printf("%2d. Choose for me (Random)\n", index++);
		System.out.printf("%2d. Exit\n", index++);
		System.out.println();
	}

	public static void rock() {
		Scanner console = new Scanner(System.in);
		System.out.println("Rock Paper Scissor game start."); // Print start game.
		Random random = new Random();
		boolean playAgain = true; // Set if need to play again flag.
		while (playAgain) { // If user ask for playing again.
			playOneRound(random, console); // Play one round.
			playAgain = askIfPlayAgain(console); // Ask for if play again.
		}
	}

	private static void playOneRound(Random random, Scanner console) {
		boolean hasAnswer = false;
		while (!hasAnswer) { // If we haven't get good answer from user.
			System.out.print("What do you have? Rock? Paper? Scissor?"); // Ask for answer
			String answer = console.nextLine(); // Get answer.
			if (answer.equals("Rock") || answer.equals("Paper") || answer.equals("Scissor")) {
				// If it is a valid answer.
				playAndShowResult(random, answer); // Show the result.
				hasAnswer = true; // Skip the loop.
			} else {
				System.out.println("Please type Rock or Paper or Scissor."); // Ask for a valid answer.
			}
		}
	}

	private static void playAndShowResult(Random random, String answer) {
		String computerPlay = makeComputerPlay(random); // Computer make a play.
		if (computerPlay.equals(answer)) { // If computer play is same as user's play
			System.out.println("Mine is also " + computerPlay + ". It's a tie."); // Tell user it's a tie.
		} else if ((computerPlay.equals("Rock") && answer.equals("Scissor"))
				|| (computerPlay.equals("Scissor") && answer.equals("Paper"))
				|| (computerPlay.equals("Paper") && answer.equals("Rock"))) { // If computer wins
			System.out.println("Mine is " + computerPlay + ". I win."); // Tell user computer wins.
		} else { // If user wins.
			System.out.println("Mine is " + computerPlay + ". You win."); // Tell user user wins.
		}
	}

	private static String makeComputerPlay(Random random) {
		int playNumber = random.nextInt(3); // Choose random number between 0-2
		if (playNumber == 1) { // If random number is one
			return "Rock"; // Computer play Rock
		} else if (playNumber == 2) { // If random number is two.
			return "Scissor"; // Computer play Scissor
		} else { // If random number is zero
			return "Paper"; // Computer play Paper.
		}
	}

	private static boolean askIfPlayAgain(Scanner console) {
		System.out.print("Play Again?(y/n)"); // Ask if play again.
		String answer = console.nextLine(); // Get the answer
		if (answer.startsWith("y") || answer.startsWith("Y")) { // If answer start with 'y'
			return true; // Return play again.
		} else { // Other case
			return false; // Return end game.
		}
	}

	public static void tip() {
		Scanner console = new Scanner(System.in);
		double subtotal = meals(console);
		results(subtotal);
	}

	public static double meals(Scanner console) {
		System.out.print("How many people ate?");
		int people = console.nextInt();
		double subtotal = 0.0;
		for (int i = 1; i <= people; i++) {
			System.out.print("Person #" + i + ": How much did your dinner cost?");
			double personCost = console.nextDouble();
			subtotal = subtotal + personCost;
		}
		return subtotal;
	}

	public static void results(double subtotal) {
		double tax = subtotal * .08;
		double tip = subtotal * .15;
		double total = subtotal + tax + tip;
		System.out.printf("Subtotal:   $%.2f\n", subtotal);
		System.out.printf("Tax:        $%.2f\n", tax);
		System.out.printf("Tip:        $%.2f\n", tip);
		System.out.printf("Total:      $%.2f\n", total);
	}

	public static void guessing() {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the max range:"); // Ask for max range.
		int max = console.nextInt(); // Get the max number from user.

		System.out.print("Enter the min range:"); // Ask for min range.
		int min = console.nextInt(); // Get the min number from user.
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

	private static void adding() {
		Scanner console = new Scanner(System.in);

		System.out.print("How many numbers: ");
		int total = console.nextInt();
		int sum = 0;

		for (int i = 1; i <= total; i++) {

			System.out.print("Type a number: ");

			sum = sum + console.nextInt();
		}

		System.out.println("The sum is " + sum);
	}
}
