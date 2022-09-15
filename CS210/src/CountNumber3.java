
public class CountNumber3 {
	public static void sum(int M, int N) {
		int sum = M;
		for (int i = M; i <= N; i++) {
			sum = sum + i;

		}
		System.out.println(sum);

	}

	public static void main(String[] arg) {
		sum(5, 15);
	}

}
