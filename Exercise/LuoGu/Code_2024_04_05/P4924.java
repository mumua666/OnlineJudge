import java.util.Scanner;

public class P4924 {

    public static int[][] deepCopy(int[][] martrix) {
        int[][] copyMatrix = new int[martrix.length][martrix[0].length];
        for (int i = 0; i < martrix.length; i++) {
            for (int j = 0; j < martrix[0].length; j++) {
                copyMatrix[i][j] = martrix[i][j];
            }
        }
        return copyMatrix;
    }

    public static void reverse(int[][] martrix, int x, int y, int len, int direction) {
        int[][] copyMatrix = deepCopy(martrix);
        int size = 2 * len;
        int startX = x - len;
        int startY = y - len;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                martrix[startX + i][startY + j] = direction == 1 ? copyMatrix[startX + j][startY + size - i]
                        : copyMatrix[startX + size - j][startY + i];
            }
        }
    }

    public static void showMatrix(int[][] martrix) {
        int n = martrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(martrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = num++;
            }
        }
        // showMatrix(matrix);

        while (m-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int len = sc.nextInt();
            int direction = sc.nextInt();
            reverse(matrix, x - 1, y - 1, len, direction);
            // showMatrix(matrix);
        }

        showMatrix(matrix);

        sc.close();
    }
}
