
/* 
 * CS210 Chapter7 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.26 - Spring quarter
 *
 * This program is to read user's input and report back the information.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Coder {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); // create console scanner
		boolean isEncode = readIsEncode(console); // ask if it is encode.
		boolean isFile = readIsFile(console); // ask if it is from file
		String encodeDecodeString = "encode"; // The string for printing.
		if (!isEncode) { // if it is encode.
			encodeDecodeString = "decode"; // change string to "decode"
		}
		String input = getInput(isFile, encodeDecodeString, console); // read input.
		String outputFile = getOutputFile(console); // read output file name
		String result = "";
		if (isEncode) { // if it is encode
			result = encode(input); // get encode result.
		} else {
			result = decode(input); // get decode result.
		}
		saveResult(outputFile, result); // save result to file
	}

	private static String decode(String input) {
		input = input.substring(1, input.length() - 1).replace(',', ' '); // remove '[',']',',' in input.
		Scanner stringScanner = new Scanner(input); // create scanner for input string
		String result = "";
		while (stringScanner.hasNext()) { // while has more token
			if (stringScanner.hasNextInt()) { // if has int token
				result += (char) stringScanner.nextInt(); // read a int and convert to char.
			} else {
				stringScanner.next();
			}
		}

		System.out.printf("Decodes to: \"%s\"\n", result); // print result in console.
		return result;
	}

	private static String encode(String input) {
		int[] asciiArray = new int[input.length()]; // ascii array
		for (int i = 0; i < input.length(); i++) { // how many chars in the string
			asciiArray[i] = input.charAt(i); // convert each char to int.
		}

		String result = Arrays.toString(asciiArray); // get array string.
		System.out.printf("ASCII value of \"%s\" is following\n%s\n", input, result); // print result to console.
		return result;
	}

	private static void saveResult(String outputFile, String result) {
		PrintStream output = null;
		try {
			output = new PrintStream(new File(outputFile)); // create output file.
		} catch (FileNotFoundException e) {
		}
		output.println(result); // print result to file
		System.out.printf("The result have been saved as a text file: %s", outputFile); // show message that file saved.
	}

	private static String getInput(boolean isFile, String encodeDecodeString, Scanner console) {
		if (isFile) { // if input is from file
			return getFileInput(console, encodeDecodeString); // read from file.
		} else {
			return getConsoleInput(console, encodeDecodeString); // read from console.
		}
	}

	private static String getOutputFile(Scanner console) {
		System.out.print("Save the results as: "); // ask for output file name.
		return console.nextLine(); // get output file name.
	}

	private static String getConsoleInput(Scanner console, String encodeDecodeString) {
		System.out.print("How many words? "); // ask how many words.
		console.nextLine(); // get words.
		System.out.printf("What would you like to %s? ", encodeDecodeString); // ask for the input string.
		return console.nextLine(); // read the input string.
	}

	private static String getFileInput(Scanner console, String encodeDecodeString) {
		Scanner fileInput = null;
		while (fileInput == null) { // while input is not valid.
			System.out.printf("What would you like to %s? ", encodeDecodeString); // ask for file name.
			String fileName = console.nextLine(); // read file name.

			try {
				fileInput = new Scanner(new File(fileName)); // create scanner.
			} catch (FileNotFoundException e) { // if file not found
				System.out.println("File Not Found."); // show error
				fileInput = null;
			}
		}

		return fileInput.nextLine(); // read from file
	}

	private static boolean readIsFile(Scanner console) {
		String input = "";
		while (!input.equals("yes") && !input.equals("no")) { // while input is not valid
			System.out.print("Is it a file? "); // ask if it is file
			input = console.nextLine().toLowerCase(); // read input.
		}
		return input.equals("yes"); // return if it is file.
	}

	private static boolean readIsEncode(Scanner console) {
		String input = "";
		while (!input.equals("encode") && !input.equals("decode")) { // while input is not valid
			System.out.print("Would you like to encode or decode? "); // ask if encode or decode
			input = console.nextLine().toLowerCase(); // read input
		}
		return input.equals("encode"); // return if it is encode.
	}

}
