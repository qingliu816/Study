
/* 
 * CS210 chapter6 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.05.20 - Spring quarter
 *
 * This program to read from user's input, then an external file and analyze the file.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingData {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		Scanner input = askForFileName(console); // Ask user for the file name
		String gender = askForGender(console); // Ask user for the gender
		processFile(gender, input); // Process the file
		console.close();
		input.close();
	}

	private static Scanner askForFileName(Scanner console) {
		Scanner input = null;
		while (input == null) { // while file does not exist.
			try {
				System.out.print("Enter file to read (case insensitive): "); // Ask for file name.
				input = new Scanner(new File(console.next())); // Create scanner based on user's input.
			} catch (FileNotFoundException ex) { // If file not found.
				System.out.println("File not found"); // Print error message.
				input = null; // Reset the input scanner.
			}
		}

		return input;
	}

	private static String askForGender(Scanner console) {
		String gender = "";
		while (!gender.equals("f") && !gender.equals("m")) { // While user inputs invalid gender.
			System.out.print("Parse students by gender (M/F): "); // Ask for gender.
			gender = console.next().toLowerCase(); // Read user's input
		}

		return gender;
	}

	private static void processFile(String gender, Scanner input) {
		String genderOutput = ""; // The gender string for printing.
		if (gender.equals("f")) { // if it's female.
			genderOutput = "female";
		} else { // if it's male
			genderOutput = "male";
		}
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		System.out.printf("List of (%s) students:\n", genderOutput);
		System.out.println();

		System.out.println("    ID #   NAME           AGE"); // print header.
		System.out.println("    ----   ---------      ----");
		int totalStudent = 0;
		int printedStudent = 0;
		double totalAge = 0;
		while (input.hasNext()) {// while file still have lines
			String id = input.next(); // read id.
			String name = input.next(); // read name.
			String genderInFile = input.next(); // read gender.
			double age = input.nextDouble(); // read age.
			totalStudent++; // Add one more student count.
			if (genderInFile.toLowerCase().equals(gender)) { // If gender matches what need to print.
				printedStudent++; // Add one more printed student count.
				totalAge += age; // Add the total age.
				System.out.printf("    %-4s   %-9s      %.1f\n", id, name, age); // print student info.
			}
		}

		System.out.println();
		System.out.printf("There are (%d) %s students. (%.2f%% of class)\n", printedStudent, genderOutput,
				printedStudent * 100.0 / totalStudent); // Print first line of summary.
		System.out.printf("Their average age is: %.1f years\n", totalAge / printedStudent); // Print second line of
																							// summary
	}
}
