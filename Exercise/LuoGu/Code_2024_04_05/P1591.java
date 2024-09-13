import java.math.BigInteger;
import java.util.Scanner;

public class P1591 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            BigInteger res = BigInteger.valueOf(1);
            for (int i = 2; i <= n; i++) {
                res = res.multiply(BigInteger.valueOf(i));
            }
            int cntA = 0;
            BigInteger big10 = BigInteger.valueOf(10);
            while (!res.equals(BigInteger.ZERO)) {
                int mod10 = res.mod(big10).intValue();
                if (mod10 == a) {
                    cntA++;
                }
                res = res.divide(big10);
            }
            System.out.println(cntA);
        }

        sc.close();
    }
}
