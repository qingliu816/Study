
/* 
 * CS210 Chapter3 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.26 - Spring quarter
 *
 * This program is a interactive program that can input birthday .
 */
//for scanner
import java.util.Scanner;

public class Exercise20Chapter3 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// obtain values
		System.out.println("On what day of the month wew you born?");
		int day = console.nextInt();
		System.out.println("What is the name of the month in which you were born?");
		String month = console.next();
		System.out.println("During what year were you born?");
		int year = console.nextInt();
		// report
		System.out.println("You were born on " + month + " " + day + " " + year + ". You're mighty old");

	}

}
