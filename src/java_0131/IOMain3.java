package java_0131;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOMain3 {
	// throws Exception ����ó��
	public static void main(String[] args) throws Exception {
		try(DataOutputStream out = 
		          new DataOutputStream(new FileOutputStream("data.dat"))) { 
		         out.writeInt(370); // int�� ������ ����
		         out.writeDouble(3.14); // double�� ������ ����
		      }
		      catch(IOException e) {
		         e.printStackTrace();
		      }
		try(DataInputStream in =
		          new DataInputStream(new FileInputStream("data.dat"))) {
		         int num1 = in.readInt(); // int�� ������ ����
		         double num2 = in.readDouble(); // double�� ������ ����      
		         System.out.println(num1);
		         System.out.println(num2);
		      }

	}
}
