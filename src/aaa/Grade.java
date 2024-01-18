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
		System.out.println("없는 과목입니다.");
	}
	public void run1() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			if(course == null || score == null) {
				System.out.println("과목과 성적 데이터가 없습니다.");
				return;
			}
			System.out.print("과목 이름 >> ");
			String temp = scanner.next();
			if(temp.equals("그만")) {
				scanner.close();
				return;
			}
			printScore1(temp);
		}			
	}
}