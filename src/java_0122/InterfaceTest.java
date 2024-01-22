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
		// 삼성 프린터로 출력
		Printable1 prn = new SPrinterDriver1();
		prn.print(myDoc);
		System.out.println();
		// LG 프린터로 출력
		prn = new LPrinterDriver1();
	 	prn.print(myDoc);
	}
}
