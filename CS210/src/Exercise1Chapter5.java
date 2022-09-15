/* 
 * CS210 Chapter4 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.8 - Spring quarter
 *
 * This program is to shows the factors of 2 in a given integer.
 */
public class Exercise1Chapter5 {

	public static void main(String[] args) {
		showTwos(7);
		showTwos(18);
		showTwos(68);
		showTwos(120);
	}

	public static void showTwos(int num) {
		System.out.print(num + " = ");
		while (num % 2 == 0) {// loop until the number dose not have factor 2
			System.out.print("2 * ");
			num = num / 2;
		}
		System.out.println(num);//print the last factor 
	}

}
