package java_0119;
interface ICaculabtor{
	int add(int num1, int num2);	
	int sub(int num1, int num2);	
	int mul(int num1, int num2);	
}
//�� �������̽��� �����ϴ� Caculabtor ��ü�� �����Ͽ�, add �Լ��� �׽�Ʈ �Ͻÿ�.
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
		//��ü����
		ICaculabtor cac = new Caculabtor();
		int result = cac.add(5,6);
		System.out.println(result);	
		result = cac.sub(5,6);
		System.out.println(result);	
		result = cac.mul(5,6);
		System.out.println(result);	
	}
}

