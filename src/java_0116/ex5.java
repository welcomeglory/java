package java_0116;
public class ex5 {
	public static void main(String[] args) {
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 1000) + 1;
			if (num[i] % 3 == 0) {
				System.out.println(num[i]);
			}
		}
	}
}
