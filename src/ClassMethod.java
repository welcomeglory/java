class NumberPrinter {
	private int myNum = 0;

	static void showInt(int n) {
		System.out.println(n);
	}

	static void showDouble(double n) {
		System.out.println(n);
	}

	void setMyNumber(int n) {
		myNum = n;
		System.out.println(myNum);
	}

	void showMyNumber() {
		showInt(myNum);
	}
}



//함수도 static이 있으면 클래스명으로 접근 가능하다.
//static은 객체 생성없이 접근 가능하다.
class ClassMethod {
	public static void main(String[] args) {
		NumberPrinter.showInt(20);
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);

		np.setMyNumber(75);
		np.showMyNumber();

	}
}
