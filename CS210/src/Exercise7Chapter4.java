/* 
 * CS210 Chapter4 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.1 - Spring quarter
 *
 * This program is to print o x matrix.
 */
public class Exercise7Chapter4 {

	public static void main(String[] args) {
		xo(5);// call the method with size
		xo(6);
	}

	public static void xo(int size) {
		for (int line = 1; line <= size; line++) {// how many lines
			for (int i = 1; i <= size; i++) {// how many columns
				if (i == line || i == (-line + size + 1)) {// find the position for x
					System.out.print("x");

				} else {
					System.out.print("o");
				}

			}
			System.out.println();// change to another line
		}
	}
}
