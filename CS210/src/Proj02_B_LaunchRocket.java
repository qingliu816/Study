
/* 
 * CS210 Chapter2 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.21 - Spring quarter
 *
 * This program is prints a launch rocket.
 */
import java.util.concurrent.TimeUnit;

public class Proj02_B_LaunchRocket {
	private static final int COUNT = 3;

	public static void main(String[] args) throws InterruptedException {

		for (int i = 10; i >= 1; i--) {// The loop to count down
			System.out.println(i);
			TimeUnit.MILLISECONDS.sleep(700);// this delays the println
		}

		System.out.println(" BLAST OFF!!");

		for (int i = 0; i < COUNT; i++) {
			String prefix = "";
			for (int j = 0; j < 12 * i; j++) {
				prefix += " ";
			} // rocket will be shifted to the right by 12 spaces
			TimeUnit.MILLISECONDS.sleep(1000);// this delays the println
			System.out.println(prefix + "    /\\  ");
			System.out.println(prefix + "   /  \\ ");
			System.out.println(prefix + "  +----+");
			System.out.println(prefix + "  | CS |");
			System.out.println(prefix + " /|    |\\");
			System.out.println(prefix + "/_+----+_\\");
			System.out.println(prefix + "    /\\  ");
			System.out.println(prefix + "   /__\\ ");
			TimeUnit.MILLISECONDS.sleep(500);// this delays the println
			System.out.println(prefix + "  (    )");
			System.out.println(prefix + "   **** ");
			System.out.println(prefix + "    **");
			System.out.println(prefix + "    **");
			System.out.println(prefix + "    **");// print the rocket

			// code to launch the rocket.
			for (int k = 0; k < 20; k++) {
				TimeUnit.MILLISECONDS.sleep(50);// this delays the println
				System.out.println();
			}
		}
	}
}
