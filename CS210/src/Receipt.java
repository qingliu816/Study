
/* 
 * CS210 Chapter4 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.4.30 - Spring quarter
 *
 * This program is to 
 */
import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double subtotal = meals(console);
		results(subtotal);
	}

	public static double meals(Scanner console) {
		System.out.print("How many people ate?");
		int people = console.nextInt();
		double subtotal = 0.0;
		for (int i = 1; i <= people; i++) {
			System.out.print("Person #" + i + ": How much did your dinner cost?");
			double personCost = console.nextDouble();
			subtotal = subtotal + personCost;
		}
		return subtotal;
	}

	public static void results(double subtotal) {
		double tax = subtotal * .08;
		double tip = subtotal * .15;
		double total = subtotal + tax + tip;
		System.out.printf("Subtotal:   $%.2f\n", subtotal);
		System.out.printf("Tax:        $%.2f\n", tax);
		System.out.printf("Tip:        $%.2f\n", tip);
		System.out.printf("Total:      $%.2f\n", total);
	}

}
