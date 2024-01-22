package java_0122;
//������ ������ ������ �����ϴ� �������̽��̴�.
interface Shape {
	public static final double PI = 3.14; // ���
	void draw(); // ������ �׸��� �߻� �޼ҵ�
	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}
 class Circle1 implements Shape{
	double r;
	public Circle1(double r) {
		this.r = r;		
	}
	public void draw() {
		System.out.println("�������� "+r+"cm�� ���Դϴ�.");
	}
	public double getArea() {
		return r*r*PI;
	}	
}
public class InterfaceTest2 {
	public static void main(String[] args) {
		Shape donut = new Circle1(10); // �������� 10�� �� ��ü
		donut.redraw();
		System.out.println("������ " + donut.getArea());
	}
}
