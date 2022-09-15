/* 
 * CS210 Project 01 (Methods - Rockets)
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.14 - Spring quarter
 *
 * This program __draws a picture of rockets_______.
 */

public class Proj01_C_Rockets {

	public static void main(String[] args) {
		topOrBottom();
		middleSquare();
		line1();
		line2();
		middleSquare();
		topOrBottom();
	}

	public static void topOrBottom() {
		System.out.println("   /\\     \\    /");
		System.out.println("  /  \\     \\  /");
		System.out.println(" /    \\     \\/");
	}

	public static void line1() {
		System.out.println("|======| |=<60>=| ");
	}

	public static void line2() {
		System.out.println("|=<09>=| |======| ");
	}

	public static void middleSquare() {
		System.out.println("+------+ +------+ ");
		System.out.println("|      | |      | ");
		System.out.println("|      | |      | ");
		System.out.println("+------+ +------+ ");
	}
}