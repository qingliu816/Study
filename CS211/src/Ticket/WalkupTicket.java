/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is to represent a walk up event ticket
 */

package Ticket;

public class WalkupTicket extends Ticket {

	public WalkupTicket(int number) {
		super(number);// the super class has parameter

	}

	public double getPrice() {
		return 50;

	}

}
