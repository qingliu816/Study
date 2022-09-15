
/* 
 * CS210 chapter6 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.05.16 - Spring quarter
 *
 * This program to print the lines from a file in a reversed order.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise7Chapter6 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("flipLines.txt"));// creat scanner to read number from file
		flipLines(input);
	}

	private static void flipLines(Scanner input) {
		String lastLine = null;
		while (input.hasNext()) {// while file still have lines
			if (lastLine != null) { // If there was a previous line read.
				System.out.println(input.nextLine()); // Print current line first.
				System.out.println(lastLine); // Print the previous line.
				lastLine = null;
			} else {
				lastLine = input.nextLine();// read the line
			}
		}

		if (lastLine != null) { // If there is a line left not printed yet.
			System.out.println(lastLine);
		}
	}
}
