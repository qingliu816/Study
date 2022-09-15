
/* 
 * CS210 Chapter8 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.6.2 - Spring quarter
 *
 * This class is to do operations for students.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyStudent {
	private String id;
	private String name;
	private String gender;
	private double age;
	private MyStudent[] student = new MyStudent[100];

	// get id
	public String getId() {
		return id;
	}

	// get name
	public String getName() {
		return name;
	}

	// get gender
	public String getGender() {
		return gender;
	}

	// get age
	public double getAge() {
		return age;
	}

	// constructor with 4 fields
	public void student(String id, String name, String gender, double age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	// read student data from file
	public void readData(String fileName) throws FileNotFoundException {
		Scanner input = new Scanner(new File(fileName)); // create scanner
		int i = 0;
		while (input.hasNext()) { // while still have input
			String line = input.nextLine(); // read a line
			Scanner stringScanner = new Scanner(line);
			String id = stringScanner.next(); // read id
			String name = stringScanner.next(); // read name
			String gender = stringScanner.next(); // read gender
			double age = stringScanner.nextDouble(); // read age
			MyStudent s = new MyStudent();
			s.student(id, name, gender, age); // create student.
			student[i++] = s; // add student to array.
		}

		System.out.println("File loaded successfully!"); // print load success.
	}

	// how many student in a specific gender
	public int howMany(String gender) {
		int total = 0; // total count.
		for (int i = 0; i < 100; i++) { // how many elements in the array.
			if (student[i] != null && student[i].getGender().equals(gender)) {
				// if student exist and gender matches
				total++; // add count;
			}
		}

		return total; // return count.
	}

	// Return all the students with specific gender
	public String[] studentList(String gender) {
		String[] result = new String[howMany(gender)]; // create array.
		int j = 0;
		for (int i = 0; i < 100; i++) { // how many elements in the array.
			if (student[i] != null && student[i].getGender().equals(gender)) {
				// if has student and gender matches
				result[j++] = student[i].getName(); // add student name.
			}
		}

		return result; // return student names.
	}

	// return student with age bigger than value.
	public String[] age(int value) {
		int total = 0; // age bigger than value count.
		for (int i = 0; i < 100; i++) { // how many elements in the array.
			if (student[i] != null && student[i].getAge() > value) {
				// If student exists and age is bigger than value.
				total++; // add count.
			}
		}

		String[] result = new String[total]; // create result
		int j = 0;
		for (int i = 0; i < 100; i++) {// how many elements in the array.
			if (student[i] != null && student[i].getAge() > value) {
				// If student exists and age is bigger than value.
				result[j++] = student[i].getName(); // add student name.
			}
		}

		return result; // return all the students
	}

	// return the average age for a specific student.
	public double avgAge(String gender) {
		double total = 0; // total age
		int count = 0; // total count
		for (int i = 0; i < 100; i++) {// how many elements in the array.
			if (student[i] != null && student[i].getGender().equals(gender)) {
				// If student exists and gender matches
				total += student[i].getAge(); // add age to the total.
				count++; // add count.
			}
		}

		return total / count; // return average.
	}
}
