package java_0130;
import java.util.HashSet;
import java.util.Set;

public class setLotto {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();// set���� ����(��ü����)
		while (lotto.size() < 6) {
			int num = (int) (Math.random() * 45) + 1; // 1~45
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}




