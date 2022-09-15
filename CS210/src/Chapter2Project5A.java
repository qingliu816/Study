/* 
 * CS210 chapter2 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.04.16 - Spring quarter
 *
 * This program prints stairs
 */
public class Chapter2Project5A {
	public static final int TOTAL_STAIRS = 5;

	public static void space1(int a) {
		for (int i = 1; i <= 5 * (TOTAL_STAIRS - a); i++) { // How many spaces before person
			System.out.print(" ");
		}
	}

	public static void space2(int b) {
		for (int i = 1; i <= 5 * (b - 1); i++) { // How many spaces after stairs
			System.out.print(" ");
		}
		System.out.println("*"); // The ending * in each line.
	}

	public static void main(String[] args) {
		for (int stairs = 1; stairs <= TOTAL_STAIRS; stairs++) { // How many stairs
			space1(stairs);
			System.out.print("  o  ******"); // Draw head
			space2(stairs);
			space1(stairs);
			System.out.print(" /|\\ *     "); // Draw body
			space2(stairs);
			space1(stairs);
			System.out.print(" / \\ *     "); // Draw foot
			space2(stairs);
		}

		// The floor line
		for (int i = 1; i <= 5 * TOTAL_STAIRS + 7; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
