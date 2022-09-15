package Assignment4;

/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.17 - Fall quarter
 *
 * This program is for get a  random number
 */

import java.util.Random;

public class newRandom extends Random {

	public int nextInt(int low, int high) {// get a random number in a certain range
		int n = nextInt(high - low) + low;
		return n;
	}

	public int nextEven() {// get a even number
		int n = nextInt();
		if (n % 2 == 1) {
			n = n + 1;
		}
		return n;
	}

	public int nextEven(int max) {// get a even number from 0 to max
		int n = nextInt(max);
		if (n % 2 == 1) {
			n = n - 1;

		}
		return n;
	}

	public int nextEven(int low, int high) {// get a even number in a certain range
		int n = nextInt(high - low) + low - 1;// subtract 1 is to make sure the number will not exceed the range.
		if (n % 2 == 1) {
			n++;
		}
		return n;
	}

	public int nextOdd() {// get a odd number
		int n = nextInt();
		if (n % 2 == 0) {
			n = n + 1;

		}
		return n;
	}

	public int nextOdd(int max) {// get a odd number from 0 to max
		int n = nextInt(max) - 1;
		if (n % 2 == 0) {
			n = n + 1;
		}
		return n;
	}

	public int nextOdd(int low, int high) { // get a odd number in a certain range
		int n = nextInt(high - low) + low - 1;// subtract 1 is to make sure the number will not exceed the range.
		if (n % 2 == 0) {
			n++;
		}
		return n;
	}

	public char nextCh() { // get a random char
		int n = nextInt(26) + 'A';
		return (char) n;
	}

	public char nextChar(char low, char high) {// get a random char in a certain range
		int n = nextInt(high - low) + low;
		return (char) n;
	}

	public int nextNegativeNumber() {// to get a random negative number
		int n = nextInt();
		if (n > 0) {
			n = -1 * n;
		}
		return n;
	}

}
