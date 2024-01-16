package java0116;
import java.util.Scanner;
class Rectangle2 {
	private double w;
	private double h;
	public Rectangle2(double w, double h) {
		this.w = w;
		this.h = h;
	}
	public double getArea() {
		return w * h;
	}
}
public class ex6 {
	public static double sumRectangle(Rectangle2[] rec1) {
		double sum = 0;
		for (int i = 0; i < rec1.length; i++) {
			sum = sum + rec1[i].getArea();
		}
		return sum;
	}
	public static void main(String[] args) {
		final int CIRCLE_MAX = 3;
		Rectangle2[] rec1 = new Rectangle2[CIRCLE_MAX];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < rec1.length; i++) {
			System.out.println("가로를 입력하시오.");
			double w = sc.nextDouble();
			System.out.println("세로를 입력하시오.");
			double h = sc.nextDouble();
			rec1[i] = new Rectangle2(w, h);
		}
		double recSum = sumRectangle(rec1);
		System.out.println("넓이의 합" + recSum);
	}
}
