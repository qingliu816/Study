/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is a sub class for store in China to create a menu
 */

package Burger211;

import MyGUI.MenuGUI;

class China extends Burger211 {
	double exchangeRate = 6.9;

	public void printMenu(String address) {
		price();
		String b1Info = burgername1 + " / " + "$" + price1 + " / " + burgercal1 + "Kcal";
		String b2Info = burgername2 + " / " + "$" + price2 + " / " + burgercal2 + "Kcal";
		String b3Info = burgername3 + " / " + "$" + price3 + " / " + burgercal3 + "Kcal";

		System.out.println("Burger 211 -" + address);
		System.out.println(ad);
		System.out.println();
		System.out.printf(b1Info);
		System.out.println(burgertopping1);
		System.out.println();
		System.out.printf(b2Info);
		System.out.println(burgertopping2);
		System.out.println();
		System.out.printf(b3Info);
		System.out.println(burgertopping3);
		new MenuGUI(address, b1Info, burgertopping1, b2Info, burgertopping2, b3Info, burgertopping3, ad);

	}

	public void ad() {
		ad = "^^Double 11/11 sales^^";// create for sales
	}

	public void price() {
		super.price();// when the method overriding,the behavior in this this method have to
						// renew,have to reset the value
		price1 = price1 * exchangeRate;
		price2 = price2 * exchangeRate;
		price3 = price3 * exchangeRate;// for different currency
	}

	public void topping() {
		super.topping();
		burgertopping3 = "beef breast,ranch sause";
	}

}
