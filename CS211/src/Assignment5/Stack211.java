/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.11.8 - Fall quarter
 *
 * This program is creating a stack
 */
package Assignment5;

import java.util.ArrayList;

public class Stack211<T> {
	int stackTop;
	ArrayList<T> myStack = new ArrayList<T>();

	Stack211() {
		stackTop = -1;
	}

	public void push(T c) {
		stackTop++;
		if (stackTop == myStack.size()) {
			myStack.add(c);
		} else {
			myStack.set(stackTop, c);
		}
	}

	public T pop() {
		T temp = myStack.get(stackTop);// the top element of the stack
		stackTop--;
		return temp;
	}

	public T top() {
		return myStack.get(stackTop);
	}

	public boolean isEmpty() {
		if (stackTop == -1) {
			return true;
		} else {
			return false;
		}
	}
}
