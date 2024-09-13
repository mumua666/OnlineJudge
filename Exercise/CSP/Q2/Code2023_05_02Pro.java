import java.util.Scanner;

public class Code2023_05_02Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] q = new int[n][d];
        int[][] kt = new int[d][n];
        int[][] v = new int[n][d];
        int[] w = new int[n];
        // 获取用户输入
        for (int j = 0; j < n; j++) {
            for (int l = 0; l < d; l++) {
                q[j][l] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            for (int l = 0; l < d; l++) {
                kt[l][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            for (int l = 0; l < d; l++) {
                v[j][l] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        long[][] temp = new long[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < n; k++) {
                    temp[i][j] += (long) v[k][j] * kt[i][k];
                }
            }
        }

        long[][] ans = new long[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < d; k++) {
                    ans[i][j] += q[i][k] * temp[k][j];
                }
                ans[i][j] *= w[i];
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
