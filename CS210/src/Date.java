
public class Date {
	static int date;
	static int month;

	public static String nextDay() {
		date++;
		if (date > dayInMonth(month)) {
			date = 1;
			month++;
		}
		if (getMonth() > 12) {
			month = 1;
		}
		return month + "/" + date;
	}
}
