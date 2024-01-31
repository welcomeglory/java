package java_0129;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		List<Integer> listnum = new ArrayList<>();
		Scanner sc = new Scanner(System.in);//입력해야 하므로 Scanner가져옴
	    int num=0;//입력할 값을 변수선언한다.
	    while(num!=-1) {
	    	System.out.println("양의 정수를 입력하시오.");
	    	num = sc.nextInt();
	    	listnum.add(num);//차례로 숫자입력
	    }
	    Integer theBigest = listnum.get(0);//배열중 하나를 기준으로 잡고
	    for(int i=0; i<listnum.size();i++) {
	    	if(listnum.get(i)>theBigest)//숫자 비교
	    		theBigest = listnum.get(i);//더 높은 수를 theLongest변수에 저장
	    }
	    System.out.println("가장 큰 수는 " +theBigest+"입니다!");
		

	}

}
