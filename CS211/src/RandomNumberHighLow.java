import java.util.Random;

public class RandomNumberHighLow extends Random {
	public char nextChar(int low, int high) {
		int n;
		if (low > high) {
			if (nextInt(2) == 1) {
				n = nextInt('Z' - low) + low;
			} else
				n = nextInt(high - 'A') + 'A';
		} else {
			n = nextInt(high - low) + low;

		}
		return (char) n;

	}

	public static void main(String[] args) {
		RandomNumberHighLow ch = new RandomNumberHighLow();
		System.out.println(ch.nextChar('F', 'B'));
	}
}