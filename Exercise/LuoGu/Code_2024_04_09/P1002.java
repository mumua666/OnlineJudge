import java.util.Scanner;

public class P1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                boolean isDanger = i == x && j == y ||
                        i == x - 2 && (j == y - 1 || j == y + 1) ||
                        i == (x - 1) && (j == y - 2 || j == y + 2) ||
                        i == (x + 1) && (j == y - 2 || j == y + 2) ||
                        i == (x + 2) && (j == y - 1 || j == y + 1);
                if (isDanger) {
                    dp[i][j] = -1;
                }
            }
        }

        for (int i = 1; i <= m; i++) {
            if (dp[0][i] != -1) {
                dp[0][i] = dp[0][i - 1] == -1 ? 0 : 1;
            }
        }
        for (int j = 1; j <= n; j++) {
            if (dp[j][0] != -1) {
                dp[j][0] = dp[j - 1][0] == -1 ? 0 : 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (dp[i][j] != -1) {
                    if (dp[i][j - 1] != -1) {
                        dp[i][j] += dp[i][j - 1];
                    }
                    if (dp[i - 1][j] != -1) {
                        dp[i][j] += dp[i - 1][j];
                    }
                }
            }
        }
        System.out.println(dp[n][m]);
        sc.close();
    }
}