package java_0122;

interface Printable {
	public abstract void print(String doc);
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
		// 삼성 프린터로 출력
		Printable prn = new SamsungPrinterDriver();
		prn.print(myDoc);
		// LG 프린터로 출력
		prn = new LGPrinterDriver();
		prn.print(myDoc);
	}
}
