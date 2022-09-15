/* 
 * CS210 Chapter7 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.21 - Spring quarter
 *
 * This program is to calculate the range of a list.
 */
public class Exercise2Chapter7 {
	public static void main(String[] args) {
		int[] numbers = { 36, 12, 25, 19, 46, 31, 22 };
		System.out.print(range(numbers)); // print the range.
	}

	private static int range(int[] numbers) {
		int min = numbers[0];
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) { // how many element in the list
			if (numbers[i] > max) { // current element is bigger than current max.
				max = numbers[i]; // set the new max.
			}
			if (numbers[i] < min) { // current element is smaller than current min.
				min = numbers[i]; // set the new min.
			}
		}

		return max - min + 1; // return the range.
	}
}
