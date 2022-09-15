package Assignment7;
//consider use generic Array.

public class MinHeap<T extends Comparable<T>> {
	T[] element = (T[]) new Comparable[31];// create a generic array for heap
	int size = 0;

	int parent(int index) {
		return index / 2;
	}

	int leftChild(int index) {
		return index * 2;
	}

	int rightChild(int index) {
		return index * 2 + 1;
	}

	boolean hasParent(int index) {// index has to be start at 2
		return index > 1;
	}

	boolean hasLeftChild(int index) {
		return index * 2 <= size;
	}

	boolean hasRightChild(int index) {
		return index * 2 + 1 <= size;
	}

	void swap(T[] a, int index1, int index2) {
		T temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

	public T peek() {
		return element[1];
	}

	public void add(T value) {
		element[++size] = value;// size increase after add new value

		int index = size;
		if (!hasParent(index)) {
			return;// if no parent ,just skip
		}

		int parentIndex = parent(index);// get the index of parent
		while (element[parentIndex].compareTo(value) > 0) {
			swap(element, parentIndex, index);
			index = parentIndex;
			if (!hasParent(index)) {
				break;// if no parent ,just skip
			}
			parentIndex = parent(index);// get the index of parent
		}
	}

	public void remove() {
		element[1] = element[size];
		size--;
		int index = 1;
		boolean found = false;
		while (!found && hasLeftChild(index)) {
			int leftChild = leftChild(index);
			int rightChild = rightChild(index);
			int child = leftChild;
			if (hasRightChild(index) && element[rightChild].compareTo(element[leftChild]) < 0) {
				child = rightChild;
			}

			if (element[child].compareTo(element[index]) < 0) {
				swap(element, child, index);
				index = child;
			} else {
				found = true;
			}
		}
	}

	public String toString() {
		String result = "[";
		for (int i = 1; i <= size; i++) {
			result += element[i];
			if (i + 1 <= size) {
				result += ",";
			}
		}

		result += "]";
		return result;
	}
}
