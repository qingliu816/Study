import java.util.Scanner;

public class GangstaName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.print("type your name,playa:");
		String name = console.nextLine();
		String first = name.substring(0, name.indexOf(" "));
		String last = name.substring(name.indexOf(" ") + 1);
		last = last.toUpperCase();
		String fInitial = first.substring(0, 1);
		System.out.println("your gangsta name is\"" + fInitial + ".diddy" + last + first + "-izzle");
	}

}
