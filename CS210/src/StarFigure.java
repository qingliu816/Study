/* 
 * CS210 Chapter2 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.16 - Spring quarter
 *
 * This program is prints a star figure
 */
public class StarFigure {

	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {// How many lines of the figure
			for (int i = 1; i <= (-4 * line + 20); i++) { // The number of '/'in a line
				System.out.print("/");
			}
			for (int i = 1; i <= (8 * line - 8); i++) {// The number of '*'in a line
				System.out.print("*");
			}
			for (int i = 1; i <= (-4 * line + 20); i++) {// The number of '\'in a line
				System.out.print("\\");

			}
			System.out.println();
		}
	}
}