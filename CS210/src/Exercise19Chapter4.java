/* 
 * CS210 Chapter4 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.3 - Spring quarter
 *
 * This program is to representing a point.
 */
public class Exercise19Chapter4 {

	public static void main(String[] args) {
		quadrant(-2.3, 3.5);// call the method
		quadrant(4.5, -4.5);
	}

	public static int quadrant(double x, double y) {
		if (x > 0 && y > 0) {
			return 1;
		} else if (x < 0 && y > 0) {
			return 2;
		} else if (x < 0 && y < 0) {
			return 3;
		} else if (x > 0 && y < 0) {
			return 4;
		} else {// at least one coordinate equals to 0.The point falls on to axis.
			return 0;
		}

	}
}
