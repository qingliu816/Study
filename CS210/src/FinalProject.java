import java.util.Arrays;
import java.util.Scanner;

/* 
 * CS210 Chapter8 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.6.10 - Spring quarter
 *
 * This class is to create MyToolBox and call it's methods.
 */
public class FinalProject {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		MyToolBox myToolBox = new MyToolBox();

		myToolBox.askForPlayAgain(console);

		int[] averageOfArrayInput = { 1, 2, 3 };
		System.out.println(myToolBox.averageOfArray(averageOfArrayInput));

		myToolBox.askForFileName(console);

		String[] menu = { "1. item 1", "2. item 2", "3. quit" };
		System.out.println(myToolBox.askForSelection(console, menu));

		char[][] board = { { 'X', 'O' }, { 'O', 'X' } };
		myToolBox.drawBoard(board);

		int[] mergeArray1 = { 1, 2, 3 };
		int[] mergeArray2 = { 3, 2, 1 };
		System.out.println(Arrays.toString(myToolBox.mergeArray(mergeArray1, mergeArray2)));

		String[] names = { "Olivia", "Geoge" };
		myToolBox.printNames(names);

		int[] sumOfArrayInput = { 1, 2, 3 };
		System.out.println(myToolBox.sumOfArray(sumOfArrayInput));

		int[] totalCountInput = { 1, 2, 2 };
		System.out.println(myToolBox.totalCount(totalCountInput, 2));
	}
}
