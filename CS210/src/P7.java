
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < (-i + 5); j++) {
				System.out.print(".");
			}

			System.out.print(i);
			for (int k = 0; k < i; k++) {
				System.out.println();

			}

		}

	}
}
