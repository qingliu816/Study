
public class ASCII {

	public static void main(String[] args) {
		drawLine();
		topHalf();
		bottomHalf();
		drawLine();

	}

	public static void drawLine() {
		System.out.print("#");
		for (int i = 1; i <= 16; i++) {
			System.out.print("=");

		}
		System.out.println("#");

	}

	public static void topHalf() {
		for (int line = 1; line <= 4; line++) {
			System.out.print("|");
			for (int j = 1; j <= -2 * line + 8; j++) {
				System.out.print(" ");

			}
			System.out.print("<>");
			for (int k = 1; k <= 4 * line - 4; k++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int m = 1; m <= -2 * line + 8; m++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}

	public static void bottomHalf() {
		for (int line = 1; line <= 4; line++) {
			System.out.print("|");
			for (int j = 1; j <= (2 * line - 2); j++) {
				System.out.print(" ");

			}
			System.out.print("<>");
			for (int k = 1; k <= -4 * line + 16; k++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int m = 1; m <= 2 * line - 2; m++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}

	}

}
