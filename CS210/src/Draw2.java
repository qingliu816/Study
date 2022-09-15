
public class Draw2 {
	public static final int LINES = 5;

	public static void main(String[] args) {
		for (int line = 1; line <= LINES; line++) {
			for (int i = 1; i <= LINES - line; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= 2 * line + 3; i++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
