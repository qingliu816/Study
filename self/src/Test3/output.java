package Test3;

public class output {
	static void A(int n) {
		if (n > 0)

		{
			A(n - 1);
			A(n - 2);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		int x = 5;
		A(x);
	}

}
