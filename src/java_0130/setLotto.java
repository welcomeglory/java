package java_0130;
import java.util.HashSet;
import java.util.Set;

public class setLotto {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();// set笼钦 积己(按眉积己)
		while (lotto.size() < 6) {
			int num = (int) (Math.random() * 45) + 1; // 1~45
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}




