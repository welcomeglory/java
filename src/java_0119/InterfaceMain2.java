package java_0119;
interface Printable { // MS�� �����ϰ� ������ �������̽�
	public void print(String doc);	
}
class SPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.print(doc);
	}	
}
class LPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.print(doc);	
	}
}
/*
 * ���: 
 * From Samsung printer 
 * This is a report about ... 
 * From LG printer 
 * This is a report about ...
 */
public class InterfaceMain2 {
	// SPrinterDriver �� LPrinterDriver�� ����ÿ�
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		// �Ｚ �����ͷ� ���
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		// LG �����ͷ� ���
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
}
