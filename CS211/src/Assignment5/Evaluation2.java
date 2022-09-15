
/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.11.8 - Fall quarter
 *
 * This program is to takes a valid mathematical operation in in-fix notation and converts it to post-fix notation then evaluates the expression. 
 */
package Assignment5;

import java.util.HashMap;

public class Evaluation2 {
	static String[] statements = { "(1+2)*3", "(2+5)*(1+3)" };
	static String post = "";
	static HashMap<Character, Integer> precedence = new HashMap<>();

	public static void setPrecedence() {// add initial precedence
		precedence.put('*', 2);
		precedence.put('/', 2);
		precedence.put('+', 1);
		precedence.put('-', 1);
	}

	public static void main(String[] args) {
		for (int i = 0; i < statements.length; i++) { // no of statements to be evaluated

			String post = createPostfix(i);// create post-fix notation

			calculateResult(post);// calculate it from the post-fix notation
		}
	}

	private static String createPostfix(int i) {

		Stack211<Character> myStack = new Stack211();

		for (int j = 0; j < statements[i].length(); j++) {
			char c = statements[i].charAt(j);
			if (c >= '0' && c <= '9') {
				post += c;
			} // if it's a number
			if (c == ')' || c == '}') {
				char s = myStack.pop();
				while (s != '(' && s != '{') {
					post += s;
					s = myStack.pop();
				}
			}
			if (c == '(' || c == '{') {
				myStack.push(c);
			}
			if (c == '+' || c == '-' || c == '*' || c == '/') { // operators
				if (precedence.isEmpty()) {
					myStack.push(c);
				} else if (precedence.get(c) > precedence.get(myStack.top())) {
					// c is higher
					myStack.push(c);
				} else {
					// c is lower
					// post += pop until pop is same as c's priority;
					while (!precedence.isEmpty() && precedence.get(myStack.top()) >= precedence.get(c)) {
						post += myStack.pop();
					}
					myStack.push(c);
				}
			}
		}

		while (!myStack.isEmpty()) {
			post += myStack.pop();
		}

		return post;
	}

	private static void calculateResult(String post) {
		Stack211<Integer> myStack = new Stack211();// generic method
		for (int k = 0; k < post.length(); k++) {// scan all character one by one
			char c = post.charAt(k);
			if (c >= '0' && c <= '9') {// if the character is an operand,push it into the stack
				int value = c - '0';
				myStack.push(value);
			}

			if (c == '+' || c == '-' || c == '*' || c == '/') { // if the character is an operators,pop two integers
																// from stack
				int value1 = myStack.pop();
				int value2 = myStack.pop();// pop two values
				if (c == '+') {
					myStack.push(value2 + value1);
				}
				if (c == '-') {
					myStack.push(value2 - value1);
				}
				if (c == '*') {
					myStack.push(value2 * value1);
				}
				if (c == '/') {
					myStack.push(value2 / value1);
				}
			}
		}

		int result = myStack.pop();
		System.out.println("result= " + result);

	}
}
