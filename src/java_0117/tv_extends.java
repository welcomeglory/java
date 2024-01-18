package java_0117;
//���� main() �޼ҵ�� ���� ����� �����Ͽ� TV�� ��ӹ���
//ColorTV Ŭ������ �ۼ��϶�. 
class TV {
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}
class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);//�θ�Ŭ����(TV)������ȣ��
		this.color = color;
	}
	public void printProperty() {
		System.out.print(super.getSize()+"��ġ "+ this.color + "�÷�");
	}
}
public class tv_extends {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		//32��ġ 1024�÷�
		myTV.printProperty();
	}
}