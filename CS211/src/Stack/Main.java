package Stack;

public class Main {

	public static void main(String[] args) {
		Stack211g<String> stringStack = new Stack211g<>();
		stringStack.push("Kpop");
		String s = stringStack.pop();
		System.out.println(s);

		Stack211g<Character> charStack = new Stack211g<>();
		charStack.push('K');
		char c = charStack.pop();
		System.out.println(c);

		Stack211g<Integer> integerStack = new Stack211g<>();
		integerStack.push(5);
		int num1 = integerStack.read();
		int num2 = integerStack.pop();
		System.out.println(num1 + " " + num2);

		Stack211g<Double> doubleStack = new Stack211g<>();
		doubleStack.push(3.14159);
		double num = doubleStack.pop();
		System.out.println(num);

	}

}
