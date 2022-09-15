public abstract class Ticket {
	public abstract int ticket(int number);

	public abstract double getPrice();

	public abstract String toString();

}

public class StudentAdvance extends Ticket {
	public abstract int getPrice(int advance){
		if((walkup-advance)>=10) {
			return 15;
			else {
				return 20;
	}
	
}