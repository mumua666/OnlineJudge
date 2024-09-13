import java.util.Scanner;

public class P1225Pro {

    /**
     * DP
     * Too big number
     * 
     * @param
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(n);
        } else {
            long[] dp = new long[n + 1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            System.out.println(dp[n]);
        }
        sc.close();
    }
}