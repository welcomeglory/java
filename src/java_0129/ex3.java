package java_0129;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);//입력해야 하므로 Scanner가져옴
	    String nickname;//입력할 값을 변수선언한다.
	    for(int i=0; i<5;i++) {//5개의 별명을 입력받아 저장하므로 5로 설정후 반복문
	    	System.out.println((i+1)+"번째 별명을 입력하세요.");
	    	nickname = sc.next();
	    	list.add(nickname);//차례로 입력한 별명이 저장	    	
	    }
	    String theLongest = list.get(0);//배열중 하나를 기준으로 잡고
	    for(int i=0; i<list.size();i++) {
	    	if(list.get(i).length()>theLongest.length())//문자열의 길이를 비교
	    		theLongest = list.get(i);//더 높은 수를 theLongest변수에 저장
	    }
	    System.out.println("가장 긴 별명은 " +theLongest+"입니다!");
		

	}

}
