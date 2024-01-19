package java_0119;
//클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
//필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
//생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
//메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력
class Employee{
	String name;
	int age;
	String addr;
	String part;
	int won;
	public Employee(String name, int age, String addr,	String part) {
		this.name = name;
		this.age=age;
		this.addr=addr;
		this.part=part;
	}
	public void printInfo() {
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age );
		System.out.println("주소 : " + addr );
		System.out.println("부서 : " + part );
	}
	public void setwon(int won) {
		this.won = won;
	}
}
class Regular extends Employee{

	public Regular(String name, int age, String addr, String part, int won) {
		super(name, age, addr, part);
		setwon(won);
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("정규직 월급 : " + super.won);
	}		
}
class Temporary extends Employee{

	public Temporary(String name, int age, String addr, String part, int won) {
		super(name, age, addr, part);
		setwon(won);
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("비정규직 월급 : " + super.won);
	}
}
//클래스 Regular는 위에서 구현된 클래스 Employee의 하위 클래스
//생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
//Setter : 월급 정보 필드를 지정
//메소드 printInfo() : 인자는 없고 "정규직"이라는 정보와 월급을 출력
public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee("홍길동", 27, "서울시", "디자인");
		employee.printInfo();
		System.out.println();
		
		Employee employee2 = new Regular("김철수", 26, "서울시", "마케팅", 2_500_000);
		employee2.printInfo();  //함수 오버라이딩, 폴리머피즘 적용

	}
}
