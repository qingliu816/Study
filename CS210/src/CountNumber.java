
public class CountNumber {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		for (int i = 0; i <= 100; i++) {

			sum = sum + i;
		}
		average = sum / 100;
		System.out.println(sum);
		System.out.println(average);
	}

}
