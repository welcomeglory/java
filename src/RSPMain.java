import java.util.Scanner;

public class RSPMain {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보를 입력하세요.");
		String rps = sc.next();

		Player2 user = new Player2(rps);
		Player2 computer = new Player2();

		computer.getResult(user);
		
		System.out.println("y? n?");
		char ch = sc.next().charAt(0);
		
		if(ch == 'N' || ch == 'n')
			break;
		}

	}

}
