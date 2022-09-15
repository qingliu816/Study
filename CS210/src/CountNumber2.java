
public class CountNumber2 {
	public static void sum(int count) {
		int sum = 0;
		double average;
		for (int i = 0; i <= count; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
		average = sum / count;
		System.out.println(average);

	}

	public static void main(String[] args) {
		sum(100);
	}

}
