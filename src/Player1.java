public class Player1 {
	private int rps;

	public Player1() {
		rps = (int) (Math.random() * 3 + 1);
	}
	
	public Player1(String str) {
		if(str.equals("����"))
			rps = 1;
		if(str.equals("����"))
			rps = 2;
		if(str.equals("��"))
			rps = 3;
	}

	public void getResult(Player1 player) {
		if (this.rps == player.rps) {
			System.out.println("�����ϴ�.");
			return;
		}
		if (this.rps == 1 && player.rps == 2) {
	         System.out.println("���� �����ϴ�.");
	      } else if (this.rps == 1 && player.rps == 3) {
	         System.out.println("���� �̰���ϴ�.");
	      } else if (this.rps == 2 && player.rps == 1) {
	         System.out.println("���� �̰���ϴ�.");
	      } else if (this.rps == 2 && player.rps == 3) {
	         System.out.println("���� �����ϴ�.");
	      } else if (this.rps == 3 && player.rps == 1) {
	         System.out.println("���� �����ϴ�.");
	      } else if (this.rps == 3 && player.rps == 2) {
	         System.out.println("���� �̰���ϴ�");
	      }
	}
}