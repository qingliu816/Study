/* 
 * CS210 Chapter4 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.2 - Spring quarter
 *
 * This program is to get grade.
 */
public class Exercise15Chapter4 {

	public static void main(String[] args) {
		getGrade(90);

	}

	public static double getGrade(int score) {
		if (score < 0 || score > 100) {// score out of range
			throw new IllegalArgumentException();
		} else if (score < 60) {// score small than 60
			return 0.0;
		} else if (score == 60 || score == 61 || score == 62) {
			return 0.7;
		} else if (score >= 95) {
			return 4.0;
		} else {// score between 63 an 94
			return (score - 63) / 10.0 + 0.8;
		}
	}
}
