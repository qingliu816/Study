
/* 
 * CS210 Chapter5 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.8 - Spring quarter
 *
 * This program is to to guess number between numbers between 1 and 50 inclusive until it makes a guess of at least 48.
 */
import java.util.Random;

public class Exercise6chapter5 {

	public static void main(String[] args) {

		makeGuess(48);

	}

	public static void makeGuess(int number) {
		Random r = new Random();
		System.out.print("pick a number between 1 and 50");
		int result = -1;// set to -1 to make sure we enter the loop
		int count = 0;
		while (result != number) {
			result = r.nextInt(50) + 1;// random number from 1-50
			System.out.println("guess = " + result);
			count++;
		}
		System.out.println("total guesses = " + count);
	}
}
