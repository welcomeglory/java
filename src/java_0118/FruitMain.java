package java_0118;
class Fruit {
	public void print() {
		System.out.println("���� �����̴�.");
	}
}
class Grape extends Fruit {
	public void print() {
		System.out.println("���� ������.");
	}
}
class Apple extends Fruit {
	public void print() {
		System.out.println("���� �����.");
	}
}
class Pear extends Fruit {
	public void print() {
		System.out.println("���� ���.");
	}
}
public class FruitMain{
	public static void main(String[] args) {
		Fruit fruit = new Grape();
		Grape grape = new Grape();
		if(grape instanceof Fruit) {
			System.out.println("true �Դϴ�.");
		}else {
			System.out.println("False �Դϴ�.");
		}
		Fruit fruit2 = new Fruit();
		if(fruit2 instanceof Grape) {
			System.out.println("true �Դϴ�.");
		}else {
			System.out.println("False �Դϴ�.");
		}
		Fruit fAry[] = { new Grape(), new Apple(), new Pear() };
		for (Fruit f : fAry)
			f.print();
	}
}
