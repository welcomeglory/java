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
		//과일을 박스에 담는다.
		aBox.set(new Apple());
		oBox.set(new Orange());
		Apple apple = aBox.get();// 사과를 꺼내는데 형 변환을 하지않는다.
		Orange orange = oBox.get();// 오렌지를 꺼내는데 형 변환을 하지않는다.
		System.out.println(apple);
		System.out.println(orange);
	}
}
