package Burger211;

/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is a sub class for USA to create burger menu 
 */

import MyGUI.MenuGUI;

class USA extends Burger211 {
	public void printMenu(String address) {
		price();
		String b1Info = burgername1 + " / " + "$" + price1 + " / " + burgercal1 + "Kcal";
		String b2Info = burgername2 + " / " + "$" + price2 + " / " + burgercal2 + "Kcal";
		String b3Info = burgername3 + " / " + "$" + price3 + " / " + burgercal3 + "Kcal";

		System.out.println("Burger 211 -" + address);
		System.out.println(ad);
		System.out.println();
		System.out.printf("%s $%.2f/%d\n", burgername1, price1, burgercal1);
		System.out.println(burgertopping1);
		System.out.println();
		System.out.printf("%s $%.2f/%d\n", burgername2, price2, burgercal2);
		System.out.println(burgertopping2);
		System.out.println();
		System.out.printf("%s $%.2f/%d\n", burgername3, price3, burgercal3);
		System.out.println(burgertopping3);
		new MenuGUI(address, b1Info, burgertopping1, b2Info, burgertopping2, b3Info, burgertopping3, ad);

	}

	public void ad() {
		ad = "^^Christmas sales^^";
	}
}
