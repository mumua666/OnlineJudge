import java.util.Scanner;

public class E04 {

    public static double getMinTime(int[] arrX, int[][] flash, int maxHeight) {
        double[][] dp = new double[arrX.length + 1][maxHeight + 1];
        for (int i = 0; i <= arrX.length; i++) {
            for (int j = 0; j <= maxHeight; j++) {
                dp[i][j] = -1;
            }
        }

        return arrX[0] / 1.0 + process(arrX, flash, 0, 0, dp);
    }

    public static double process(int[] arrX, int[][] flash, int index, int height, double[][] dp) {
        if (dp[index][height] != -1) {
            return dp[index][height];
        }
        if (index == arrX.length - 1) {
            dp[index][height] = height / 1.3;
            return dp[index][height];
        } else {
            int disX = arrX[index + 1] - arrX[index];
            double time1 = disX / 1.0 + process(arrX, flash, index + 1, height, dp);

            int disY = flash[index][0] - height;
            double time = disY > 0 ? disY / 0.7 : -disY / 1.3;
            double time2 = time + process(arrX, flash, index + 1, flash[index][1], dp);

            dp[index][height] = Math.min(time1, time2);
            return dp[index][height];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrX = new int[n];
        for (int i = 0; i < n; i++) {
            arrX[i] = sc.nextInt();
        }

        int[][] flash = new int[n - 1][2];
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            flash[i][0] = sc.nextInt();
            maxHeight = maxHeight > flash[i][0] ? maxHeight : flash[i][0];
            flash[i][1] = sc.nextInt();
            maxHeight = maxHeight > flash[i][1] ? maxHeight : flash[i][1];
        }
        System.out.printf("%.2f\n", getMinTime(arrX, flash, maxHeight));

        sc.close();
    }
}