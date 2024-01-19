package java_0119;
class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public String toString() {
		return "넓이는 " + (radius * radius * Math.PI) + "입니다.";
	}
}
public class FruitMain {
	public static void main(String[] args) {
		Object obj = new Circle(10);
		System.out.println(obj);
	}
}


