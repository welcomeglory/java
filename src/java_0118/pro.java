package java_0118;
public class pro {
	public static void main(String[] args) {
		int[] n = { 6, 2, 3, 4, 5 };
		int answer = 0;
		int a=0;
		for (int i = 0; i < n.length-1; i++) {
			if (n[i] < n[i + 1]) 
				a = n[i + 1];
			else if(n[i] >= n[i + 1])
				a = n[i];
			System.out.println(a);
		}
		System.out.println(a);
	}
}