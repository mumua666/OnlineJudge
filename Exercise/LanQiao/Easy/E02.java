import java.util.Scanner;

public class E02 {

    public static long getSubSet(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return 0;
        } else {
            long[][] dp = new long[sum + 1][arr.length + 1];
            for (int i = 0; i <= sum; i++) {
                for (int j = 0; j <= arr.length; j++) {
                    dp[i][j] = -1;
                }
            }
            return process(arr, 0, 0, dp);
        }
    }

    public static long process(int[] arr, int curSum, int index, long[][] dp) {
        if (dp[curSum][index] != -1) {
            return dp[curSum][index];
        }
        if (index == arr.length) {
            if (curSum % 2 == 0) {
                dp[curSum][index] = 1;
                return 1;
            } else {
                dp[curSum][index] = 1;
                return 0;
            }
        } else {
            dp[curSum][index + 1] = process(arr, curSum, index + 1, dp);
            dp[curSum + arr[index]][index + 1] = process(arr, curSum + arr[index], index + 1, dp);
            return dp[curSum][index + 1] + dp[curSum + arr[index]][index + 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(getSubSet(arr) % 1000000007);
        }
        sc.close();
    }
}