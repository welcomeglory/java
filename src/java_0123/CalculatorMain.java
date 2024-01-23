package java_0123;
interface ICalculator {
	int add(int x, int y);
	int sub(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);
}
class Calculator implements ICalculator{
	public int add(int x, int y) {	return x+y;	}
	public int sub(int x, int y) {	return x-y;	}
	public int mul(int x, int y) {	return x*y;	}
	public int div(int x, int y) {
		int result=0;
		try {
			result = x/y;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("계산기종료");
		} 
		return result;
	}	
}
public class CalculatorMain {
	public static void main(String[] args) {
		ICalculator cal = new Calculator();
		System.out.println(cal.add(6, 5));
		System.out.println(cal.sub(6, 5));
		System.out.println(cal.mul(6, 5));
		System.out.println(cal.div(6, 0));
	}
}





