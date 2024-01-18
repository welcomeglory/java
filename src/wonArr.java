class MoneyArr {
	int[] count = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	int won;
	int j=0;
	public MoneyArr(int won) {
		this.won = won;
	}
	public void show() {
		for(int i=0; i< count.length;i++) {
			if(won%count[i] == 0) {
				j=won%count[i];
			System.out.println(count[i]+"¿ø"+j+"°³");
			}
		}		
	}
}

public class wonArr {
	public static void main() {
		MoneyArr mArr = new MoneyArr(126000);
		mArr.show();
	}
}
