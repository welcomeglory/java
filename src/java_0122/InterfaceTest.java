package java_0122;
interface Printable1 {
	public  void print(String doc);
}
class SPrinterDriver1 implements Printable1{
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}
class LPrinterDriver1 implements Printable1{
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		// �Ｚ �����ͷ� ���
		Printable1 prn = new SPrinterDriver1();
		prn.print(myDoc);
		System.out.println();
		// LG �����ͷ� ���
		prn = new LPrinterDriver1();
	 	prn.print(myDoc);
	}
}
