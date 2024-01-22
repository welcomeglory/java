package java_0122;
//다음은 도형의 구성을 묘사하는 인터페이스이다.
interface Shape {
	public static final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}
 class Circle1 implements Shape{
	double r;
	public Circle1(double r) {
		this.r = r;		
	}
	public void draw() {
		System.out.println("반지름이 "+r+"cm인 원입니다.");
	}
	public double getArea() {
		return r*r*PI;
	}	
}
public class InterfaceTest2 {
	public static void main(String[] args) {
		Shape donut = new Circle1(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
