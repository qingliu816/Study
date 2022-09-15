/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.10.05 - Fall quarter
 *
 * This program is to represent a advance   ticket
 */

package Ticket;

public class AdvanceTicket extends Ticket {
	int predays;

	public AdvanceTicket(int predays, int number) {
		super(number);
		this.predays = predays;

	}

	public double getPrice() {
		if (predays >= 10) {
			return 30;
		} else if (predays > 0 && predays < 10) {
			return 40;

		} else {
			return 50;// for the day of the event
		}
	}

}
