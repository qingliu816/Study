/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.11.8 - Fall quarter
 *
 * This program is for checking  statement
 */
package Assignment5;

import java.util.HashMap;

public class Evaluation1 {
	static HashMap<Integer, String> errorMessage = new HashMap<>();
	static HashMap<Character, Character> match = new HashMap<>();
	static String[] Statement = new String[] { "(1+3)*{2-1)", "(1+3)*(2-1)", "2+3*2", "5+3*(2-1)", "(3+2*2" };

	static public void addErrorMessage() {// add different Syntax error in the map
		errorMessage.put(1, "Syntax Error: Invalid Expression: Addtional ");
		errorMessage.put(2, "Syntax Error: Incomplete Expression: Unpaired ");
		errorMessage.put(3, "Syntax Error: Incomplete Expression: Missing ");
	}

	static public void addMatch() {// add match symbols in the map
		match.put('(', ')');
		match.put('{', '}');
	}

	public static void main(String[] args) {
		addErrorMessage();
		addMatch();
		for (int i = 0; i < Statement.length; i++) {
			String expression = Statement[i];
			Stack211<Character> myStack = new Stack211<>();
			for (int j = 0; j < expression.length(); j++) {
				char c = expression.charAt(j);
				if (c == '(' || c == '{') {
					myStack.push(c);
				}
				if (c == ')' || c == '}') {
					boolean correct = testBracket(c, j, myStack);
					if (!correct) {
						// Reset myStack so we won't trigger logic after loop.
						myStack = new Stack211<>();
						// Find one failure, jump out of the loop.
						break;
					}
				}
			}

			if (!myStack.isEmpty()) {
				// Left bracket remaining in the stack.
				printError(expression.length(), 3, match.get(myStack.pop()));
			}
		}
	}

	private static boolean testBracket(char c, int location, Stack211<Character> myStack) {
		if (myStack.isEmpty()) {
			// Missing left bracket.
			printError(location, 1, c);
			return false;
		}
		char s = myStack.pop();
		if (c != match.get(s)) {
			// left bracket and right bracket doesn't match.
			printError(location, 2, c);
			return false;
		}
		return true;
	}

	private static void printError(int location, int i, char c) {// get a error location and get a marker
		System.out.println("Error in " + location + ": " + errorMessage.get(i) + c);
	}
}
