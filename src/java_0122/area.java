package java_0122;
interface AreaGetable {
	public double getArea();
}
class Circle implements AreaGetable{
	int r;
	 Circle(int r) {
		this.r = r;
	}
	 public double getArea() {
		 return r*r*Math.PI;
	 }
}
class Rectangle implements AreaGetable{
	int height;
	int widht;
	Rectangle(int height, int widht) {
		this.height = height;
		this.widht = widht;
	}
	 public double getArea() {
		 return height*widht;
	 }
}
class Triangle implements AreaGetable{
	int height;
	int widht;
	Triangle(int height,int widht) {
		this.height = height;
		this.widht = widht;
	}
	 public double getArea() {
		 return height*widht*0.5;
	 }
}
public class area{
	public static void main(String[] args) {
    	AreaGetable area = new Circle(4);
		System.out.println(area.getArea());
		area = new Rectangle(4,5);
		System.out.println(area.getArea());
    	area = new Triangle(4,5);
		System.out.println(area.getArea());
	}
}
