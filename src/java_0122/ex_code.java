package java_0122;
public class ex_code {
	public static void main(String[] args) {
		String answer = "";
		String code = "abc1abc1abc";
		int mode = 0;
		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '1') 
			mode = 1 - mode;
			else if (i % 2 == mode)
				answer += code.charAt(i);
		}
		//System.out.println("".equals(answer) ? "EMPTY" : answer);
	}
}
