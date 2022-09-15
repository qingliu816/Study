/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is a super class to represent a ticket
 */

package Ticket;

public abstract class Ticket {
	int number;

	public Ticket(int number) {
		this.number = number;
	}

	public abstract double getPrice();

	public String toString() {
		return "number: " + this.number + ", Price: " + this.getPrice();

	}

}