package java_0119;
class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public String toString() {
		double area = radius * radius * Math.PI;
		//return "���̴� " + (radius * radius * Math.PI) + "�Դϴ�.";
		//return "���̴� " + String.valueOf(area) + "�Դϴ�.";
		return "���̴�" + area;
	}
}
public class object_tostring {
	public static void main(String[] args) {
		Object obj = new Circle(10);
		System.out.println(obj);
	}
}


