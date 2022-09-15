/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.9.21 - Fall quarter
 *
 * This program is to test the newRandom class which have some method can get random number or char.
 */
public class mainProgram {
	public static void main(String[] args) {
		NewRandom rand = new NewRandom();
		System.out.println();
		System.out.println("nextInt(10):");
		for (int i = 0; i < 5; i++) {

			System.out.println(rand.nextInt(10));
		}
		System.out.println();
		System.out.println("nextInt(20,30):");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextInt(20, 30));
		}
		System.out.println();
		System.out.println("nextEven():");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextEven());
		}
		System.out.println();
		System.out.println("nextEven(20,30):");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextEven(20, 30));
		}
		System.out.println();
		System.out.println("nextEven(30):");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextEven(30));
		}
		System.out.println();
		System.out.println("nextOdd():");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextOdd());
		}
		System.out.println();
		System.out.println("nextOdd(20,30):");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextOdd(20, 30));
		}
		System.out.println();
		System.out.println("nextOdd(30):");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextOdd(30));
		}

		System.out.println();
		System.out.println("nextCh():");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextCh());
		}
		System.out.println();
		System.out.println("nextChar('A','C'):");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextChar('A', 'C'));

		}
		System.out.println();
		System.out.println("nextNegativeNumber():");
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextNegativeNumber());
		}
	}

}
