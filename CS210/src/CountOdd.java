
public class CountOdd {
	public static void countOdd(int N) {
		int sum = 0;
		if (N % 2 == 0) {
			N = N - 1;
		}
		for (; N >= 0; N = N - 2) {
			sum = sum + N;

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		countOdd(100);
	}
}