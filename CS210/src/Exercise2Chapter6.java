
/* 
 * CS210 chapter6 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.05.15 - Spring quarter
 *
 * This program to accepts a Scanner reading input from a file and report various statistics about the integers to the console.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2Chapter6 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("numbers.txt"));// creat scanner to read number from file
		evenNumbers(input);
	}

	private static void evenNumbers(Scanner input) {
		int count = 0;
		int sum = 0;
		int evenCount = 0;
		while (input.hasNext()) {// while file still have numbers
			int num = input.nextInt();// read the number
			count++;
			sum += num;
			if (num % 2 == 0) {// whether num is a ever number
				evenCount++;
			}
		}

		System.out.printf("%d numbers, sum = %d\n", count, sum);
		System.out.printf("%d evens (%.2f%%)", evenCount, evenCount * 100.0 / count);// print the even number percentage

	}
}
