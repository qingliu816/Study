
/* 
 * CS210 Chapter8 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.6.10 - Spring quarter
 *
 * This class is contains the useful methods.
 * 
 * Learned: I have learned several way to write java program. I have also learned several 
 * logic and types so I can use them together to build up a program.
 * Challenge: My biggest challenge is that I sometimes don't know 
 * how to start after get a problem. I am now trying to think of big steps first 
 * and then think about details once get a problem.
 * Improve: I think I should spend some time for typing in keyboard. I found I need to
 * watch keyboard while typing and which is slow.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyToolBox {
	// The method will merge 2 arrays into 1 array.
	// The method will take 2 arrays as input. Create a new array with total length
	// of 2 inputs. Copy the value from inputs to new array. Returns the new array
	// out.
	// The reason of choosing is merge is useful when reading arrays from multiple
	// files.
	// Sample:
	// input [1,2],[2] -> return [1,2,3]
	// input [1],[2] -> return [1,2]
	public int[] mergeArray(int[] array1, int[] array2) {
		int[] newArray = new int[array1.length + array2.length]; // create array with total length of inputs
		int index = 0; // The current index for new array.
		for (int i = 0; i < array1.length; i++) { // how many element in the first input.
			newArray[index++] = array1[i]; // copy all elements to new array.
		}

		for (int i = 0; i < array2.length; i++) { // how many element in the second input.
			newArray[index++] = array2[i]; // copy all elements to new array.
		}

		return newArray; // return new array.
	}

	// The method will split one array to 2 arrays.
	// The method will take one array and a number of where to split.
	// The reason of choosing is splitting array is like split string, which should
	// be used very frequently.
	// Sample:
	// input [1,2,3,4],2 -> return [1,2],[3,4]
	// input [1,2], 2 -> return [1,2]
	public int[][] splitArray(int[] array, int splitPoint) {
		int[][] result = new int[2][];
		result[0] = new int[splitPoint];
		for (int i = 0; i < splitPoint; i++) { // how many element before split point.
			result[0][i] = array[i]; // copy all elements to new array.
		}
		result[1] = new int[array.length - splitPoint];
		for (int i = 0; i < result[1].length; i++) { // how many element before split point.
			result[1][i] = array[splitPoint + i]; // copy all elements to new array.
		}

		return result;
	}

	// The method will print a menu and ask for selection.
	// The method will displays a menu and then ask for selection. If user input a
	// invalid selection, method will keep
	// asking until user inputs valid one. Method will return the selection back.
	// The reason of choosing is it's very common for menu selections.
	// Sample:
	// input ["1. Read File", "2. Write File"], user input 2 -> return 2
	// input ["1. Read File", "2. Write File", "3. exit"], user input 4 -> keep
	// asking -> user input 2 -> return 2
	public int askForSelection(Scanner console, String[] menu) {
		for (int i = 0; i < menu.length; i++) { // how many item in menu
			System.out.println(menu[i]); // print menu
		}
		System.out.print("Please select one: "); // ask for selection
		int result = 0;
		while (result < 1 || result > menu.length) {
			if (!console.hasNextInt()) {
				console.next();
				System.out.println("Invalid Input.");// while user's input is not valid
				System.out.print("Please select one: "); // ask again.
			} else {
				result = console.nextInt();
				if (result < 1 || result > menu.length) {
					System.out.println("Invalid Input.");// while user's input is not valid
					System.out.print("Please select one: "); // ask again.
				}
			}
		}

		return result;
	}

	// The method will calculate the sum of an array.
	// The method will take a array as input and then add all element up to one
	// number.
	// The reason of choosing is it will be easy to get sum of array in future.
	// Sample:
	// input [1,2,3]->6
	// input [1,-1]->0
	public int sumOfArray(int[] input) {
		int result = 0;
		for (int i = 0; i < input.length; i++) { // how many in the array
			result += input[i]; // Add to the sum.
		}

		return result; // return the sum.
	}

	// The method will calculate the average of an array.
	// The method will take a array as input and then calculate the average of the
	// array. Then returns the average out.
	// The reason of choosing is it will be easy to get average of array in future.
	// Sample:
	// input [1,2,3]->2
	// input [1,2]->1.5
	public double averageOfArray(int[] input) {
		int total = 0;
		for (int i = 0; i < input.length; i++) { // how many in the array
			total += input[i]; // Add the total.
		}

		return total * 1.0 / input.length; // return the average.
	}

	// The method will print an array of names.
	// The method will take an array as input and print them with ',' between them.
	// The reason of choosing is we some times need to print array without '[',']'.
	// Sample:
	// input ["Olivia"]-> Olivia
	// input ["Olivia", "Geoge"]->Olivia, Geoge
	public void printNames(String[] array) {
		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) { // how many strings in array
			System.out.print(", ");
			System.out.print(array[i]); // print the char
		}
	}

	// The method will count the numbers in an array.
	// The method will take an array and a number as input and return how many
	// number in that array.
	// The reason of choosing is it can find how many occurrence of a number.
	// Sample:
	// input [1,2,3,4], 1-> 1
	// input [1,1,1,1], 1-> 4
	public int totalCount(int[] array, int target) {
		int total = 0;
		for (int i = 0; i < array.length; i++) { // how many strings in array
			if (array[i] == target) {
				total++;
			}
		}

		return total;
	}

	// The method will draw a board from 2 dimension array.
	// The method will take a 2 dimension array as input and draw the board in
	// console.
	// The reason of choosing is we need to draw board several times in one game.
	// Sample:
	// input [['X','_'],['X','O']
	// Output:
	// X
	// X O
	// input [['X','O','_'],['O','X','X'],['O','O','_']
	// Output:
	// X O _
	// O X X
	// O O _
	public void drawBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) { // how many rows
			for (int j = 0; j < board[0].length; j++) {// how many columns
				System.out.print(board[i][j] + " "); // draw the cell
			}
			System.out.println();
		}
	}

	// The method will ask for file name and return scanner.
	// The method will ask for file name and try to read the file. If file does not
	// exist, it will ask again until file exists.
	// The reason of choosing is it can be used for every file read program.
	// Sample:
	// input "nofile.txt"
	// output "File not found"
	// input "askForFileName.txt"
	// output the scanner for the file.
	public Scanner askForFileName(Scanner console) {
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

	// The method will ask user if they want to play again and return the boolean
	// value.
	// The method will displays question to user asking if play again. Then it
	// detects user's input. If input is invalid, method will keep asking user until
	// detect a valid input. Then it returns boolean of playing again or not.
	// The reason of choosing is many programs will ask user if they want to play
	// again.
	// Sample:
	// user input "Y" -> return True
	// user input "n" -> return False
	public boolean askForPlayAgain(Scanner console) {
		String playAgain = "";
		while (!playAgain.equals("Y") && !playAgain.equals("y") && !playAgain.equals("N") && !playAgain.equals("n")) {
			// while user's input is not valid
			System.out.print("Play again(y/n)? "); // ask if play again.
			playAgain = console.nextLine(); // read input
		}

		return playAgain.equals("Y") || playAgain.equals("y"); // if user ask for playing again, return true.
	}
}
