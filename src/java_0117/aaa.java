package java_0117;
class solution12 {
    public String solution12(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string;
        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;     
    }
}
public class aaa{
    public static void main(String[] args) {
    	solution12 sol = new solution12();
    	System.out.println(sol.solution12("He11oWor1d","lloWorl",2));
    	
    }

	private static char[] solution12(String string, String string2, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}