package java_0124;

import java.math.BigInteger;

public class bigInteger {
	public static void main(String[] args) {
		String strNumber = "78720646226947352489";

        // 문자열을 BigInteger로 변환
        BigInteger bigIntegerNumber = new BigInteger(strNumber);

        // 9로 나눈 나머지 계산
        BigInteger remainder = bigIntegerNumber.remainder(BigInteger.valueOf(9));

        System.out.println("9로 나눈 나머지: " + remainder);
		}


}
