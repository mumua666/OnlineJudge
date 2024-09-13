import java.util.Scanner;

public class Code2021_04_02Pro {

    public static int[][] getSumArr(int[][] arr, int n) {
        int[][] sumArr = new int[n][n];
        sumArr[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) {
            sumArr[i][0] = sumArr[i - 1][0] + arr[i][0];
        }
        for (int i = 1; i < n; i++) {
            sumArr[0][i] = sumArr[0][i - 1] + arr[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                sumArr[i][j] = arr[i][j] + sumArr[i - 1][j] + sumArr[i][j - 1] - sumArr[i - 1][j - 1];
            }
        }
        return sumArr;
    }

    public static double getMean(int[][] sumArr, int rowStart, int rowEnd, int colStart, int colEnd) {
        int count = (rowEnd - rowStart + 1) * (colEnd - colStart + 1);
        int sum;
        if (rowStart == 0 && colStart == 0) {
            sum = sumArr[rowEnd][colEnd];
        } else if (rowStart == 0) {
            sum = sumArr[rowEnd][colEnd] - sumArr[rowEnd][colStart - 1];
        } else if (colStart == 0) {
            sum = sumArr[rowEnd][colEnd] - sumArr[rowStart - 1][colEnd];
        } else {
            sum = sumArr[rowEnd][colEnd] - sumArr[rowStart - 1][colEnd] - sumArr[rowEnd][colStart - 1]
                    + sumArr[rowStart - 1][colStart - 1];
        }
        return sum * 1.0 / count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, L, r, t;
        n = sc.nextInt();
        L = sc.nextInt();
        r = sc.nextInt();
        t = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] sumArr = getSumArr(arr, n);

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.printf("%d ", sumArr[i][j]);
        // }
        // System.out.println();
        // }

        int rowStart, rowEnd, colStart, colEnd;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowStart = Math.max(0, i - r);
                rowEnd = Math.min(n - 1, i + r);
                colStart = Math.max(0, j - r);
                colEnd = Math.min(n - 1, j + r);
                if (getMean(sumArr, rowStart, rowEnd, colStart, colEnd) <= t) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
