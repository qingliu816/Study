/* 
 * CS210 Chapter7 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.22 - Spring quarter
 *
 * This program is to check if array 1 contains array 2.
 */
public class Exercise14Chapter7 {
	public static void main(String[] args) {
		int[] list1 = { 1, 6, 2, 1, 4, 1, 2, 1, 8 };
		int[] list2 = { 1, 2, 1 };
		System.out.print(contains(list1, list2)); // print the result.
	}

	private static boolean contains(int[] list1, int[] list2) {
		for (int i = 0; i < list1.length; i++) { // how many element in the list 1
			boolean allMatch = true; // assume list 2 is contained in list 1.
			int j = 0;
			for (j = 0; j < list2.length && i + j < list1.length; j++) { // how many elements in list 2
				if (list1[i + j] != list2[j]) {// element in list 2 is not same as in list 1
					allMatch = false; // set is all match to false.
				}
			}

			if (allMatch && j == list2.length) { // if all matches and has scanned to the end list 2.
				return true;
			}
		}

		return false; // If list 2 has scanned to the end.
	}
}
