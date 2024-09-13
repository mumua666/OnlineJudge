import java.util.Scanner;

public class Code2014_12_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        int t = 0, i = 0, j = 0;
        while (t <= 2 * n - 2) {
            if (t % 2 == 0) {
                i = Math.min(n - 1, t);
                j = t - i;
                System.out.printf("%d ", nums[i][j]);
                while (i-- > 0 && ++j < n) {
                    System.out.printf("%d ", nums[i][j]);
                }
            } else {
                j = Math.min(n - 1, t);
                i = t - j;
                System.out.printf("%d ", nums[i][j]);
                while (++i < n && j-- > 0) {
                    System.out.printf("%d ", nums[i][j]);
                }
            }
            t++;
        }
        System.out.println();

        sc.close();
    }
}
