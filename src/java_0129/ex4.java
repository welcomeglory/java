package java_0129;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		List<Integer> listnum = new ArrayList<>();
		Scanner sc = new Scanner(System.in);//�Է��ؾ� �ϹǷ� Scanner������
	    int num=0;//�Է��� ���� ���������Ѵ�.
	    while(num!=-1) {
	    	System.out.println("���� ������ �Է��Ͻÿ�.");
	    	num = sc.nextInt();
	    	listnum.add(num);//���ʷ� �����Է�
	    }
	    Integer theBigest = listnum.get(0);//�迭�� �ϳ��� �������� ���
	    for(int i=0; i<listnum.size();i++) {
	    	if(listnum.get(i)>theBigest)//���� ��
	    		theBigest = listnum.get(i);//�� ���� ���� theLongest������ ����
	    }
	    System.out.println("���� ū ���� " +theBigest+"�Դϴ�!");
		

	}

}
