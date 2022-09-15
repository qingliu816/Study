
/* 
 * CS210 chapter2 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.05.21 - Spring quarter
 *
 * This program prints sections results from a file.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Sections {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("sections.txt"));
		int section = 1;
		while (input.hasNextLine()) { // while file still has inputs.
			String line = input.nextLine(); // process one section
			int[] points = new int[5];
			for (int i = 0; i < line.length(); i++) { // all chars in a line.
				int student = i % 5; // The student id.
				int earned = 0;
				if (line.charAt(i) == 'y') { // student attended and did the problems
					earned = 3;
				} else if (line.charAt(i) == 'n') { // student attended but didn't do the problems
					earned = 2;
				}
				points[student] = Math.min(20, points[student] + earned); // get max allowed points.
			}

			double[] grades = new double[5];
			for (int i = 0; i < points.length; i++) { // how many students
				grades[i] = 100.0 * points[i] / 20.0; // calculate the grades
			}

			System.out.println("Section " + section); // Print section number
			System.out.println("Student points: " + Arrays.toString(points)); // print points
			System.out.println("Student grades: " + Arrays.toString(grades)); // print grades
			System.out.println();
			section++;
		}
	}
}
