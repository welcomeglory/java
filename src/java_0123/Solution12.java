package java_0123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution12 {
	public static void main(String[] args) {
		int l = 5;
		int r = 555;
		List<Integer> list = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			String str = i + "";
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '0' || str.charAt(j) == '5') {
					count++;
				}
			}
			if (count == str.length()) {
				list.add(i);
			}
		}
		int[] empty = { -1 };
		if(list.size()==0)			
			System.out.println(Arrays.toString(empty));
		System.out.println(list);
//		int[] answer = list.stream().mapToInt(i -> i).toArray();
//		int[] empty = { -1 };
//		if (answer.length == 0)
//			System.out.println(Arrays.toString(empty));
//		System.out.println(Arrays.toString(answer));
	}
}