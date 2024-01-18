package java_0118;
class Shape1{
	public double getArea() {
		return 0;
	}
}
class Circle1 extends Shape1{
	double r;
	public Circle1(double r) {
		this.r = r;
	}
	public double getArea() {
		return r * r * Math.PI;
	}
}
class Rectangle extends Shape1 {
	int width, height;
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	public double getArea() {
		return width * height;
	}
}
class Triangle extends Shape1 {
	int width, height;
	public Triangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	public double getArea() {
		return width * height/2;
	}
}
public class overloading {
	public static void main(String[] args) {
		Shape1[] shapeArr = {new Circle1(100), new Rectangle(10,10)};
		double sum =0;
		for(Shape1 shape : shapeArr) {
			sum += shape.getArea();
		}
		System.out.println(sum);		
		//================================================
		Circle1 c1 =  new Circle1(100);
		//System.out.println(c1.getArea());
		Rectangle r1 =  new Rectangle(10,10);
		//System.out.println(r1.getArea());
		Triangle t1 =  new Triangle(10,10);
		//System.out.println(t1.getArea());
		double total = c1.getArea()+r1.getArea()+t1.getArea();
		System.out.println(total);
	}
}
