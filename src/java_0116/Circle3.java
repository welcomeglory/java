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
		System.out.println("�ѷ�: " + peri);
	}
	void showArea() {
		double area = (radius * radius) * PI;
		System.out.println("����: " + area);
	}
}
public class Circle3 {
	                                                          // �Ķ���� ������Ÿ��
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
		System.out.println("������ ��" +circleSum);

	}
}
