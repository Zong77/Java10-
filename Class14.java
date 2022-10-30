package java10;

class Caaa5 {
	public int num1;
	public int num2;

	public Caaa5(int a, int b) {
		num1 = a;
		num2 = b;
	}
}

class Cbbb5 extends Caaa5 {
	public Cbbb5(int a, int b) {
		super(a, b);
	}

	public void show() {
		System.out.println("num1=" + num1 + ", num2=" + num2);
	}
}

public class Class14 {

	public static void main(String[] args) {
		Cbbb5 b2 = new Cbbb5(3, 9);
		b2.show();
	}
}