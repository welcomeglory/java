package java_0117;
class Man {//부모클래스 Man
	String name;
	//생성자
	public Man(String name) {
	      this.name = name;
	   }
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}
class BusinessMan extends Man {
	String company;
	String position;
	public BusinessMan(String name, String company, String position) {//생성자
        super(name);//슈퍼생성자-부모에 있는 생성자 호출할때 쓰임.	
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		super.tellYourName();
	}
}
public class extend {
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("홍길동", "삼성", "대리");
		man.tellYourInfo();
	}
}
