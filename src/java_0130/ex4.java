package java_0130;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
class Student {
	String name;
	String major;
	int idnum;
	double gradeavg;
	public Student(String name, String major, int idnum, double gradeavg) {
		this.name = name;
		this.major = major;
		this.idnum = idnum;
		this.gradeavg = gradeavg;
	}
	public void findStudent(String name) {
		if (name.equals(this.name))
			System.out.println(this.name + "," + this.major + "," + this.idnum + "," + this.gradeavg);
	}
	public void showInfo() {
		System.out.println("----------------------------------");
		System.out.println("이름: " + name);
		System.out.println("학과: " + major);
		System.out.println("학번: " + idnum);
		System.out.println("학점평균: " + gradeavg);
	}
}

public class ex4 {
	public static void main(String[] arge) {
		List<Student> slist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			String input = sc.next();
			StringTokenizer info = new StringTokenizer(input, ",");
			String name = info.nextToken();
			String major = info.nextToken();
			int idnum = Integer.valueOf(info.nextToken());
			double gradeavg = Double.valueOf(info.nextToken());
			slist.add(new Student(name, major, idnum, gradeavg));
		}
		for(Student student : slist ) {
			student.showInfo();
	}

		while (true) {
			System.out.println("학생이름을 입력하시오.");
			System.out.print(">>");
			String name = sc.next();
			if (name.equals("그만"))
				break;
			for (int i = 0; i < slist.size(); i++) {
				Student s = slist.get(i);
				s.findStudent(name);
			}
		}
	}
}
