package java_0124;

import java.math.BigInteger;

public class bigInteger {
	public static void main(String[] args) {
		String strNumber = "78720646226947352489";

        // ���ڿ��� BigInteger�� ��ȯ
        BigInteger bigIntegerNumber = new BigInteger(strNumber);

        // 9�� ���� ������ ���
        BigInteger remainder = bigIntegerNumber.remainder(BigInteger.valueOf(9));

        System.out.println("9�� ���� ������: " + remainder);
		}


}
