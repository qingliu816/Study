/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.11.14 - Fall quarter
 *
 * This program is for checking  comparing two data structure when they add  get or remove date.
 */
package Assignment6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DateStructure {
	static Random rand = new Random();
	static ArrayList<Integer> myArray = new ArrayList<>();
	static LinkedList<Integer> myLinked = new LinkedList<>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String s;
		int howMany;
		while (true) {// to get a integer number
			System.out.print("input interger number:");
			s = input.next();
			try {
				howMany = Integer.parseInt(s);
				System.out.println("interger:" + howMany);
			} catch (NumberFormatException e) {
				System.out.println("input error.You typed Not an integer number");
				continue;
			}
			break;
		}
		Add(howMany);
		Get(howMany);
		Remove(howMany);
	}

	public static void Add(int howMany) {// comparing the time when they add data
		System.out.println("Add");
		double totalArrayTime = 0.0;
		double totalLinkedTime = 0.0;
		int value;

		for (int i = 0; i < howMany; i++) {
			value = rand.nextInt(100000);
			double startTime = System.currentTimeMillis();
			myArray.add(value);
			double endTime = System.currentTimeMillis();
			totalArrayTime += (endTime - startTime);

			startTime = System.currentTimeMillis();
			myLinked.add(value);
			endTime = System.currentTimeMillis();
			totalLinkedTime += (endTime - startTime);
		}
		System.out.println("arrayList:" + totalArrayTime / 1000.0 + "sec");
		System.out.println("linkedList:" + totalLinkedTime / 1000.0 + "sec");
		System.out.println("linkedList is" + " " + (totalArrayTime - totalLinkedTime) * 100 / totalArrayTime
				+ "% faster than arrayList");

	}

	public static void Get(int howMany) {// comparing the time when they get value
		System.out.println("Get");
		double totalArrayTime = 0.0;
		double totalLinkedTime = 0.0;
		int value;
		int index;
		for (int i = 0; i < howMany; i++) {
			value = rand.nextInt(100000);
			double startTime = System.currentTimeMillis();
			index = myArray.indexOf(value);
			if (index >= 0) {// when we can find the data in the arrayList

				myArray.get(index);
				double endTime = System.currentTimeMillis();
				totalArrayTime += (endTime - startTime);
			}
			startTime = System.currentTimeMillis();
			index = myLinked.indexOf(value);
			if (index >= 0) {

				myLinked.get(index);
				double endTime = System.currentTimeMillis();
				totalLinkedTime += (endTime - startTime);
			}
		}
		System.out.println("arrayList:" + totalArrayTime / 1000.0 + "sec");
		System.out.println("linkedList:" + totalLinkedTime / 1000.0 + "sec");
		System.out.println("arrayList is" + " " + (totalLinkedTime - totalArrayTime) * 100 / totalLinkedTime
				+ "% faster than linkedList");

	}

	public static void Remove(int howMany) {// comparing the time when they remove the data
		System.out.println("Remove");
		double totalArrayTime = 0.0;
		double totalLinkedTime = 0.0;
		int value;
		int index;
		for (int i = 0; i < howMany; i++) {
			value = rand.nextInt(100000);
			double startTime = System.currentTimeMillis();
			index = myArray.indexOf(value);
			if (index >= 0) {// when we can find the data in the arrayList

				myArray.remove(index);

				double endTime = System.currentTimeMillis();
				totalArrayTime += (endTime - startTime);
			}

			startTime = System.currentTimeMillis();
			index = myLinked.indexOf(value);
			if (index >= 0) {// when we can find the data in the linkList

				myLinked.remove(index);
				double endTime = System.currentTimeMillis();
				totalLinkedTime += (endTime - startTime);
			}
		}
		System.out.println("arrayList:" + totalArrayTime / 1000.0 + "sec");
		System.out.println("linkedList:" + totalLinkedTime / 1000.0 + "sec");
		System.out.println("arrayList is" + " " + (totalLinkedTime - totalArrayTime) * 100 / totalLinkedTime
				+ "% faster than linkedList");
	}

}
