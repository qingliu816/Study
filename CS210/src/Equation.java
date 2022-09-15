/* 
 * CS210 Chapter2 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.16 - Spring quarter
 *
 * This program is to find a position of a body in linear motion.
 */
public class Equation {
	public static void main(String[] args) {
		double s0 = 12;
		double v0 = 3.5;
		double t = 10;
		double a = 9.8;
		double s; // the position
		s = s0 + v0 * t + (1.0 / 2) * a * t * t;
		System.out.println(s);
	}
}