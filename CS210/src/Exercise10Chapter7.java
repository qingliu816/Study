/* 
 * CS210 Chapter7 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.21 - Spring quarter
 *
 * This program is to calculate the event number percentage in a list.
 */
public class Exercise10Chapter7 {
	public static void main(String[] args) {
		int[] numbers = { 6, 2, 9, 11, 3 };
		System.out.print(percentEven(numbers)); // print the percentage.
	}

	private static double percentEven(int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) { // how many element in the list
			if (numbers[i] % 2 == 0) { // current element is a even number.
				count++; // Add the even count.
			}
		}

		if (count == 0) { // if there is no even number.
			return 0.0;
		} else { // if there are even numbers.
			return count * 100.0 / numbers.length; // return the percentage.
		}
	}
}
