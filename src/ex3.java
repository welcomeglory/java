
public class ex3 {

	public static void main(String[] args) {
		/*int num = 9;
		if((num % 2) == 1)
			System.out.println("Ȧ���Դϴ�.");
		else if((num % 2) == 0)
			System.out.println("¦���Դϴ�.");
		else
			System.out.println("0�Դϴ�.");*/
		
		/*num ���� ���� �� �ش� ���� 3�� ��� ���� 2�� ����̸� 
		 6�� ��� �Դϴ�.
		int num = 6;
		if((num % 3) == 0 && (num % 2) == 0)
			System.out.println("6�� ����Դϴ�.");
		else
			System.out.println("6�� ����� �ƴմϴ�.");
			*/
		/*���� ���� ���� ���� ���� �Ŀ� ������ ����� ������ 
		 90�̻��̸� ���Դϴ�.
		 80�̻��̸� ���Դϴ�.*/
		int kor = 75, eng = 60, math = 80;
	    double avg;
		
		avg = (kor + eng + math) / 3.0;
		
		if(avg >= 90)
			System.out.println("��� 90�̻��̸� ���Դϴ�.");
		else if(avg >=80)
			System.out.println("��� 80�̻��̸� ���Դϴ�.");
		else if(avg >=70)
			System.out.println("���70�̻��̸� ���Դϴ�.");
		else if(avg >=60)
			System.out.println("��� 60�̻��̸� ���Դϴ�.");
		else 
			System.out.println("�������� ���Դϴ�.");		
	}
	
       
       
		

	

}
