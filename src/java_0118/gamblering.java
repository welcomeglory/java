package java_0118;

import java.util.Scanner;

class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	public void gGame () {
		int[] a = new int[3];
		System.out.println("["+name+"]:");
		for(int i=0; i<3;i++) {
			a[i] = (int)(Math.random()*3)+1;
			System.out.print(a[i]+"\t");
			if(a[0]==a[1]) {
				if(a[1]==a[2])
					System.out.println(name+"���� �̰���ϴ�.");				
			}	
			else 
				System.out.println("�ƽ�����!");
		}
	}
}
public class gamblering {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1��° ���� �̸�>>");
		String fir_name = sc.next();
		System.out.print("2��° ���� �̸�>>");
		String sec_name = sc.next();
		Person person = new Person(fir_name);
		Person person2 = new Person(sec_name);	
		person.gGame();
		person2.gGame();
		sc.close();		
	}
}