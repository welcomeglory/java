package java_0119;
//Ŭ���� Employee(����)�� Ŭ���� Regular(������)�� Temporary(��������)�� ���� Ŭ����
//�ʵ�: �̸�, ����, �ּ�, �μ�, ���� ������ �ʵ�� ����
//������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ������ ����
//�޼ҵ� printInfo() : ���ڴ� ���� �ڽ��� �ʵ� �̸�, ����, �ּ�, �μ��� ���
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
		System.out.println("�̸� : " + name );
		System.out.println("���� : " + age );
		System.out.println("�ּ� : " + addr );
		System.out.println("�μ� : " + part );
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
		System.out.println("������ ���� : " + super.won);
	}		
}
class Temporary extends Employee{

	public Temporary(String name, int age, String addr, String part, int won) {
		super(name, age, addr, part);
		setwon(won);
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("�������� ���� : " + super.won);
	}
}
//Ŭ���� Regular�� ������ ������ Ŭ���� Employee�� ���� Ŭ����
//������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ���� ������ ȣ��
//Setter : ���� ���� �ʵ带 ����
//�޼ҵ� printInfo() : ���ڴ� ���� "������"�̶�� ������ ������ ���
public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee("ȫ�浿", 27, "�����", "������");
		employee.printInfo();
		System.out.println();
		
		Employee employee2 = new Regular("��ö��", 26, "�����", "������", 2_500_000);
		employee2.printInfo();  //�Լ� �������̵�, ���������� ����

	}
}
