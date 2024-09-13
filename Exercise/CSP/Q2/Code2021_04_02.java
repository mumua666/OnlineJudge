import java.util.Scanner;

public class Code2021_04_02 {

    public static double getMean(int[][] arr, int rowStart, int rowEnd, int colStart, int colEnd) {
        int count = 0, sum = 0;
        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                count++;
                sum += arr[i][j];
            }
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

        int rowStart, rowEnd, colStart, colEnd;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowStart = Math.max(0, i - r);
                rowEnd = Math.min(n - 1, i + r);
                colStart = Math.max(0, j - r);
                colEnd = Math.min(n - 1, j + r);
                if (getMean(arr, rowStart, rowEnd, colStart, colEnd) <= t) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
