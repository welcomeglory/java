class AA2{
	//생성자
	//일반 함수와는 조금 다름
	//1. 리턴타입 없음 2. 클래스 이름과 이름이 같은 함수 3. return이 없음
	//용도 : (멤버변수) 초기화 시키는게 목적
	int num;
	int count;
		
	public AA2() {
	}
	public AA2(int num) {
		this.num = num;
	}
	public AA2(int num, int count) {
		this.num = num;
		this.count = count;
	}
	

	public void getNum(int num) {
		this.num = num;
	}
}
public class ex15 {
	public static void main(String[] args) {
	AA aa = new AA();
		System.out.println(aa);		
		AA aa2 = new AA(5,10);
		System.out.print(aa2.getNum());
		
	//	System.out.print(aa2.getNum());	
		
	}
}
