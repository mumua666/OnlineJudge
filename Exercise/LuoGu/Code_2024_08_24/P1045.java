import java.math.BigInteger;
import java.util.Scanner;

public class P1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // calculate P =( 2^p - 1 )
        int p = sc.nextInt();
        String bitsStr = Integer.toBinaryString(p);
        BigInteger P = BigInteger.ONE;
        for (int i = 0; i < bitsStr.length(); i++) {
            P = P.multiply(P);
            char bit = bitsStr.charAt(i);
            if (bit == '1') {
                P = P.multiply(BigInteger.TWO);
            }
        }
        P = P.subtract(BigInteger.ONE);

        String numStr = P.toString();
        System.out.println(numStr.length());
        int diff = 500 - numStr.length();
        for (int i = 1; i <= 500; i++) {
            if (i <= diff) {
                System.out.print(0);
            } else {
                System.out.print(numStr.charAt(i - diff - 1));
            }
            if (i % 50 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
