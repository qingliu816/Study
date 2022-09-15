/* 
 * CS210 Chapter2 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.16 - Spring quarter
 *
 * This program is prints a repeated parts of the figure 
 */
public class Window {
	public static final int SUB_HEIGHT = 4;

	public static void main(String[] args) {
		drawLine(); // Top of the window
		drawMiddle();
		drawLine();// Middle of the window
		drawMiddle();
		drawLine();// Bottom of the widow
	}

	public static void drawLine() {
		System.out.print("+");
		drawSubLine();
		System.out.print("+");
		drawSubLine();
		System.out.println("+");
	}

	public static void drawSubLine() {
		for (int i = 1; i <= SUB_HEIGHT; i++) { // Width of the quarter of the window
			System.out.print("=");
		}
	}

	public static void drawMiddle() {
		for (int i = 1; i <= SUB_HEIGHT; i++) {// Height of the half of the window
			drawSubMiddle();
		}
	}

	public static void drawSubMiddle() {

		System.out.print("|");
		drawSpace();
		System.out.print("|");
		drawSpace();
		System.out.println("|");
	}

	public static void drawSpace() {
		for (int i = 1; i <= SUB_HEIGHT; i++) {
			System.out.print(" ");
		}
	}

}
