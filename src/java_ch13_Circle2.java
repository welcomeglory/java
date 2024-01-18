import java.util.Scanner;
class Circle6 {
	static final double PI = 3.1415;
	private double radius;
	Circle6(double rad) {
		radius = rad;
	}
	double getArea() {
		return (radius * radius) * PI;
	}
	void showPerimeter() {
		double peri = (radius * 2) * PI;
		System.out.println("둘레: " + peri);
	}
	void showArea() {
		double area = (radius * radius) * PI;
		System.out.println("넓이: " + area);
	}
}
public class java_ch13_Circle2 {
	public static void main(String[] args) {
		final int CIRCLE_MAX = 3;
		Circle6[] arrCircle = new Circle6[CIRCLE_MAX];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arrCircle.length; i++) {
			System.out.println("반지름을 입력하세요.");
			double radius = sc.nextDouble();
			arrCircle[i] = new Circle6(radius);
		}
		double areaSum = 0;
		for (int i = 0; i < arrCircle.length; i++) {
			areaSum = areaSum + arrCircle[i].getArea();
		}
		sc.close();
		System.out.println("넓이의 합" + areaSum);
	}
}
