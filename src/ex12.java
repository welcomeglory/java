
public class ex12 {

	public static void main(String[] args) {
		double a=avg(100, 100, 100);
		char grade = grade(avg(90, 80, 100));
		
		System.out.println(grade +  " �Դϴ�."); // ���Դϴ�.
		getCircleArea(10);
	}
	public static char grade(double avg1) {
		char grade=0;
		if (avg1 >= 90)
			grade = '��';
		else if (avg1 >= 80)
			grade = '��';
		else if (avg1 >= 70)
			grade = '��';
		else if (avg1 >= 60)
			grade = '��';
		else
			grade = '��';
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
