package java_0131;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOMain1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		   System.out.print("��� ����: ");
		   String src = sc.nextLine();   
		   System.out.print("�纻 �̸�: ");
		   String dst = sc.nextLine();
		   
		   try(InputStream in = new FileInputStream(src) ;
		          OutputStream out = new FileOutputStream(dst)) {
		      int data;
		      while(true) {
		         data = in.read(); // ���Ϸκ��� 1 ����Ʈ�� �д´�.
		         if(data == -1) // �� �̻� �о� ���� �����Ͱ� ���ٸ�,
		            break;
		         out.write(data); // ���Ͽ� 1����Ʈ�� ����.
		      }
		   }
		   catch(IOException e) {
		      e.printStackTrace();
		   }
	}
}
