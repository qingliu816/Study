/* 
 * CS210 Chapter3 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.24 - Spring quarter
 *
 * This program is to prints number square.
 */
public class Exercise4Chapter3 {

	public static void main(String[] args) {
		printSquare(3, 7);
	}

	public static void printSquare(int a, int b) {
		for (int line = 1; line <= b - a + 1; line++) { // How many lines.
			for (int i = 1; i <= b - a + 1; i++) { // How many numbers in one line.
				int out = (i + line - 2) % (b - a + 1) + a; // The number in the position.
				System.out.print(out);
			}
			System.out.println(); // Start new line.
		}
	}
}