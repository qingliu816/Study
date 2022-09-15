/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is for reading a file and sorting people who have been to different countries
 */
package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class People {
	HashSet<String> Mexico = new HashSet<String>();
	HashSet<String> Cuba = new HashSet<String>();
	HashSet<String> Jamaica = new HashSet<String>();// create HashSet for different countries

	public People(String file) throws FileNotFoundException {
		Scanner input = new Scanner(new File(file));
		read(input);

	}

	public void read(Scanner input) {

		while (input.hasNext()) {
			String name = input.next();
			String country = input.next();
			if (country.equalsIgnoreCase("Mexico")) {
				Mexico.add(name);
			} else if (country.equalsIgnoreCase("Cuba")) {
				Cuba.add(name);
			} else if (country.equalsIgnoreCase("Jamaica")) {
				Jamaica.add(name);
			}

		}
	}

	public HashSet<String> takeMexico() {// Create a method to list the people who have been to Mexico
		return Mexico;
	}

	public HashSet<String> takeCuba() {// Create a method to list the people who have been to Cuba
		return Cuba;
	}

	public HashSet<String> takeJamaica() {// Create a method to list the people who have been to Jamaica
		return Jamaica;
	}

	public HashSet<String> anyOfThem(HashSet<String> mexico, HashSet<String> cuba, HashSet<String> jamaica) {
		// create a method for people who have been to Mexico or Cuba or Jamaica
		HashSet<String> anyCountries = new HashSet<String>(mexico);// Create a new HashSet to copy the Mexico value,so
		anyCountries.addAll(cuba);// get people who have been to M or C
		anyCountries.addAll(jamaica);// get people who have beEn to M or C or J
		return anyCountries;
	}

	public HashSet<String> threeOfThem(HashSet<String> mexico, HashSet<String> cuba, HashSet<String> jamaica) {
		// Create a method to list the people who have been to three of the countries.
		HashSet<String> threeCountries = new HashSet<String>(mexico);
		threeCountries.retainAll(cuba);// get people who have been to both countries
		threeCountries.retainAll(jamaica);// get people who have been to there countries
		return threeCountries;
	}

	public HashSet<String> bothCountriesExceptOne(HashSet<String> mexico, HashSet<String> cuba,
			HashSet<String> jamaica) {// Create a method to list the people who have been to both M and C but not
		HashSet<String> mAndcNotJ = new HashSet<String>(mexico);
		mAndcNotJ.retainAll(cuba);// get people who have been to both M and C
		mAndcNotJ.removeAll(jamaica);// subtract people who have been to J from the both
		return mAndcNotJ;

	}

	public HashSet<String> onlyCuba(HashSet<String> mexico, HashSet<String> cuba, HashSet<String> jamaica) {
		// Create a method to list people who only have been to cuba except the others
		HashSet<String> both = new HashSet<String>(mexico); // create a new HashSet for getting people who have been to
															// both M and J later,and copy the value of M
		HashSet<String> onlycuba = new HashSet<String>(cuba);// Creat a new HashSet for getting people who only have
																// been to Cuba later
		both.addAll(jamaica);// to get people who have been to both M and J
		onlycuba.removeAll(both);// subtract people who have been to both countries from people who have been to
									// Cuba
		return onlycuba;
	}

}
