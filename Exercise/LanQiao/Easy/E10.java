import java.math.BigInteger;
import java.util.Scanner;

public class E10 {

    public static BigInteger jiechen(long n) {
        BigInteger sum = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigSum = BigInteger.ZERO;
        for (long i = 1; i <= 202320232023L; i++) {
            System.out.println(i);
            bigSum = bigSum.add(jiechen(i));
        }
        System.out.println(bigSum.mod(BigInteger.valueOf(1000000000)));
        sc.close();
    }
}