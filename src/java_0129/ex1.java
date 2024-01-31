package java_0129;
import java.util.ArrayList;
import java.util.List;
// 원 객체 생성?
public class ex1 {
	public static void main(String[] args) {
		List<String> list  = new ArrayList<>();
		for(int i=1; i<=10; i++)
			System.out.println("반지름이 "+i+"인 원 넓이 : "+i*i*Math.PI);
		}
}
