package aaa;
import java.util.Scanner;
public class Grade{
	private String course[];
	private int score[];
	public void setCourse1(String[] course) {
		this.course = course;
	}
	public void setScore1(int[] score) {
		this.score = score;
	}
	public void printScore1(String course) {
		for(int i = 0; i < this.course.length; i++) {
			if(course.equals(this.course[i])) {
				System.out.println(score[i]);
				return;
			}
		}
		System.out.println("���� �����Դϴ�.");
	}
	public void run1() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			if(course == null || score == null) {
				System.out.println("����� ���� �����Ͱ� �����ϴ�.");
				return;
			}
			System.out.print("���� �̸� >> ");
			String temp = scanner.next();
			if(temp.equals("�׸�")) {
				scanner.close();
				return;
			}
			printScore1(temp);
		}			
	}
}