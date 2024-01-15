package aaa;

public class ex1 {

	public static void main(String[] args) {
//		*****
//		1****
//		11***
//		111**
//		1111*
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++)
				System.out.print("1");
			for (int j = 5; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
	}
}

//	     *
//	    ***
//	   *****
//	  *******
//	 *********
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j > i; j--)
//				System.out.print(" ");
//			for (int j = 1; j <= i; j++)
//				System.out.print("*");
//			for (int j = 1; j < i; j++)
//				System.out.print("*");			
//			System.out.println();
//		}
//	}
//}
//		1. 1부터 100까지의 합을 구하시오.
//		int sum=0;
//		for(int i=1; i<=100;i++)
//			 sum = sum + i;
//		System.out.println(sum);
//		2. 1부터 100까지의 짝수의 합은?
//		int sum=0;
//		for(int i=1; i<=100;i++) {
//			if(i%2==0)
//			 sum = sum + i;
//		}
//		System.out.println(sum);
//		3. 11의 배수 이자 7의 배수인 첫번째 숫자는?
//		for (int i = 1; i <= 100; i++) {
//			if ((i % 11 != 0) && (i % 7 != 0))
//				continue;
//			System.out.println(i);
//			break;
//		}
//		4. 구구단을 찍으시오.
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++)
//				System.out.println(i + " x " + j + " = " + (i * j));
//		}
//		5.짝수 단만 나오게 구구단을 찍으시오.
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++)
//				if (i % 2 == 0)
//					System.out.println(i + " x " + j + " = " + (i * j));
//		}		
//		6.이중 최대값을 구하시오.
//		int num1=-6, num2 = 10, num3=1;
//		int i=num1;
//		if(i<=num2)
//			i=num2;
//		if(i<=num3)
//			i=num3;
//		System.out.println(i);
//		7. 별 찍기
//		*
//		**
//		***
//		****
//		*****
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//		*****
//		****
//		***
//		**
//		*
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--)
//				System.out.print("*");
//			System.out.println();
//		}
//	}
//}

//		    *
//		   **
//		  ***
//		 ****
//		*****    
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j > i; j--)
//				System.out.print(" ");
//			for (int j = 1; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//		*****
//		 ****
//		  ***
//		   **
//		    *
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j < i; j++)
//				System.out.print(" ");
//			for (int j = 5; j >= i; j--)
//				System.out.print("*");
//			System.out.println();
//		}
//      *****
//       ****
//        ***
//         **
//          *		
//	int i = 1;i<=5;i++){
//		for (int j = 1; j < i; j++)
//			System.out.print(" ");
//		for (int j = 5; j >= i; j--)
//			System.out.print("*");
//		System.out.println();
//	}
//}
