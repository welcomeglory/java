package java_0119;
interface ICaculabtor{
	int add(int num1, int num2);	
	int sub(int num1, int num2);	
	int mul(int num1, int num2);	
}
//위 인터페이스를 구현하는 Caculabtor 객체를 생성하여, add 함수를 테스트 하시오.
class Caculabtor implements ICaculabtor{
	@Override
	public int add(int num1, int num2) {
		 return num1+num2;
	}
	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}
}
public class InterfaceMain {
	public static void main(String[] args) {
		//객체생성
		ICaculabtor cac = new Caculabtor();
		int result = cac.add(5,6);
		System.out.println(result);	
		result = cac.sub(5,6);
		System.out.println(result);	
		result = cac.mul(5,6);
		System.out.println(result);	
	}
}

