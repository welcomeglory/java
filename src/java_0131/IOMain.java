package java_0131;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOMain {
	// throws Exception ����ó��
	public static void main(String[] args) throws Exception {
		
		try(OutputStream out = new FileOutputStream("data.dat") ) {
			out.write(7);
		} catch (Exception e) {
			e.printStackTrace();
		} 

		/* ���� �б� */
		InputStream in = new FileInputStream("data.dat");
		int dat = in.read();
		in.close();
		System.out.println(dat);

	}
}
