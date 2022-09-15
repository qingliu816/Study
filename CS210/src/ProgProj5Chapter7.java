import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/* 
 * CS210 Chapter7 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.23 - Spring quarter
 *
 * This program is a Tic-Tac-Toe game.
 */
public class ProgProj5Chapter7 {
	public static void main(String[] args) {
		boolean playAgain = true; // play again flag.
		Scanner console = new Scanner(System.in);
		while (playAgain) { // while still play.
			char[][] board = new char[3][3]; // The board.
			for (int i = 0; i < 3; i++) { // board rows
				for (int j = 0; j < 3; j++) { // board columns
					board[i][j] = '_'; // set board to show '_'
				}
			}
			playGame(console, board); // Play game
			playAgain = askForPlayAgain(console); // Ask if play again
		}
	}

	private static void playGame(Scanner console, char[][] board) {
		System.out.println("Game start.");
		System.out.println("You are playing 'X'. I am playing 'O'.");
		int gameWinner = 0; // the winner of the game.
		Random r = new Random();
		drawBoard(board); // draw blank board.
		while (gameWinner == 0) { // While no winner.
			askUserPlay(console, board); // ask user to play
			gameWinner = findWinner(board); // check if there is a winner

			if (gameWinner == 0) { // if game is still on.
				computerPlay(r, board); // computer to play a step
				gameWinner = findWinner(board); // check if there is a winner
			}
		}

		if (gameWinner == 1) { // if user wins.
			System.out.println("You win!");
		} else if (gameWinner == 2) { // if computer wins.
			System.out.println("I win!");
		} else if (gameWinner == 3) { // if it's a tie.
			System.out.println("It's a tie.");
		}
	}

	private static int findWinner(char[][] board) {
		if (isWin(board, 'X')) { // if user win.
			return 1;
		} else if (isWin(board, 'O')) {// if computer win.
			return 2;
		} else {
			int winner = 3; // It's a tie
			for (int i = 0; i < 3; i++) { // board rows
				for (int j = 0; j < 3; j++) { // board columns
					if (board[i][j] == '_') { // there are still place to play.
						winner = 0; // No winner yet
					}
				}
			}
			return winner;
		}
	}

	private static boolean isWin(char[][] board, char c) {
		for (int i = 0; i < 3; i++) { // board size in one dimension
			int totalRow = 0; // total count in a row.
			int totalColumn = 0;// total count in a column.
			for (int j = 0; j < 3; j++) { // board size in one dimension
				if (board[i][j] == c) { // if row matches
					totalRow++; // add row count.
				}
				if (board[j][i] == c) { // if column matches
					totalColumn++; // add column count.
				}
			}
			if (totalRow == 3 || totalColumn == 3) { // if row or column has 3 same char
				return true; // return win.
			}
		}

		int slash1 = 0; // Count in slash line
		int slash2 = 0; // Count in the other slash line
		for (int i = 0; i < 3; i++) { // Count in one dimension
			if (board[i][i] == c) { // if slash matches
				slash1++; // add count
			}
			if (board[i][2 - i] == c) { // if the other slash matches
				slash2++; // add count
			}
		}

		if (slash1 == 3 || slash2 == 3) { // if slash has 3 same play.
			return true; // return win.
		}
		return false; // no winner.
	}

	private static void computerPlay(Random r, char[][] board) {
		int column = -1;
		int row = -1;
		while (column == -1 && row == -1) { // while column and row are not valid
			column = r.nextInt(3); // random a column index
			row = r.nextInt(3); // random a row index
			if (board[row][column] != '_') { // if the place is played already
				column = -1; // reset column index.
				row = -1; // reset row index.
			}
		}

		System.out.printf("I play in column %d, row %d.\n", column, row);// print the place computer played.
		board[row][column] = 'O'; // play
		drawBoard(board); // draw board.
	}

	private static void askUserPlay(Scanner console, char[][] board) {
		int column = -1;
		int row = -1;
		while (column == -1 && row == -1) {// while column and row are not valid
			column = getInput(console, "column") - 1; // ask which column user to play
			row = getInput(console, "row") - 1; // ask which row user to play
			if (board[row][column] != '_') { // if the place is already played.
				System.out.printf("Column %d, row %d already played.\n", column + 1, row + 1); // show error
				column = -1; // reset column index.
				row = -1; // reset row index.
			}
		}

		board[row][column] = 'X'; // Play
		drawBoard(board); // draw board.
	}

	private static int getInput(Scanner console, String dimension) {
		int input = 0;
		while (input == 0) { // while user's input is not valid.
			try {
				System.out.printf("Choose the %s to play(1-3): ", dimension); // ask for a place to play.
				input = console.nextInt(); // read the number.
				console.nextLine();
			} catch (InputMismatchException ex) { // invalid input
				input = 0; // reset input.
			}
		}

		return input;
	}

	private static void drawBoard(char[][] board) {
		for (int i = 0; i < 3; i++) { // how many rows
			for (int j = 0; j < 3; j++) {// how many columns
				System.out.print(board[i][j] + " "); // draw the cell
			}
			System.out.println();
		}
	}

	private static boolean askForPlayAgain(Scanner console) {
		String playAgain = "";
		while (!playAgain.equals("Y") && !playAgain.equals("y") && !playAgain.equals("N") && !playAgain.equals("n")) {
			// while user's input is not valid
			System.out.print("Play again(y/n)? "); // ask if play again.
			playAgain = console.nextLine(); // read input
		}

		return playAgain.equals("Y") || playAgain.equals("y"); // if user ask for playing again, return true.
	}
}
