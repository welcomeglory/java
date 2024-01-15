class InstCnt {
	// static 변수 = 정적변수 = 공유변수 = 클래스 변수 = 먼저 한번 올려 공유한다.(method area)
	static int instNum = 0;
	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}
public class ClassVar {
	public static void main(String[] args) {
		//InstCnt cnt1;
		System.out.println(++InstCnt.instNum);

//		InstCnt cnt1 = new InstCnt();
//		InstCnt cnt2 = new InstCnt();
//		InstCnt cnt3 = new InstCnt();
//		
//		System.out.println(++InstCnt.instNum);
//		System.out.println(++cnt1.instNum);
//		System.out.println(++cnt2.instNum);
//		System.out.println(++cnt3.instNum);
		

	}
}
