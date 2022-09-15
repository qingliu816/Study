/* 
 * CS210 Chapter3 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.25 - Spring quarter
 *
 * This program is to prints the characters in opposite order .
 */
public class Exercise19Chapter3 {

	public static void main(String[] args) {
		printReverse("hello there!");

	}

	public static void printReverse(String s) {
		// get the length of the string and state with the the last index value
		for (int i = s.length() - 1; i >= 0; i--) {
			// to get each character from back to front
			System.out.print(s.charAt(i));
		}
	}
}
