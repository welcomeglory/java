package java_0117;
class Man {//�θ�Ŭ���� Man
	String name;
	//������
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
	public BusinessMan(String name, String company, String position) {//������
        super(name);//���ۻ�����-�θ� �ִ� ������ ȣ���Ҷ� ����.	
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
		BusinessMan man = new BusinessMan("ȫ�浿", "�Ｚ", "�븮");
		man.tellYourInfo();
	}
}
