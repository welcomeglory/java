package java_0124;
import java.util.Scanner;
abstract class Person{
	String name; 
	int age; 
	String address;
	public Person(String name, int age, String address) {
		this.name = name;
		this.age=age;
		this.address=address;	
	}	
	//public abstract double average();
	
}
class Student extends Person {
	String school; 
	String department ;
	int studentID;
	double[] grades;
	
	public Student(String name, int age, String address, String school,	String department, int studentID) {
		super(name,age,address);
		this.school =school; 
		this.department = department ;
		this.studentID = studentID;
		 this.grades = new double[8];
	}
	
	public double average(){
		double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
		
	}
	
}
public class collegeGrade {

	public static void main(String[] args) {
		double[] grades;
		Scanner sc = new Scanner(System.in);
		Student p = new Student("�ȴ���", 20, "����� ���Ǳ�", "������б�","���������а�", 20132222);
		 for (int i = 0; i < 8; i++) {
	            System.out.println((i + 1) + "�б� ���� �� ");
	            double grade = sc.nextDouble();
	            p.grades[i] = grade;
	        }
		
        System.out.println("�̸� : " + p.name);
        System.out.println("���� : " + p.age);
        System.out.println("�ּ� : " + p.address);
        System.out.println("�б� : " + p.school);
        System.out.println("�а� : " + p.department);
        System.out.println("�й� : " + p.studentID);
        System.out.println("8�� �б� ��� ���� : " + p.average());

		}

}








