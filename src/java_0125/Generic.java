package java_0125;
//class Box<T> {
//	private T ob;
//	public void set(T o) {
//		ob = o;
//	}
//	public T get() {
//		return ob;
//	}
//}
class Apple {
	public String toString() {
		return "I am an apple.";
	}
}
class Orange {
	public String toString() {
		return "I am an orange.";
	}
}
public class Generic {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		//������ �ڽ��� ��´�.
		aBox.set(new Apple());
		oBox.set(new Orange());
		Apple apple = aBox.get();// ����� �����µ� �� ��ȯ�� �����ʴ´�.
		Orange orange = oBox.get();// �������� �����µ� �� ��ȯ�� �����ʴ´�.
		System.out.println(apple);
		System.out.println(orange);
	}
}
