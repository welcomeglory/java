package java_0118;
class Fruit {
	public void print() {
		System.out.println("나는 과일이다.");
	}
}
class Grape extends Fruit {
	public void print() {
		System.out.println("나는 포도다.");
	}
}
class Apple extends Fruit {
	public void print() {
		System.out.println("나는 사과다.");
	}
}
class Pear extends Fruit {
	public void print() {
		System.out.println("나는 배다.");
	}
}
public class FruitMain{
	public static void main(String[] args) {
		Fruit fruit = new Grape();
		Grape grape = new Grape();
		if(grape instanceof Fruit) {
			System.out.println("true 입니다.");
		}else {
			System.out.println("False 입니다.");
		}
		Fruit fruit2 = new Fruit();
		if(fruit2 instanceof Grape) {
			System.out.println("true 입니다.");
		}else {
			System.out.println("False 입니다.");
		}
		Fruit fAry[] = { new Grape(), new Apple(), new Pear() };
		for (Fruit f : fAry)
			f.print();
	}
}
