
/* 
 * CS210 chapter6 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.05.18 - Spring quarter
 *
 * This program to count the coin flips from file.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise15Chapter6 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("Exercise15Chapter6.txt"));// create scanner to read from file
		coinFlip(input);
	}

	private static void coinFlip(Scanner input) {
		while (input.hasNext()) {// while file still have lines
			String lastLine = input.nextLine();// read the line
			int total = 0;
			int head = 0;
			Scanner lineScanner = new Scanner(lastLine);
			while (lineScanner.hasNext()) { // while line has valid token
				String token = lineScanner.next();
				if (token.equals("H") || token.equals("h")) { // If it is head
					total++; // Add total count.
					head++; // Add head count.
				} else if (token.equals("T") || token.equals("t")) { // If it is tail
					total++; // Add total count.
				}
			}
			double percentage = head * 100.0 / total; // Calculate percentage.
			System.out.printf("%d heads (%.1f%%)\n", head, percentage); // Print percentage.
			if (percentage > 50) { // If more than 50% percent.
				System.out.println("You win!");
			}
			System.out.println();
		}
	}
}
