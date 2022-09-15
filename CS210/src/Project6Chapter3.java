/* 
 * CS210 Chapter3 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.27 - Spring quarter
 *
 * This program that produces calendars as output .
 */
public class Project6Chapter3 {
	public static void main(String[] args) {
		printCalendar(31, 6);
	}

	private static void printCalendar(int days, int firstDay) {
		printTitle(); // print Week day name
		printCutline(); // print calendar top
		printContent(days, firstDay); // print calendar detail
		printCutline(); // print calendar buttom
	}

	private static void printContent(int days, int firstDay) {
		int firstBlankDays = (8 - firstDay) % 7; // How may empty days before 1st
		int weeks = (firstBlankDays + days + 6) / 7; // How may weeks in the calendar

		for (int i = 0; i < weeks; i++) {
			for (int j = 1; j <= 7; j++) { // Print 7 days in 1 week.
				if (i * 7 + j <= firstBlankDays) { // if it's before the 1st day of the month
					System.out.print("|      ");
				} else if (i * 7 + j - firstBlankDays > days) { // if after the last day of the month
					System.out.print("|      ");
				} else {
					System.out.print("|" + padded(i * 7 + j - firstBlankDays, 4) + "  ");
				}
			}
			System.out.println("|");
		}
	}

	private static void printCutline() {
		for (int i = 1; i <= 7; i++) {
			System.out.print("+------");
		}

		System.out.println("+");
	}

	private static void printTitle() {
		System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
	}

	public static String padded(int n, int width) {
		String s = "" + n;
		for (int i = s.length(); i < width; i++) {
			s = " " + s;
		}
		return s;
	}
}
