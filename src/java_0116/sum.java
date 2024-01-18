package java_0116;
public class sum {
	public static int sumOfAry(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = sumOfAry(ar);
		System.out.println(sum);
	}
}
