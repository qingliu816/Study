package Ticket;

public class myTicket {

	public static void main(String[] args) {
		Ticket w = new WalkupTicket(15);
		System.out.println(w);
		Ticket a = new AdvanceTicket(15, 15);
		System.out.println(a);
		Ticket a2 = new AdvanceTicket(8, 15);
		System.out.println(a2);
		Ticket a3 = new AdvanceTicket(0, 15);
		System.out.println(a3);
		Ticket s = new StudentAdvanceTicket(12, 15);
		System.out.println(s);
		Ticket s2 = new StudentAdvanceTicket(5, 5);
		System.out.println(s2);
		Ticket s3 = new StudentAdvanceTicket(0, 5);
		System.out.println(s3);

	}

}
