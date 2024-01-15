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



//�Լ��� static�� ������ Ŭ���������� ���� �����ϴ�.
//static�� ��ü �������� ���� �����ϴ�.
class ClassMethod {
	public static void main(String[] args) {
		NumberPrinter.showInt(20);
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);

		np.setMyNumber(75);
		np.showMyNumber();

	}
}
