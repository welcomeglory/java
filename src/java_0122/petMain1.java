package java_0122;
/*클래스 안에 추상 메소드가 올수 있다.
 * 단 추상 메소드가 오면 class 에서도 abstract로 선언되어야 함.
 */
//abstract는 자식이 구현하라.
abstract class Pet {
	abstract public void eat();
	public void run() {
		System.out.println("뛰어 다닙니다.");
	}
}
class Dog extends Pet{
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
}
public class petMain1 {
	public static void main(String[] args) {
		// 추상클래스가 오게되면 객체 생성이 안된다.
		// 형변환
		Pet pet = new Dog(); 
		pet.run();
		pet.eat();		
	}
}
