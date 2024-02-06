package java_0131;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedStreamFileCopier {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
	      System.out.print("��� ����: ");
	      String src = sc.nextLine();
	      System.out.print("�纻 �̸�: ");
	      String dst = sc.nextLine();
	      
	      try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src)) ;
	          BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {
	         int data;
	         while(true) {
	            data = in.read();
	            if(data == -1)
	               break;
	            out.write(data);
	         }
	      }
	      catch(IOException e) {
	         e.printStackTrace();
	      }


	}
}
