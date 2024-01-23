package java_0123;

import java.util.Arrays;

public class ex1 {

	public static void main(String[] args) {		
		int[] arr = {1, 4, 2, 5, 3};
	     int[] stk = {};
	     System.out.println(Arrays.toString(stk));
	           // Enhanced for문을 사용하여 값을 복사
	        int index = 0;
	        for (int number : arr) {
	        	System.out.println(stk[index]);
	      stk[index++] = number;
	        }
	        	//System.out.println(index+"\t"+stk[index-1]);
	  	      //System.out.println(Arrays.toString(stk));
	        }      	
	     // System.out.println(Arrays.toString(stk));
	}

