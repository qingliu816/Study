/* 
 * CS210 Assignment 01 (Methods - Sequence)
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.13 - Spring quarter
 *
 * This program is a short puzzle.
 */

public class Proj01_A_Methods {

	public static void first() {
		System.out.println("first method");
		third();
	}

	public static void second() {
		System.out.println("second method");
		third();
		first();
	}

	public static void third() {
		System.out.println("third method");
	}

	public static void main(String[] args) {
		// DO NOT change this main method
		first();
		third();
		second();
		third();
		// DO NOT change this main method
	}
}

// Desired output:
// first method
// third method
// third method
// second method
// third method
// first method
// third method
// third method
