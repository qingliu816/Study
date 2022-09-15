/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is a super class for Burger211
 */

package Burger211;

public abstract class Burger211 {
	String burgername1;
	String burgername2;
	String burgername3;
	String burgertopping1;
	String burgertopping2;
	String burgertopping3;
	int burgercal1;
	int burgercal2;
	int burgercal3;
	double price1;
	double price2;
	double price3;
	String ad;

	Burger211() {
		burgerName();
		topping();
		cal();
		price();
		ad();
	}

	public abstract void printMenu(String address);

	public void burgerName() {
		burgername1 = "inheritance Burger";
		burgername2 = "overrding Burger";
		burgername3 = "constructor Burger";
	}

	public void topping() {
		burgertopping1 = "beef patty,tomato,onion,ranch sause";
		burgertopping2 = "beef patty,lime,onion,tomatoes sause";
		burgertopping3 = "chicken breast,ranch sause";
	}

	public void cal() {
		burgercal1 = 210;
		burgercal2 = 220;
		burgercal3 = 140;
	}

	public void price() {
		price1 = 1.5;
		price2 = 2.0;
		price3 = 3.0;
	}

	public abstract void ad();

}
