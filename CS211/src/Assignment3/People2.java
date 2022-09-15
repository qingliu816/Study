package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class People2 {
	HashSet<String> Mexico = new HashSet<String>();
	HashSet<String> Cuba = new HashSet<String>();
	HashSet<String> Jamaica = new HashSet<String>();// create HashSet for different countries

	public People2(String file) throws FileNotFoundException {
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

	public void takeMexico() {// Create a method to list the people who have been to Mexico
		Iterator<String> m = Mexico.iterator();

		System.out.println("people have been to Mexico");
		while (m.hasNext()) {
			System.out.println(m.next());
		}
		System.out.println();
	}

	public void takeCuba() {// Create a method to list the people who have been to Cuba
		Iterator<String> c = Cuba.iterator();

		System.out.println("people have been to Cuba");
		while (c.hasNext()) {
			System.out.println(c.next());
		}
		System.out.println();
	}

	public void takeJamaica() {// Create a method to list the people who have been to Jamaica
		Iterator<String> j = Jamaica.iterator();//

		System.out.println("people have been to Jamaica");
		while (j.hasNext()) {
			System.out.println(j.next());
		}
		System.out.println();
	}

	public void anyOfThem() {// create a method for people who have been to Mexico or Cuba or Jamaica
		HashSet<String> anyCountries = new HashSet<String>(Mexico);// Create a new HashSet to copy the Mexico value,so

		System.out.println("	people have been to Mexico or Cuba or Jamaica"); // the Mexico will not be changed.
		anyCountries.addAll(Cuba);// get people who have been to M or C
		anyCountries.addAll(Jamaica);// get people who have beEn to M or C or J
		Iterator any = anyCountries.iterator();
		while (any.hasNext()) {
			System.out.println(any.next());
		}
		System.out.println();
	}

	public void threeOfThem() {// Create a method to list the people who have been to three of the countries.
		HashSet<String> threeCountries = new HashSet<String>(Mexico);
		threeCountries.retainAll(Cuba);// get people who have been to both countries
		threeCountries.retainAll(Jamaica);// get people who have been to there countries
		Iterator three = threeCountries.iterator();

		System.out.println("people have been to Mexico and Cuba and Jamaica");
		while (three.hasNext()) {
			System.out.println(three.next());
		}
		System.out.println();
	}

	public void bothCountriesExceptOne() {// Create a method to list the people who have been to both M and C but not
											// J
		HashSet<String> mAndcNotJ = new HashSet<String>(Mexico);
		mAndcNotJ.retainAll(Cuba);// get people who have been to both M and C
		mAndcNotJ.removeAll(Jamaica);// subtract people who have been to J from the both
		Iterator m = mAndcNotJ.iterator();

		System.out.println("people have been to Mexcio and Cuba but not Jamica");
		while (m.hasNext()) {
			System.out.println(m.next());
		}
		System.out.println();

	}

	public void onlyCuba() {// Create a method to list people who only have been to cuba except the others
		HashSet<String> both = new HashSet<String>(Mexico); // create a new HashSet for getting people who have been to
															// both M and J later,and copy the value of M
		HashSet<String> onlycuba = new HashSet<String>(Cuba);// Creat a new HashSet for getting people who only have
																// been to Cuba later
		both.addAll(Jamaica);// to get people who have been to both M and J
		onlycuba.removeAll(both);// subtract people who have been to both countries from people who have been to
									// Cuba
		Iterator only = onlycuba.iterator();

		System.out.println("people have been to only Cuba");
		while (only.hasNext()) {
			System.out.println(only.next());

		}
		System.out.println();
	}

}
