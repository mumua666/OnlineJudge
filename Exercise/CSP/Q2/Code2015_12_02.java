import java.util.Scanner;

public class Code2015_12_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] nums = new int[n][m];
        boolean[][] isRemove = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (nums[i][j] == nums[i][j - 1] && nums[i][j] == nums[i][j + 1]) {
                    isRemove[i][j - 1] = true;
                    isRemove[i][j] = true;
                    isRemove[i][j + 1] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (nums[j][i] == nums[j - 1][i] && nums[j + 1][i] == nums[j][i]) {
                    isRemove[j - 1][i] = true;
                    isRemove[j][i] = true;
                    isRemove[j + 1][i] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isRemove[i][j]) {
                    nums[i][j] = 0;
                }
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
