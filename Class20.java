package java10;

class CRectangle1 {
	protected int length;
	protected int width;

	public CRectangle1(int l, int w) {
		length = l;
		width = w;
	}

	public String toString() {
		String str = "length=" + length + ", width=" + width;
		str += ", area" + length * width;
		return str;
	}

	public String toString(int a, int b) {
		if (a >= b)
			return super.toString();
		else
			return "Argument Error";
	}
}

//(b)
public class Class20 {

	public static void main(String[] args) {
		CRectangle1 rect = new CRectangle1(2, 6);
		System.out.println(rect.toString());
		System.out.println(rect.toString(8, 4));
		System.out.println(rect.toString(3, 5));
	}
}
//(a)
//(c)��(a)�M(b)���ҩw�q����� toString() method �o�H�P�ɦs�b��@�����O���A�O�Q�� OPP �̪��h���C