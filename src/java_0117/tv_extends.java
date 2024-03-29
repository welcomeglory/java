package java_0117;
//다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은
//ColorTV 클래스를 작성하라. 
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
		super(size);//부모클래스(TV)생성자호출
		this.color = color;
	}
	public void printProperty() {
		System.out.print(super.getSize()+"인치 "+ this.color + "컬러");
	}
}
public class tv_extends {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		//32인치 1024컬러
		myTV.printProperty();
	}
}