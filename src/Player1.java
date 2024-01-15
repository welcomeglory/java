public class Player1 {
	private int rps;

	public Player1() {
		rps = (int) (Math.random() * 3 + 1);
	}
	
	public Player1(String str) {
		if(str.equals("가위"))
			rps = 1;
		if(str.equals("바위"))
			rps = 2;
		if(str.equals("보"))
			rps = 3;
	}

	public void getResult(Player1 player) {
		if (this.rps == player.rps) {
			System.out.println("비겼습니다.");
			return;
		}
		if (this.rps == 1 && player.rps == 2) {
	         System.out.println("제가 졌습니다.");
	      } else if (this.rps == 1 && player.rps == 3) {
	         System.out.println("제가 이겼습니다.");
	      } else if (this.rps == 2 && player.rps == 1) {
	         System.out.println("제가 이겼습니다.");
	      } else if (this.rps == 2 && player.rps == 3) {
	         System.out.println("제가 졌습니다.");
	      } else if (this.rps == 3 && player.rps == 1) {
	         System.out.println("제가 졌습니다.");
	      } else if (this.rps == 3 && player.rps == 2) {
	         System.out.println("제가 이겼습니다");
	      }
	}
}