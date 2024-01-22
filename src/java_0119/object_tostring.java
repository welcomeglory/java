package java_0119;
class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public String toString() {
		double area = radius * radius * Math.PI;
		//return "넓이는 " + (radius * radius * Math.PI) + "입니다.";
		//return "넓이는 " + String.valueOf(area) + "입니다.";
		return "넓이는" + area;
	}
}
public class object_tostring {
	public static void main(String[] args) {
		Object obj = new Circle(10);
		System.out.println(obj);
	}
}


