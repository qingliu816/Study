/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is for create menu in different cities
 */

package Burger211;

public class MainBurger211 {
	public static void main(String[] args) {
		Burger211 Shanghai = new China();
		Shanghai.printMenu("Shanghai");

		System.out.println();
		Burger211 Hangzhou = new China();
		Hangzhou.printMenu("Hangzhou");

		Burger211 Bellevue = new USA();
		Bellevue.printMenu("Bellevue");

		System.out.println();
		Burger211 Seattle = new USA();
		Seattle.printMenu("Seattle");
	}

}
