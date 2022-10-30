package java10;

class CTriangle3 {
	protected int base;
	protected int height;

	public CTriangle3() {
		base = 1;
		height = 1;
	}

	public CTriangle3(int b, int h) {
		base = b;
		height = h;
	}

	protected void show() {
		System.out.println("base=" + base + ", hreight=" + height);
	}
}

class CData1 extends CTriangle3 {
	public CData1() {
		super();
	}

	public CData1(int b, int h) {
		super(b, h);
	}

	public void area() {
		show();
		System.out.println("area=" + base * height / 2.0);
	}
}

public class Class15 {

	public static void main(String[] args) {
		CData1 obj1 = new CData1(3, 8);
		CData1 obj2 = new CData1();
		obj1.area();
		obj2.area();
	}
}