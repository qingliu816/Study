package ReturnStatement;

public class ReturnStatement {
	public static void main(String args) {
		int sum = add(5, 3);
		System.out.println(sum);
	}

	public static int add(int a, int b) {
		return a + b;
	}
}