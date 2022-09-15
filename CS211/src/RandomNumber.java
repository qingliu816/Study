import java.util.Random;

class newRandom extends Random {
	public char nextCh() {

		int n = nextInt(26) + 'A';
		return (char) n;
	}

	public int nextInt(int low, int high) {

		int n = nextInt(high - low) + low;
		return n;

	}

	public int nextEven2() {
		int n = nextInt();
		if (n % 2 == 1) {
			n = n - 1;

		}
		return n;
	}

	public int nextEven() {
		int n = nextInt() * 2;// more simply way
		return n;

	}

	public int nextOdd2() {
		int n = nextInt();
		if (n % 2 == 0) {
			n = n + 1;
		}
		return n;
	}

	public int nextOdd() {
		int n = nextInt() * 2 + 1;// more simply way
		return n;
	}

	public int nextEven(int low, int high) {
		int n = nextInt(high - low) + low - 1;
		if (n % 2 == 1) {
			n = n + 1;
		}
		return n;
	}

	public int nextOdd(int low, int high) {
		int n = nextInt(high - low) + low - 1;
		if (n % 2 == 0) {
			n = n + 1;
		}
		return n;
	}

	public char nextChar(char low, char high) {
		int n = nextInt(high - low) + low;
		return (char) n;
	}

	public int nextNegativeNumber() {
		int n = nextInt();
		if (n > 0) {
			n = -1 * n;

		}
		return n;
	}
}

public class RandomNumber {

	public static void main(String[] args) {
		newRandom rand = new newRandom();
		System.out.println(rand.nextCh());
		System.out.println(rand.nextInt(3, 9));
		System.out.println(rand.nextEven());
		System.out.println(rand.nextOdd());
		System.out.println(rand.nextEven(2, 10));
		System.out.println(rand.nextOdd(2, 10));
		System.out.println(rand.nextChar('A', 'Z'));
		System.out.println(rand.nextNegativeNumber());
	}

}
