
public class OddNumber2 {
	public static void main(String[] args) {
		int sum = 0;

		for (int N = 9; N >= 0; N = N - 2) {
			sum = sum + N;
			System.out.println(N);
		}
		System.out.println(sum);
	}

}
