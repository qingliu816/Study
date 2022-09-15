package Test3;

class Super {
	int num = 1;
	int id = 2;

	Super() {
		num = 3;
	}

	public void print() {
		System.out.println(id);
	}
}

class Sub extends Super {
	int num = 10;

	Sub() {
		num = 20;
	}

	public void print() {
		System.out.println(num);
		System.out.println(super.num);
		System.out.println(num / id);

	}
}

public class text4 {
	public static void main(String[] args) {
		Sub obj1 = new Sub();
		obj1.print();
		Super obj2 = new Sub();
		obj2.print();
		System.out.println(obj2.num);
	}
}
