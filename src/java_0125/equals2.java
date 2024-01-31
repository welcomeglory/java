package java_0125;
class Circle7 {
	int x;	int y;	int r;
	public  Circle7(int x, int y, int r) {
		this.x=x;		this.y=y;		this.r=r;
	}
	@Override
	public String toString() {
        return "Circle("+x+","+y+")������"+r;
    }
	@Override
    public boolean equals(Object obj) {
       Circle7 other = (Circle7) obj;
       if(x == other.x && y == other.y)
    	   return true;
       return false;
    }
}
public class equals2 {
	public static void main(String[] args) {
		Circle7 a = new Circle7(2, 3, 5); // �߽� (2, 3)�� ������ 5�� ��
		Circle7 b = new Circle7(2, 3, 30); // �߽� (2, 3)�� ������ 30�� ��
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b))
			System.out.println("���� ��");
		else 
			System.out.println("���� �ٸ� ��");
	}
}
	