package java_0122;

interface Printable {
	public  void print(String doc);
}
interface ColorPrintable extends Printable {
	   void printCMYK(String doc);
	}
class Prn909Drv implements ColorPrintable {
	   @Override
	   public void print(String doc) {   // ��� ���
	      System.out.println("black & white ver");
	      System.out.println(doc);
	   }
	   
	   @Override
	   public void printCMYK(String doc) {   // �÷� ���
	      System.out.println("CMYK ver");
	      System.out.println(doc);
	   }
	}
class SamsungPrinterDriver implements Printable {
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}
class LGPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}
public class PrinterMain {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		// �Ｚ �����ͷ� ���
		Printable prn = new SamsungPrinterDriver();
		prn.print(myDoc);
		// LG �����ͷ� ���
		prn = new LGPrinterDriver();
		prn.print(myDoc);
	}
}
