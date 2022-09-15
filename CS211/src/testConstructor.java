class Class1 {
	public Class1() {
		System.out.println("class 1");
	}
}

class Class2 extends Class1 {
	public Class2() {
		System.out.println("class 2");
	}
}

public class testConstructor {

	public static void main(String[] args) {
		new Class2();
	}

}
