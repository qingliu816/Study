
/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.9.18 - Fall quarter
 *
 * This program is to read a file and print the student list base on gender.
 */
// reading a file + arrayList + class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class person2 {
	String id;
	String name;
	String gender;
	int age;

	person2(String id, String name, String gender, int age) { // I Create a new constructor
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
}

public class arrayList4 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("student.txt"));
		ArrayList<person2> studentList = new ArrayList<person2>();
		while (input.hasNextLine()) {
			// create person.
			person2 p = new person2(input.next(), input.next(), input.next(), input.nextInt());

			// add person to array.
			studentList.add(p);
		}

		System.out.println("== Female Student List ==");
		for (int i = 0; i < studentList.size(); i++) {
			person2 p = studentList.get(i);
			if (p.gender.equals("f")) {
				// if person gender is female, print the person.
				System.out.printf("%s %s %s %d\n", p.id, p.name, p.gender, p.age);
			}
		}
		System.out.println("== Male Student List ==");
		for (int i = 0; i < studentList.size(); i++) {
			person2 p = studentList.get(i);
			if (p.gender.equals("m")) {
				// if person gener is male, print the person.
				System.out.printf("%s %s %s %d\n", p.id, p.name, p.gender, p.age);
			}
		}
	}
}
