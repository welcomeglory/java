package java_0131;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOMain2 {
	public static void main(String[] args)  {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("��� ����: ");
		   String src = sc.nextLine();   
		   System.out.print("�纻 �̸�: ");
		   String dst = sc.nextLine();
		   
		   try(InputStream in = new FileInputStream(src) ;
		            OutputStream out = new FileOutputStream(dst)) {
		      byte buf[] = new byte[1024];
		      int len;

		      while(true) {
		         len = in.read(buf); // �迭 buf�� �����͸� �о� ���̰�, (�� �̻� �о� ���� ������ ������ -1 ��ȯ)
		         if(len == -1)
		            break;
		         out.write(buf, 0, len); // len ����Ʈ��ŭ �����͸� �����Ѵ�.
		      }
		   }
		   catch(IOException e) {
		      e.printStackTrace();
		   }
	}
}
	
	


