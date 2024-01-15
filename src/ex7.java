public class ex7 {
//  원넓이
//	public static double getCircleArea(double radius) {
//		final double PI = 3.14;
//		return PI * radius * radius;
//	}
//  사각형넓이
//	public static double getRecArea(double width, double height) {
//
//		return width * height;
//	}
	// 별찍기 함수
	public static void starPrint(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

//	*****
//	 ****
//	  ***
//	   **
//	    *	
//	public static void starPrint2(int a) {
//		for (int i = 1; i <= a; i++) {
//			for (int j = 1; j < i; j++)
//				System.out.print(" ");
//			for (int j = 1; j <= a+1-i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//		
//	}
	// 구구단
	public static void printGuGudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}

//	*****
//	 ****
//	  ***
//	   **
//	    *	
	public static void starPrint2(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			for (int j = 1; j <= a + 1 - i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

	public static char getGrade(double avg1) {
		char grade = 0;
		if (avg1 >= 90)
			grade = '수';
		else if (avg1 >= 80)
			grade = '우';
		else if (avg1 >= 70)
			grade = '미';
		else if (avg1 >= 60)
			grade = '양';
		else
			grade = '가';
		return grade;

	}

	public static int getHap(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static int get57(int num1, int num2) {
		int count = 0;
		for (int i = num1; i <= num2; i++) {
			if ((i % 5) == 0 && (i % 7) == 0)
				count++;
		}
		return count;
	}

	public static void getRecArea(double width, double height) {
		System.out.println(width * height);
	}

	public static void getRecCirlce(double radius) {
		final double PI = 3.14;
		System.out.println(PI * radius * radius);
	}

	public static void getTriangleArea(double base, double height) {
		System.out.println(0.5 * base * height);
	}

	public static void getSeason(int month) {
		switch (month) {
		case 3:	case 4:	case 5:
			System.out.println("봄입니다.");
			break;
		case 6:	case 7:	case 8:
			System.out.println("여름입니다.");
			break;
		case 9:	case 10: case 11:
			System.out.println("가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울입니다.");
			break;
		default:
			System.out.println("잘못입력하였습니다.");
		}
	}
	public static void main(String[] args) {
		int month = 4;
		getSeason(3);// 봄입니다.
		getSeason(12);// 겨울 입니다.
	}

}
