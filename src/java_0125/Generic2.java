package java_0125;
//class DBox<L, R> {
//	private L left; // ���� ���� ����
//	private R right; // ������ ���� ����
//	public void set(L o, R r) {
//		left = o;
//		right = r;
//	}
//	@Override
//	public String toString() {
//		return left + " & " + right;
//	}
//}
public class Generic2 {
	public static void main(String[] args) {
		DBox<Apple, Orange> fruitbox = new DBox<Apple, Orange>();

		fruitbox.set(new Apple(), new Orange());
		System.out.println(fruitbox);
	}
}


