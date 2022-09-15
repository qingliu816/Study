
/* 
 * CS210 chapter6 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.05.17 - Spring quarter
 *
 * This program to strip the comments from file.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise13Chapter6 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("Exercise13Chapter6.txt"));// create scanner to read from file
		stripComments(input);
	}

	private static void stripComments(Scanner input) {
		boolean insideComment = false;
		while (input.hasNext()) {// while file still have lines
			String lastLine = input.nextLine();// read the line
			for (int i = 0; i < lastLine.length(); i++) { // parse each character.
				if (insideComment) { // If current position is inside /* */ comment.
					if (lastLine.charAt(i) == '/' && i - 1 >= 0 && lastLine.charAt(i - 1) == '*') {
						// if it's end of /* */ comment
						insideComment = false; // set the inside comment flag to false.
					}
				} else if (lastLine.charAt(i) == '/' && i + 1 < lastLine.length() && lastLine.charAt(i + 1) == '/') {
					// if it's the start of // comment
					i = lastLine.length(); // jump to the end of the line.
				} else if (lastLine.charAt(i) == '/' && i + 1 < lastLine.length() && lastLine.charAt(i + 1) == '*') {
					// if it's the start of /* comment
					insideComment = true; // set the inside comment flag to true.
				} else { // any other case
					System.out.print(lastLine.charAt(i)); // print the char
				}
			}
			if (!insideComment) { // if it's not inside the /* */ comment
				System.out.println();
			}
		}
	}
}
