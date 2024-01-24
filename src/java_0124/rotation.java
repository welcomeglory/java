package java_0124;
import java.util.Scanner;
public class rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			String str1 = str.substring(i) + str.substring(0, i);
			System.out.println(str1);
		}
		System.out.println(str);
	}
}
