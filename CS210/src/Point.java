/* 
 * CS210 Chapter8 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.29 - Spring quarter
 *
 * This program is to add isCollinear in point class.
 */
public class Point {
	private int x;
	private int y;

	public boolean isCollinear(Point p1, Point p2) {
		if (p1.x == x && p1.x == p2.x) {
			// if they have same x-coordinate
			return true;
		}

		int slope1 = getSlope(this, p1); // get slope for it's self an p1.
		int slope2 = getSlope(this, p2); // get slope for it's self an p2.
		int slope3 = getSlope(p1, p2); // get slope for p1 an p2.
		return slope1 == slope2 && slope2 == slope3; // return true if all slopes are the same
	}

	private int getSlope(Point p1, Point p2) {
		if (p1.x == p2.x) { // if p1 x-coordinate is same as p2
			return Integer.MAX_VALUE; // return max slope.
		}

		// return slope with 4 digit past the decimal point accuracy
		return (p1.y - p2.y) * 10000 / (p1.x - p2.x);
	}
}
