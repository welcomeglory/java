package java_0201;

class StringPrint {
	void display(String s) {

		for (int i = 1; i <= 2; i++) {
			System.out.print(Thread.currentThread().getName() + ":");
			System.out.print(s);
			System.out.println();
		}
		System.out.println();

	}
}

class PrintThread extends Thread {
	private StringPrint sp;
	private String str;

	public PrintThread(String s, StringPrint sp) {
		this.str = s;
		this.sp = sp;
	}

	@Override
	public void run() {
		sp.display(str);
	}
}

public class theadMain2 {
	public static void main(String[] args) {
		StringPrint sp = new StringPrint();
        Thread th1 = new PrintThread("1번",sp);
        Thread th2 = new PrintThread("2번",sp);
        Thread th3 = new PrintThread("3번",sp);
        Thread th4 = new PrintThread("4번",sp);
        Thread th5 = new PrintThread("5번",sp);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
		

	}
}
