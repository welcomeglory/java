package java_0118;
class MoneyArr {
	int[] won = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	int money;
	public MoneyArr(int money) {
		this.money = money;
	}
	public void show() {
		for (int i = 0; i < won.length; i++) {
			int count = money / won[i];
			System.out.println(won[i] + "¿ø" + count + "°³");
			money -= won[i] * count;
		}
	}
}
public class wonArr {
	public static void main(String[] args) {
		MoneyArr mArr = new MoneyArr(126000);
		mArr.show();
	}
}
