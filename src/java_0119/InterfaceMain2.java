package java_0119;
interface Printable { // MS가 정의하고 제공한 인터페이스
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
 * 출력: 
 * From Samsung printer 
 * This is a report about ... 
 * From LG printer 
 * This is a report about ...
 */
public class InterfaceMain2 {
	// SPrinterDriver 와 LPrinterDriver를 만드시오
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		// LG 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
}
