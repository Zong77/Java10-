package java10;

class CShape {
	public double area() {
		return 0.0;
	}
}

class CCircle extends CShape {
	double radius;

	public CCircle(double r) {
		radius = r;
	}

	public double area() {
		return (3.14 * radius * radius);
	}
}

//(a)
class CSquare extends CShape {
	double side;

	public CSquare(double s) {
		side = s;
	}

	public double area() {
		return (side * side);
	}
}

//(b)
class CTriangle1 extends CShape {
	double base, height;

	public CTriangle1(double b, double h) {
		base = b;
		height = h;
	}

	public double area() {
		return (base * height / 2);
	}
}

//(c)
public class Class11 {

	public static void main(String[] args) {
		CCircle cir1 = new CCircle(1.0);
		CCircle cir2 = new CCircle(2.0);
		CCircle squ1 = new CCircle(1.0);
		CCircle squ2 = new CCircle(2.0);
		CTriangle1 tri1 = new CTriangle1(1, 4);
		CTriangle1 tri2 = new CTriangle1(2, 3);
		double a[] = new double[6];
//(d)
		System.out.println("circle(1.0)=" + cir1.area());
		System.out.println("circle(2.0)=" + cir2.area());
		System.out.println("square(1.0)=" + squ1.area());
		System.out.println("square(2.0)=" + squ2.area());
		System.out.println("triangle(1, 4)=" + tri1.area());
		System.out.println("triangle(2, 3)=" + tri2.area());

		a[0] = cir1.area();
		a[1] = cir2.area();
		a[2] = squ1.area();
		a[3] = squ2.area();
		a[4] = tri1.area();
		a[5] = tri2.area();
		System.out.println("The largest area is " + largest(a));
	}

	public static double largest(double a[]) {
		double max = a[0];
		for (int i = 0; i < a.length; i++)
			if (max < a[i])
				max = a[i];
		return max;
	}
}
//(e)