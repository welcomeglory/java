
public class ex2 {
	public static int hap(int num1, int num2) {	
		int sum =0;
		for(int i=num1; i<=num2; i++) {
			sum = sum + i;	
		}
		return sum;
	}
//	// �Լ� = ��� = function = method = �޼���
//	public static void hiEveryone(int age) {
//		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
//	}
//
//	public static void byeEveryone() {
//		System.out.println("������ �˰ڽ��ϴ�.");
//	}
//
//	public static void hiEveryone(int age, double height) {
//		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
//		System.out.println("���� Ű�� " + height + "cm �Դϴ�.");
//	}
//
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;
//	}
//
//	public static double square(double num) {
//		return num * num;
//	}

	public static void main(String[] args) {

//		hiEveryone(10);
//		hiEveryone(10,160.51514654254132);
		
		System.out.println(hap(1,10));
		
	}
}
