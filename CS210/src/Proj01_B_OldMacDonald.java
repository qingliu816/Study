/* 
 * CS210 Project 01 (Methods - Old MacDonald Had Farm)
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.04.14 - Spring quarter
 *
 * This program prints the song "Old MacDonald".
 */

public class Proj01_B_OldMacDonald {

	public static void main(String[] args) {
		farmUpperCase();
		cow();
		moo();
		farmLowerCase();
		newLine();

		farmUpperCase();
		pig();
		oink();
		farmLowerCase();
		newLine();

		farmUpperCase();
		duck();
		quack();
		farmLowerCase();
		newLine();

		farmUpperCase();
		horse();
		neigh();
		farmLowerCase();
		newLine();

		farmUpperCase();
		lamb();
		baa();
		farmLowerCase();
		newLine();

		farmUpperCase();
		chicken();
		cluck();
		baa();
		neigh();
		quack();
		oink();
		moo();
		farmLowerCase();
	}

	// The end of the song dose not have a empty line so I create a new method here
	public static void newLine() {
		System.out.println();
	}

	public static void farmLowerCase() {
		System.out.println("Old MacDonald had a farm");
		System.out.println("E-I-E-I-O");
	}

	public static void farmUpperCase() {
		System.out.println("Old MACDONALD had a farm");
		System.out.println("E-I-E-I-O");
	}

	public static void cow() {
		System.out.println("And on his farm he had a cow");
		System.out.println("E-I-E-I-O");
	}

	public static void moo() {

		System.out.println("With a moo moo here");
		System.out.println("And a moo moo there");
		System.out.println("Here a moo, there a moo");
		System.out.println("Everywhere a moo moo");
	}

	public static void pig() {
		System.out.println("And on his farm he had a pig");
		System.out.println("E-I-E-I-O");
	}

	public static void oink() {
		System.out.println("With a oink oink here");
		System.out.println("And a oink oink there");
		System.out.println("Here a oink, there a oink");
		System.out.println("Everywhere a oink oink");
	}

	public static void duck() {
		System.out.println("And on his farm he had a duck");
		System.out.println("E-I-E-I-O");
	}

	public static void quack() {
		System.out.println("With a quack quack here");
		System.out.println("And a quack quack there");
		System.out.println("Here a quack, there a quack");
		System.out.println("Everywhere a quack quack");
	}

	public static void horse() {
		System.out.println("And on his farm he had a horse");
		System.out.println("E-I-E-I-O");
	}

	public static void neigh() {
		System.out.println("With a neigh neigh here");
		System.out.println("And a neigh neigh there");
		System.out.println("Here a neigh, there a neigh");
		System.out.println("Everywhere a neigh neigh");
	}

	public static void lamb() {

		System.out.println("And on his farm he had a lamb");
		System.out.println("E-I-E-I-O");
	}

	public static void baa() {
		System.out.println("With a baa baa here");
		System.out.println("And a baa baa there");
		System.out.println("Here a baa, there a baa");
		System.out.println("Everywhere a baa baa");
	}

	public static void chicken() {
		System.out.println("And on his farm he had some chickens");
		System.out.println("E-I-E-I-O");
	}

	public static void cluck() {
		System.out.println("With a cluck cluck here");
		System.out.println("And a cluck cluck there");
		System.out.println("Here a cluck, there a cluck");
		System.out.println("Everywhere a cluck cluck");
	}
}
