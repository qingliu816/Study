
/* 
 * CS210 Chapter4 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.3 - Spring quarter
 *
 * This program that produces a Caesar cipher of a given message string.
 */
import java.util.Scanner;

public class ProgProj8Chapter4 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Your message?");
		String message = console.nextLine();// get the message
		System.out.print("Encoding key?");
		int number = console.nextInt();// get the encoding key
		System.out.print("Your message:");
		Rotating(number, message.toLowerCase());
	}

	public static void Rotating(int number, String message) {
		for (int i = 0; i < message.length(); i++) {// get every single char
			char ch = message.charAt(i);
			if (ch == ' ') {
				System.out.print(' ');
			} else {
				System.out.print((char) ((ch - 'a' + number) % 26 + 'A'));// rotating every single char
			}
		}
	}
}