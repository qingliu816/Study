/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is to represent a student advance ticket.
 */

package Ticket;

public class StudentAdvanceTicket extends Ticket {
	int predays;

	public StudentAdvanceTicket(int predays, int number) {
		super(number);
		this.predays = predays;
	}

	public double getPrice() {
		if (predays >= 10) {
			return 15;
		} else if (predays < 10 && predays > 0) {
			return 20;
		} else {
			return 50;
		}
	}

	public String toString() {
		return "number:" + this.number + ", Price:" + this.getPrice() + "(ID required)";
	}
}
