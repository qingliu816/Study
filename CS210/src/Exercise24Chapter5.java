
/* 
 * CS210 Chapter5 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.8 - Spring quarter
 *
 * This program is to return whether  a string consists entirely of vowels */
public class Exercise24Chapter5 {

	public static void main(String[] args) {
		isAllVowels("eIEio");
		isAllVowels("oink");
	}

	public static boolean isAllVowels(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'A' && s.charAt(i) != 'e' && s.charAt(i) != 'E'
					&& s.charAt(i) != 'i' && s.charAt(i) != 'I' && s.charAt(i) != 'o' && s.charAt(i) != 'O'
					&& s.charAt(i) != 'u' && s.charAt(i) != 'U') {
				return false;
			}
		}
		return true;

	}
}
