package java10;

class Car {
	protected String owner;
	protected String id;

	public Car(String own, String s) {
		owner = own;
		id = s;
	}

//(a)
	final void show() {
		System.out.println("���D�m�W" + owner);
		System.out.println("���P���X" + id);
	}
}

class CColor extends Car {
	public String color;

//(b)
	public CColor(String own, String s, String col) {
		super(own, s);
		color = col;
	}

//(c)
	public void show_data() {
		System.out.println("���D�m�W:" + owner);
		System.out.println("���P���X:" + id);
		System.out.println("�����C��:" + color);
	}
}

//(d)
public class Class17 {

	public static void main(String[] args) {
		CColor mycar = new CColor("Riaan", "A1-2345", "Black");
		mycar.show_data();
	}
}
//(e)�sĶ��X�{���~�T���C�N CColor ���O�̪� show() method ��W�A�b main() method �̡A�I�s�s��W�� method�C