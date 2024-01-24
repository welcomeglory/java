package java_0123;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 3 };
		//int[] stk = {};
		int[] stk =new int[0];
		int index = 0;
		for (int i = 0; i < arr.length;) {
			if (stk.length == 0) {
				//stk = new int[1];
				stk[index++] = arr[i];
				i++;
				System.out.println(stk.length);
			} else {
				if (stk[stk.length - 1] < arr[i]) {
					stk = Arrays.copyOf(stk, stk.length + 1);
					stk[stk.length - 1] = arr[i];
					i++;
					System.out.println(stk.length);

				} else {
					stk = Arrays.copyOf(stk, stk.length - 1);
					index--;
					if (index < 0) {
						index = 0;
						System.out.println(stk.length);
					}
				}
				//System.out.println(stk[i]);
			}
			System.out.println(Arrays.toString(stk));
		}
	}
}
