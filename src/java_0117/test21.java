package java_0117;
public class test21 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];	
		int num=1;
		for(int i=0; i<arr.length;i++ ) {
			for(int j=0; j<arr.length;j++) {
				arr[i][j]=num++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
