package Java10;

class Car {
	protected String owner;
	protected String id;

	public Car(String own, String s) {
		owner = own;
		id = s;
	}

//(a)
	final void show() {
		System.out.println("車主姓名" + owner);
		System.out.println("車牌號碼" + id);
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
		System.out.println("車主姓名:" + owner);
		System.out.println("車牌號碼:" + id);
		System.out.println("車身顏色:" + color);
	}
}

//(d)
public class Class17 {

	public static void main(String[] args) {
		CColor mycar = new CColor("Riaan", "A1-2345", "Black");
		mycar.show_data();
	}
}
//(e)編譯後出現錯誤訊息。將 CColor 類別裡的 show() method 改名，在 main() method 裡，呼叫新改名的 method。
