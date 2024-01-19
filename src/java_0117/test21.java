package java_0117;

public class test21 {
	public static void main(String[] args) {
		String str1 = "AbcAbcA";
		String str2 = "AAA";
		int answer = 0;
		for (int i = 0; i < str1.length(); i++) {
			if ((str1.substring(i, i + 1)).equals(str2.substring(0, 1))) {
				for (int j = 0; j < str2.length(); j++) {
					if ((str1.substring(i + j, i + j + 1)).equals(str2.substring(j, j + 1)))
						answer = 1;
				}
			}
		}
		System.out.println(answer);
	}
}
