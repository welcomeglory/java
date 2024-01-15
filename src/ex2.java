
public class ex2 {
	public static int hap(int num1, int num2) {	
		int sum =0;
		for(int i=num1; i<=num2; i++) {
			sum = sum + i;	
		}
		return sum;
	}
//	// 함수 = 기능 = function = method = 메서드
//	public static void hiEveryone(int age) {
//		System.out.println("제 나이는 " + age + "세 입니다.");
//	}
//
//	public static void byeEveryone() {
//		System.out.println("다음에 뵙겠습니다.");
//	}
//
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		System.out.println("저의 키는 " + height + "cm 입니다.");
//	}
//
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;
//	}
//
//	public static double square(double num) {
//		return num * num;
//	}

	public static void main(String[] args) {

//		hiEveryone(10);
//		hiEveryone(10,160.51514654254132);
		
		System.out.println(hap(1,10));
		
	}
}
