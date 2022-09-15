package review;

public class Cone {
	public static void main(String[] args) {
		for (int line = 1; line < 6; line++) {
			for (int i = 0; i < line; i++) {
				System.out.print(" ");
			}
			for (int j = 10; j > 2 * line - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}