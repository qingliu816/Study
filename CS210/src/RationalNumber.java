/* 
 * CS210 Chapter8 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.30 - Spring quarter
 *
 * This program is to write a class represent rational number.
 */
public class RationalNumber {
	private int numerator;
	private int denominator;

	// constructs a new rational number with the given numerator and denominator
	public RationalNumber(int numerator, int denominator) {
		if (denominator == 0) { // if denominator is zero
			throw new IllegalArgumentException(); // throw exception
		}

		if (numerator > 0 && denominator < 0) { // avoid the case of 2/-3
			numerator = -numerator;
			denominator = -denominator;
		}

		this.numerator = numerator;
		this.denominator = denominator;
	}

	// constructs a new rational number 0/1.
	public RationalNumber() {
		this(0, 1);
	}

	// gets the denominator
	public int getDenominator() {
		return denominator;
	}

	// gets the numerator
	public int getNumerator() {
		return numerator;
	}

	// returns a String representation of rational number.
	public String toString() {
		if (denominator == 1) { // if denominator is 1
			return Integer.toString(numerator); // return string with numerator only.
		} else { // if denominator is not 1
			return Integer.toString(numerator) + "/" + denominator;
		}
	}
}
