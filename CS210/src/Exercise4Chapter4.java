/* 
 * CS210 Chapter4 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.30 - Spring quarter
 *
 * This program is to return the number of days in that month in this year.
 */
public class Exercise4Chapter4 {

	public static void main(String[] args) {
		daysInMonth(9);// call the method
	}

	public static int daysInMonth(int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;// January March May July August October December have 31days
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;// April June September November have30 days
		} else if (month == 2) {
			return 28;// February has 28 days
		} else {
			throw new IllegalArgumentException("month must between 1 to 12");// input parameter is out of range
		}
	}
}
