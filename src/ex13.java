class Circle{
	final double PI=3.14;
	double radius;
	public double getRadius() {
		return radius;
	}
	//원넓이 리턴함수
	public double getArea() {
		return radius * radius * PI;
	}
	public void setRadius(double r) {
		radius=r;
	}
	public Circle() {
		System.out.println("안녕하세요.");
	}
}
class Rectangle{
	//변수 가로=10, 세로=10
	double width = 10, height = 10;
	//넓이구하는 함수
	public double getArea() {
		return width*height;		
	}
	//가로,세로 변경 함수
	public void setWidthHeight(double w, double h) {
		width = w;
		height = h;		
	}
	//가로변경 함수
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
		
	


		
		// 변수 선언
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
//		// A + @ + 1563da5(가짜 주소)
//		// A-참조형 4byte(32bit:메모리크기 2의 32승)데이터타입(용량 + 용도)
//		// 용도 - 주소값, 용량 - 4byte
//		// a-변수명
//		// new는 객체생성, new 다음에는 클래스 이름의 생성자 함수가 온다=> 객체 생성
//		A a = new A(); // new() 객체 생성, A.a => 변수선언(메모리할당)
//		A a1 =  new A();
//		a.a = 1; // 지역 변수 - 함수 안에 있는 변수
//		a.a = 10;
//		System.out.println(a.a);
//		System.out.println(a1.a);
//		int result = a.getA();// 변수명.함수이름
//		System.out.println(result);
//		a.setA(55);
//		System.out.println(a.a);		

