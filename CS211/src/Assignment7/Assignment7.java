/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.11.8 - Fall quarter
 *
 * This program is to simulate add remove node in the min heap.
 */
package Assignment7;

import java.util.Random;

public class Assignment7 {

	public static void main(String[] args) {
		Random random = new Random();
		MinHeap<Integer> heap = new MinHeap<>();
		for (int node = 1; node <= 30; node++) {
			int a = random.nextInt(2);
			if (a == 0) {
				int value = random.nextInt(100) + 1;
				heap.add(value);
				System.out.println(node + " Add " + value + ": " + heap.toString());
			}

			if (a == 1 && heap.size > 0) {
				int value = heap.peek();
				heap.remove();
				System.out.println(node + " Remove " + value + ": " + heap.toString());
			}
		}

		String[] items = heap.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

		int[] results = new int[items.length + 1];

		for (int i = 1; i <= items.length; i++) {
			results[i] = Integer.parseInt(items[i - 1]);
		}

		new heapTreeGUI(results);
	}

}
