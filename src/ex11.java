import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
//     System.out.println("���� ������ �����ÿ�.");
//     int kor = sc.nextInt();
//     System.out.println("���� ������ �����ÿ�.");
//     int eng = sc.nextInt();
//     System.out.println("���� ������ =" + kor + "�Դϴ�.");
//     System.out.println("���� ������ =" + eng + "�Դϴ�.");
//     System.out.println("������ �Է��Ͻÿ�:");
//     int num = sc.nextInt();
//     if(num>0)    
//     System.out.println("����Դϴ�.");
//     else if(num <0)
//     System.out.println("�����Դϴ�.");
//     else
//    	 System.out.println("0�Դϴ�.");

		while (true) {
			//Scanner:������
			Scanner sc = new Scanner(System.in);
			System.out.print("���� ������ �Է��Ͻÿ�:");
			int kor = sc.nextInt();
			System.out.print("���� ������ �Է��Ͻÿ�:");
			int eng = sc.nextInt();
			System.out.print("���� ������ �Է��Ͻÿ�:");
			int math = sc.nextInt();
			double avg = (kor + eng + math) / 3.0;
			if (avg >= 90)
				System.out.println("�� �Դϴ�.");
			else if (avg >= 80)
				System.out.println("�� �Դϴ�.");
			else if (avg >= 70)
				System.out.println("�� �Դϴ�.");
			else if (avg >= 60)
				System.out.println("�� �Դϴ�.");
			else
				System.out.println("�� �Դϴ�.");
			System.out.print("����Ͻðڽ��ϱ�?");
			String str = sc.next();
			if (str.equals("n")||str.equals("N"))
				break;
		}
	}
}
