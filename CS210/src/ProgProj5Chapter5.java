
/* 
 * CS210 Chapter5 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.11- Spring quarter
 *
 * This program is to plays many rounds of Rock Paper Scissors.
 */
import java.util.*;

public class ProgProj5Chapter5 {

	public static void main(String[] args) {
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
}
