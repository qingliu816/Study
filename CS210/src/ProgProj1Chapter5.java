
/* 
 * CS210 Chapter5 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.10- Spring quarter
 *
 * This program is to convert each line into "pig Latin"
 */
import java.util.Scanner;

public class ProgProj1Chapter5 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please input a message:");

		String s = console.nextLine();
		while (s.length() != 0) {// Terminate the program when the user type a blank line
			convert(s);
			System.out.println();
			s = console.nextLine();
		}
	}

	public static void convert(String s) {
		int startIndex = 0;

		for (int endIndex = 1; endIndex <= s.length(); endIndex++) {

			if (endIndex == s.length() || s.charAt(endIndex) == ' ') {// find out each token
				String word = s.substring(startIndex, endIndex);
				convertWord(word);
				startIndex = endIndex + 1;// find out the next word
			}

		}

	}

	private static void convertWord(String word) {
		int i = 0;
		while (i < word.length() && word.charAt(i) != 'a' && word.charAt(i) != 'A' && word.charAt(i) != 'e'
				&& word.charAt(i) != 'E' && word.charAt(i) != 'i' && word.charAt(i) != 'I' && word.charAt(i) != 'o'
				&& word.charAt(i) != 'O' && word.charAt(i) != 'u' && word.charAt(i) != 'U') {
			i++;
		} // find the index of first vowel

		String subword = word.substring(0, i);// characters before the fist vowel
		System.out.print(word.substring(i) + "-" + subword + "ay ");
	}

}
