import java.util.Scanner;

public class Chapter4Project3 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		double gpa1 = getScore(console, "first", "GPA");
		double sat1 = getScore(console, "first", "SAT");
		double act1 = getScore(console, "first", "ACT");
		double gpa2 = getScore(console, "second", "GPA");
		double sat2 = getScore(console, "second", "SAT");
		double act2 = getScore(console, "second", "ACT");

		int score1=0;
		int score2=0;
		if(gpa1>gpa2) {
			score1++;
		}else if (gpa2>gpa1) {
			score2++;
		}
		
		if (act)
	}

	private static double getScore(Scanner console, String number, String scoreName) {
		System.out.print("Please entery " + number + " student " + scoreName + ":");
		return console.nextDouble();
	}

}
