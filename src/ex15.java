class AA2{
	//������
	//�Ϲ� �Լ��ʹ� ���� �ٸ�
	//1. ����Ÿ�� ���� 2. Ŭ���� �̸��� �̸��� ���� �Լ� 3. return�� ����
	//�뵵 : (�������) �ʱ�ȭ ��Ű�°� ����
	int num;
	int count;
		
	public AA2() {
	}
	public AA2(int num) {
		this.num = num;
	}
	public AA2(int num, int count) {
		this.num = num;
		this.count = count;
	}
	

	public void getNum(int num) {
		this.num = num;
	}
}
public class ex15 {
	public static void main(String[] args) {
	AA aa = new AA();
		System.out.println(aa);		
		AA aa2 = new AA(5,10);
		System.out.print(aa2.getNum());
		
	//	System.out.print(aa2.getNum());	
		
	}
}
