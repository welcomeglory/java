class Circle{
	final double PI=3.14;
	double radius;
	public double getRadius() {
		return radius;
	}
	//������ �����Լ�
	public double getArea() {
		return radius * radius * PI;
	}
	public void setRadius(double r) {
		radius=r;
	}
	public Circle() {
		System.out.println("�ȳ��ϼ���.");
	}
}
class Rectangle{
	//���� ����=10, ����=10
	double width = 10, height = 10;
	//���̱��ϴ� �Լ�
	public double getArea() {
		return width*height;		
	}
	//����,���� ���� �Լ�
	public void setWidthHeight(double w, double h) {
		width = w;
		height = h;		
	}
	//���κ��� �Լ�
	public void setWidth(double w) {
		width = w;		
	}
}
public class ex13 {
	public static void main(String[] args) {
//		Rectangle rec = new Rectangle();
//		System.out.println(rec.getArea());
//		
//		rec.setWidthHeight(20,20);
//		rec.getArea();
//		System.out.println(rec.getArea());
//		rec.setWidth(30);
//		System.out.println(rec.getArea());
		
	


		
		// ���� ����
		Circle circle = new Circle();
//		System.out.println(circle.PI);
//		System.out.println(circle.radius);
//		System.out.println(circle.getRadius());
//		System.out.println(circle.getArea());
//		circle.radius = 10;
//		
//		System.out.println(circle.getArea());
//		
		//circle.radius = 20;
		//System.out.println(circle.getArea());
		circle.setRadius(20);
		//Circle circle = Circle();
//		
		System.out.println(circle.getArea());
//		circle.setRadius(30);
//		System.out.println(circle.getArea());
	}
}


//
//		
//		
//		Rectangle rectangle = new Rectangle();
//		System.out.println(rectangle.getArea());
	
		
//		circle.radius = 10;
//		
//		System.out.println(circle.getArea());
//		
//		circle.radius = 20;
//		
//		System.out.println(circle.getArea());
//
//		B b = new B();
//		System.out.println(b.b);		
//		// A + @ + 1563da5(��¥ �ּ�)
//		// A-������ 4byte(32bit:�޸�ũ�� 2�� 32��)������Ÿ��(�뷮 + �뵵)
//		// �뵵 - �ּҰ�, �뷮 - 4byte
//		// a-������
//		// new�� ��ü����, new �������� Ŭ���� �̸��� ������ �Լ��� �´�=> ��ü ����
//		A a = new A(); // new() ��ü ����, A.a => ��������(�޸��Ҵ�)
//		A a1 =  new A();
//		a.a = 1; // ���� ���� - �Լ� �ȿ� �ִ� ����
//		a.a = 10;
//		System.out.println(a.a);
//		System.out.println(a1.a);
//		int result = a.getA();// ������.�Լ��̸�
//		System.out.println(result);
//		a.setA(55);
//		System.out.println(a.a);		

