package java0116;
class Box {
	private int boxNum;
	private String item;
	public Box(int boxNum, String item) {
		this.boxNum = boxNum;
		this.item = item;
	}
	public int getBoxNum() {
		return boxNum;
	}
	public String toString() {
		return item;
	}
}
public class for_each {
	public static void main(String[] args) {
		Box[] ar = new Box[5];
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, "Fairy-tale book");
		// �迭���� ��ȣ�� 505�� Box�� ã�� �� ���빰�� ����ϴ� �ݺ���
		for (Box e : ar) {
			if (e.getBoxNum() == 505)
				System.out.println(e);
		}
	}
}
