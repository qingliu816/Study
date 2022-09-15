
public class Output {
	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i + i;
			sum2 = i * i;

			System.out.println(i + "+" + i + "=" + sum + " " + i + "X" + i + "=" + sum2);
		}
	}

}
