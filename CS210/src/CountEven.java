
public class CountEven {
	public static void countEven(int N) {
		int sum = 0;
		if (N % 2 == 1) {
			N = N - 1;
		}
		for (; N >= 0; N = N - 2) {
			sum = sum + N;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		countEven(100);

	}
}