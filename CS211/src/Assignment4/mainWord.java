/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.17 - Fall quarter
 *
 * This program is for a word game
 */
package Assignment4;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class mainWord {
	public static void main(String[] args) throws FileNotFoundException {
		word211 word = new word211();
		word.read("FRUIT.txt");
		HashMap<String, String> checkname = word.checkName();
		for (String q : checkname.keySet()) {
			String fruitName = checkname.get(q);
			askAndCheck(q, fruitName, word.description.get(fruitName));
		}

	}

	private static void askAndCheck(String q, String answer, String description) {// This method is for check the answer
																					// from console
		System.out.println(q);
		System.out.println("What word do these letters make?");
		double startTime = System.currentTimeMillis();
		Scanner console = new Scanner(System.in);
		String userInput = "";
		while (true) {
			userInput = console.nextLine();
			if (userInput.equals(answer)) {
				break;
			} else {
				System.out.println("Wrong answer. Please try again:");
			}
		}

		double totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Correct!!");
		System.out.println("Response Time: " + totalTime / 1000.0 + "sec");
		System.out.println();
		System.out.println(answer + description);
	}

}
