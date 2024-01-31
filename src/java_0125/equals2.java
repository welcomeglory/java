package java_0125;
class Circle7 {
	int x;	int y;	int r;
	public  Circle7(int x, int y, int r) {
		this.x=x;		this.y=y;		this.r=r;
	}
	@Override
	public String toString() {
        return "Circle("+x+","+y+")반지름"+r;
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
		Circle7 a = new Circle7(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
		Circle7 b = new Circle7(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else 
			System.out.println("서로 다른 원");
	}
}
	