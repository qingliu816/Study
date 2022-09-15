/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.17 - Fall quarter
 *
 * This program is for get a random word and shuffle
 */
package Assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class word211 {

	public HashMap<String, String> description = new HashMap<String, String>();// to store the fruit name and the
																				// nutrition information
	ArrayList<String> fruitname = new ArrayList<String>();// to store the fruit name

	public void read(String file) throws FileNotFoundException {
		Scanner input = new Scanner(new File(file));
		String fruit;
		String information;

		while (input.hasNext()) {
			fruit = input.next();
			information = input.nextLine();
			fruitname.add(fruit);
			description.put(fruit, information);

		}
	}

	public String randomFruitname() {// create a method which can get a random fruit name
		newRandom a = new newRandom();
		return fruitname.get(a.nextInt(fruitname.size()));// to get a random fruit name
	}

	public HashMap<String, String> checkName() {// create a method to check the fruit names are matches
		String question;// get key
		String answer = randomFruitname();// initial a random fruit name
		List<String> qtemp = Arrays.asList(answer.split(""));
		Collections.shuffle(qtemp);// shuffle word
		question = String.join("", qtemp); // initial the shuffle word to question
		HashMap<String, String> check = new HashMap<String, String>();// to store the fruit name and shuffle fruit word
		check.put(question, answer);
		return check;
	}
}
