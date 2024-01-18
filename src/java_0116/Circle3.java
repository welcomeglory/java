package java_0116;
class Circle7 {
	static final double PI = 3.1415;
	private double radius;
	Circle7(double rad) {
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
public class Circle3 {
	                                                          // 파라미터 데이터타입
	public static double sumofCircle(Circle7[] arrCircle) {
		double sum = 0;
		for (int i = 0; i < arrCircle.length; i++) {
			sum = sum + arrCircle[i].getArea();
		}
		return sum;				
	}
	public static void main(String[] args) {
		Circle7[] arrCircle = {new Circle7(5), new Circle7(10),  new Circle7(100)};
		double circleSum = sumofCircle(arrCircle);
		System.out.println("넓이의 합" +circleSum);

	}
}
