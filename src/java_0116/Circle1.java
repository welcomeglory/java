package java_0116;
class Circle5 {
	static final double PI = 3.1415;
	private double radius;
	Circle5(double rad) {
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
public class Circle1 {
	public static void main(String[] args) {
//		서클객체 3개를 배열에 담은 후 해당 배열에 있는 서클의 넓이의 합을 구하시오.
//		rad 5 10 100
//		double[] c = new double[3];
//		Circle5 cir1 = new Circle5(5);
//		Circle5 cir2 = new Circle5(10);
//		Circle5 cir3 = new Circle5(100);
//
//		c[0] = cir1.getArea();
//		c[1] = cir2.getArea();
//		c[2] = cir3.getArea();
//		double sum = 0;
//		for (int i = 0; i < c.length; i++) {
//			sum = sum + c[i];
//		}		
//		System.out.println(sum);
		Circle5[] arrCircle = new Circle5[3];
		arrCircle[0] = new Circle5(5);
		arrCircle[1] = new Circle5(10);
		arrCircle[2] = new Circle5(100);
		double areaSum = 0;
		for (int i = 0; i < arrCircle.length; i++) {
			areaSum = areaSum + arrCircle[i].getArea();
		}
		System.out.println("넓이의 합" + areaSum);
	}
}
