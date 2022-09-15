/* 
 * CS210 Chapter3 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.23 - Spring quarter
 *
 * This program is to prints numbers.
 */
public class Exercise1Chapter3 {
	public static void main(String[] args) {
		printNumbers(15);
		printNumbers(5);
	}

	public static void printNumbers(int number) {// to declare a parameter
		for (int i = 1; i <= number; i++) {
			System.out.print("[");
			System.out.print(i);
			System.out.print("]" + " ");
		}
		System.out.println();
	}
}
