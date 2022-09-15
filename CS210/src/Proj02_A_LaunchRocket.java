
/* 
 * CS210 Chapter2 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.21 - Spring quarter
 *
 * This program is prints a launch rocket.
 */
import java.util.concurrent.TimeUnit;

public class Proj02_A_LaunchRocket {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Count Down Initiated");

		for (int i = 10; i >= 1; i--) {// the loop to count down
			System.out.println(i);
			TimeUnit.MILLISECONDS.sleep(700);// this delays the println
		}

		System.out.println(" BLAST OFF!!");
		TimeUnit.MILLISECONDS.sleep(1000);// this delays the println

		System.out.println("    /\\  ");
		System.out.println("   /  \\ ");
		System.out.println("  +----+");
		System.out.println("  | CS |");
		System.out.println(" /|    |\\");
		System.out.println("/_+----+_\\");
		System.out.println("    /\\  ");
		System.out.println("   /__\\ ");
		TimeUnit.MILLISECONDS.sleep(500);// this delays the println
		System.out.println("  (    )");
		System.out.println("   (  ) ");
		System.out.println("    ()");
		System.out.println("    ()");
		System.out.println("    ()");// print the rocket

		// code to launch the rocket.
		for (int i = 0; i < 20; i++) {
			TimeUnit.MILLISECONDS.sleep(50);// this delays the println
			System.out.println();
		}
	}
}
