package java10;

class Cccc {
	public int num1;
	public int num2;

	public Cccc() {
		num1 = 1;
		num2 = 1;
	}

	// (a)
	public Cccc(int a, int b) {
		num1 = a;
		num2 = b;
	}
	// (b)
}

class Cddd extends Cccc {
	public Cddd() {

	}

	public Cddd(int a, int b) {
		super(a, b);
	}
	// (c)

	public void show() {
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
	}
}

public class Class03 {

	public static void main(String[] args) {
		Cddd b1 = new Cddd();
		Cddd b2 = new Cddd(3, 9);
		b1.show();
		b2.show();
	}
	// (d)
}