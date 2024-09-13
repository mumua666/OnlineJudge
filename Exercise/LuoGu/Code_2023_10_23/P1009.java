package Code_2023_10_23;

import java.math.BigInteger;
import java.util.Scanner;

public class P1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        BigInteger sum = BigInteger.ZERO;
        BigInteger frac = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            frac = frac.multiply(BigInteger.valueOf(i));
            sum = sum.add(frac);
        }
        System.out.println(sum);
    }
}
