package java_0116;

public class arr2_1 {
	public static void main(String[] args) {
//		int [][] arr = new int[3][3];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print("(" + i + ", " + j + ")");
//			}
//			  System.out.println();
//		}
		int[][] arr = new int[4][4];
		int num=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=num++;
				System.out.print( arr[i][j] + "\t");
			}
			System.out.println();
		}

//		int[][] arr = { 
//				{0 0 , 0 1 , 0 2},
//				{1 0, 1 1, 1 2},
//				{2 0, 2 1, 2 2}
//		};
//		// 배열의 구조대로 내용 출력
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
	}
}
