package java_0122;
/*Ŭ���� �ȿ� �߻� �޼ҵ尡 �ü� �ִ�.
 * �� �߻� �޼ҵ尡 ���� class ������ abstract�� ����Ǿ�� ��.
 */
//abstract�� �ڽ��� �����϶�.
abstract class Pet {
	abstract public void eat();
	public void run() {
		System.out.println("�پ� �ٴմϴ�.");
	}
}
class Dog extends Pet{
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
}
public class petMain1 {
	public static void main(String[] args) {
		// �߻�Ŭ������ ���ԵǸ� ��ü ������ �ȵȴ�.
		// ����ȯ
		Pet pet = new Dog(); 
		pet.run();
		pet.eat();		
	}
}
