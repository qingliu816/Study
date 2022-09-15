package Stack;

import java.util.ArrayList;

public class Stack211g<T> {
	int stackTop;
	ArrayList<T> myStack = new ArrayList<T>();

	Stack211g() {
		stackTop = -1;
	}

	public void push(T c) {
		myStack.add(c);
		stackTop++;
	}

	public T pop() {
		return myStack.get(stackTop--);
	}

	public T read() {
		return myStack.get(stackTop);
	}
}
