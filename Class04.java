package Java10;

class CRectangle2 {
	private int length;
	private int width;

	public CRectangle2() {
		length = 2;
		width = 2;
	}

//(a)
	public CRectangle2(int l, int w) {
		length = l;
		width = w;
	}

//(b)
	private void show() {
		System.out.print("length=" + length);
		System.out.print(", width" + width);
	}

	public void area() {
		show();
		System.out.println(", area=" + length * width);
	}
}

//(d)
class CData5 extends CRectangle2 {
	public CData5() {
	}

//(c)
	public CData5(int l, int w) {
		super(l, w);
	}
}

public class Class04 {

	public static void main(String[] args) {
		CData5 obj1 = new CData5(3, 8);
		CData5 obj2 = new CData5();
		obj1.area();
		obj2.area();
	}
}
