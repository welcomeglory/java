
public class ex12 {

	public static void main(String[] args) {
		double a=avg(100, 100, 100);
		char grade = grade(avg(90, 80, 100));
		
		System.out.println(grade +  " 입니다."); // 수입니다.
		getCircleArea(10);
	}
	public static char grade(double avg1) {
		char grade=0;
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
	public static void getCircleArea(double r) {
		final double PI =3.14;
		System.out.println(PI*r*r);
	}
	public static double avg(double kor, double math, double eng) {
		return (kor+math+eng)/3.0;		
	}

}
