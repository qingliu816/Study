
/* 
 * CS210 chapter6 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.05.18 - Spring quarter
 *
 * This program to search and print statistics on a name.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgProj4Chapter6 {

	public static void main(String[] args) throws FileNotFoundException {
		String name = askForName(); // ask for name
		searchForName(name); // search the name in the file.
	}

	private static String askForName() {
		System.out.println("This program allows you to search through the");
		System.out.println("data from the Social Security Administration");
		System.out.println("to see how popular a particular name has been");
		System.out.println("since 1900.");
		System.out.println();
		System.out.print("Name? ");

		Scanner console = new Scanner(System.in);
		return console.next(); // Read name from console.
	}

	private static void searchForName(String name) throws FileNotFoundException {
		Scanner input = new Scanner(new File("ProgProj4Chapter6.txt"));// create scanner to read from file
		while (input.hasNext()) {// while file still have lines
			String lastLine = input.nextLine();// read the line
			if (lastLine.startsWith(name + " ")) { // if name is found
				printStatistics(name, lastLine); // print statistics.
			}
		}
	}

	private static void printStatistics(String name, String lastLine) {
		System.out.printf("Statistics on name \"%s\"\n", name);
		int lastStart = lastLine.indexOf(' '); // the start index of first popularity
		int year = 1900; // first year
		for (int i = lastStart + 1; i <= lastLine.length(); i++) { // scan every char after first popularity
			if (i == lastLine.length() || lastLine.charAt(i) == ' ') { // if it's a white space
				System.out.printf("    %d: %s\n", year, lastLine.substring(lastStart, i)); // print popularity
				lastStart = i + 1; // move start index to next popularity
				year += 10; // move year to 10 years later.
			}
		}
	}
}
