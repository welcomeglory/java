package java_0129;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);//�Է��ؾ� �ϹǷ� Scanner������
	    String nickname;//�Է��� ���� ���������Ѵ�.
	    for(int i=0; i<5;i++) {//5���� ������ �Է¹޾� �����ϹǷ� 5�� ������ �ݺ���
	    	System.out.println((i+1)+"��° ������ �Է��ϼ���.");
	    	nickname = sc.next();
	    	list.add(nickname);//���ʷ� �Է��� ������ ����	    	
	    }
	    String theLongest = list.get(0);//�迭�� �ϳ��� �������� ���
	    for(int i=0; i<list.size();i++) {
	    	if(list.get(i).length()>theLongest.length())//���ڿ��� ���̸� ��
	    		theLongest = list.get(i);//�� ���� ���� theLongest������ ����
	    }
	    System.out.println("���� �� ������ " +theLongest+"�Դϴ�!");
		

	}

}
