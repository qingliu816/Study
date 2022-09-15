
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

class person {
	String id;
	String name;
	String gender;
	int age;
}

public class arrayList3 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("student.txt"));
		ArrayList<person> studentList = new ArrayList<person>();
		while (input.hasNextLine()) {
			String line = input.nextLine();
			// create scanner for one line.
			Scanner lineScanner = new Scanner(line);
			// create person.
			person p = new person();
			p.id = lineScanner.next();
			p.name = lineScanner.next();
			p.gender = lineScanner.next();
			p.age = lineScanner.nextInt();
			// add person to array.
			studentList.add(p);
		}

		System.out.println("== Female Student List ==");
		for (int i = 0; i < studentList.size(); i++) {
			person p = studentList.get(i);
			if (p.gender.equals("f")) {
				// if person gender is female, print the person.
				System.out.printf("%s %s %s %d\n", p.id, p.name, p.gender, p.age);
			}
		}
		System.out.println("== Male Student List ==");
		for (int i = 0; i < studentList.size(); i++) {
			person p = studentList.get(i);
			if (p.gender.equals("m")) {
				// if person gener is male, print the person.
				System.out.printf("%s %s %s %d\n", p.id, p.name, p.gender, p.age);
			}
		}
	}
}
