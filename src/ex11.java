import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
//     System.out.println("국어 점수를 넣으시오.");
//     int kor = sc.nextInt();
//     System.out.println("영어 점수를 넣으시오.");
//     int eng = sc.nextInt();
//     System.out.println("국어 점수는 =" + kor + "입니다.");
//     System.out.println("영어 점수는 =" + eng + "입니다.");
//     System.out.println("정수를 입력하시오:");
//     int num = sc.nextInt();
//     if(num>0)    
//     System.out.println("양수입니다.");
//     else if(num <0)
//     System.out.println("음수입니다.");
//     else
//    	 System.out.println("0입니다.");

		while (true) {
			//Scanner:참조형
			Scanner sc = new Scanner(System.in);
			System.out.print("국어 점수를 입력하시오:");
			int kor = sc.nextInt();
			System.out.print("영어 점수를 입력하시오:");
			int eng = sc.nextInt();
			System.out.print("수학 점수를 입력하시오:");
			int math = sc.nextInt();
			double avg = (kor + eng + math) / 3.0;
			if (avg >= 90)
				System.out.println("수 입니다.");
			else if (avg >= 80)
				System.out.println("우 입니다.");
			else if (avg >= 70)
				System.out.println("미 입니다.");
			else if (avg >= 60)
				System.out.println("양 입니다.");
			else
				System.out.println("가 입니다.");
			System.out.print("계속하시겠습니까?");
			String str = sc.next();
			if (str.equals("n")||str.equals("N"))
				break;
		}
	}
}
