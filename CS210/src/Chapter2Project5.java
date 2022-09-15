
public class Chapter2Project5 {
	private static final int SIZE = 5;

	public static void main(String[] args) {
		for (int i = 1; i <= SIZE; i++) {

			for (int j = 1; j <= (SIZE - i) * 5; j++) {
				System.out.print(" ");
			}
			System.out.print(" o  ******");
			for (int j = 1; j <= (i - 1) * 5; j++) {
				System.out.print(" ");
			}
			System.out.println("*");

			for (int j = 0; j < (SIZE - i) * 5; j++) {
				System.out.print(" ");
			}
			System.out.print("/|\\ *     ");
			for (int j = 0; j < (i - 1) * 5; j++) {
				System.out.print(" ");
			}
			System.out.println("*");

			for (int j = 0; j < (SIZE - i) * 5; j++) {
				System.out.print(" ");
			}
			System.out.print("/ \\ *     ");
			for (int j = 0; j < (i - 1) * 5; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for (int i = 1; i <= 5 * SIZE + 6; i++) {
			System.out.print("*");
		}
	}

}
