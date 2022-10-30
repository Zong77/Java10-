package Java10;

class Caaa4 {
	public int num1;
	public int num2;

	public Caaa4() {
		num1 = 1;
		num2 = 1;
	}
}

class Cbbb4 extends Caaa4 {
	public Cbbb4() {
		super();
	}

	public void show() {
		System.out.println("num1=" + num1 + ", num2=" + num2);
	}
}

public class Class13 {

	public static void main(String[] args) {
		Cbbb4 b1 = new Cbbb4();
		b1.show();
	}
}
