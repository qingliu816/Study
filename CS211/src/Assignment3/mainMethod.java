/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is for list people who have been to different countries
 */
package Assignment3;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;

public class mainMethod {
	public static void main(String[] args) throws FileNotFoundException {
		People p = new People("people.txt");// create a new instance
		printNames(p.takeMexico(), "people have been to Mexico");
		printNames(p.takeCuba(), "people have been to Cuba");
		printNames(p.takeJamaica(), "people have been to Jamaica");
		printNames(p.anyOfThem(p.Mexico, p.Cuba, p.Jamaica), "people have been to Mexico or Cuba or Jamaica");
		printNames(p.threeOfThem(p.Mexico, p.Cuba, p.Jamaica), "people have been to Mexico and Cuba and Jamaica");

		printNames(p.bothCountriesExceptOne(p.Mexico, p.Cuba, p.Jamaica),
				"people have been to Mexcio and Cuba but not Jamica");

		printNames(p.onlyCuba(p.Mexico, p.Cuba, p.Jamaica), "people have been to only Cuba");
	}// list the people in the different situation

	private static void printNames(HashSet<String> names, String title) {

		Iterator<String> m = names.iterator();

		System.out.println(title);
		while (m.hasNext()) {
			System.out.println(m.next());
		}
		System.out.println();
	}// because all the list method use the iterator for the names ,so a create a
		// method for them

}
