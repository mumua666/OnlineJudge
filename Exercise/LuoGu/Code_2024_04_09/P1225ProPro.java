import java.math.BigInteger;
import java.util.Scanner;

public class P1225ProPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(n);
        } else {
            BigInteger[] dp = new BigInteger[n + 1];
            dp[1] = BigInteger.valueOf(1);
            dp[2] = BigInteger.valueOf(2);
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1].add(dp[i - 2]);
            }
            System.out.println(dp[n]);
        }

        sc.close();
    }
}