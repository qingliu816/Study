
/* 
 * CS210 Chapter8 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.6.2 - Spring quarter
 *
 * This class is to use MyStudents to print results.
 */
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Proj08_Classes {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in); // create scanner
		MyStudent myStudent = new MyStudent(); // create mystudent object
		askForFileName(console, myStudent); // Ask user for the file name
		String gender = askForGender(console); // Ask user for the gender
		String genderString = "female"; // create gender string for print
		if (gender.equals("m")) { // if input is male.
			genderString = "male"; // set gender string to male.
		}
		System.out.printf("The (%s) students are: %s\n", genderString, getStudentNames(myStudent.studentList(gender)));
		System.out.printf("Their average age is (%f) years.\n", myStudent.avgAge(gender));
		System.out.printf("There are (%d) %s students.\n", myStudent.howMany(gender), genderString);
		System.out.println();

		int age = askForAge(console); // Ask user for the age
		System.out.printf("The students older than (%.1f) are: %s", (double) age, getStudentNames(myStudent.age(age)));
	}

	// ask the input file name
	private static void askForFileName(Scanner console, MyStudent myStudent) {
		boolean readSuccess = false;
		while (!readSuccess) { // while file does not exist.
			try {
				System.out.print("Enter file to read (case insensitive): "); // Ask for file name.
				myStudent.readData(console.nextLine()); // Create scanner based on user's input.
				readSuccess = true;
			} catch (FileNotFoundException ex) { // If file not found.
				System.out.println("File not found"); // Print error message.
			}
		}
		System.out.println();
	}

	// ask for gender
	private static String askForGender(Scanner console) {
		String gender = "";
		while (!gender.equals("f") && !gender.equals("m")) { // While user inputs invalid gender.
			System.out.print("Parse students by gender (M/F): "); // Ask for gender.
			gender = console.next().toLowerCase(); // Read user's input
		}

		return gender;
	}

	// as for age
	private static int askForAge(Scanner console) {
		int age;
		System.out.print("Minimum age for inclusion: "); // Ask for age.
		while (!console.hasNextInt()) {
			System.out.println("Not a valid age"); // Invalid input
			System.out.print("Minimum age for inclusion: "); // Ask for age.
			console.next(); // consume invalid input.
		}
		age = console.nextInt(); // Read user's input

		return age;
	}

	// print student name list
	private static String getStudentNames(String[] studentList) {
		String arrayString = Arrays.toString(studentList); // Generate array.
		return arrayString.substring(1, arrayString.length() - 1); // get the name list without '[',']'
	}
}
