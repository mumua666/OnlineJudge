import java.util.Scanner;

public class Code2023_05_02 {

    static int n, d;
    static int[][] matrixQ;
    static int[][] matrixK;
    static int[][] matrixV;
    static int[] vector;
    static long[][] result;

    public static void readData() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextInt();

        matrixQ = new int[n][d];
        matrixK = new int[n][d];
        matrixV = new int[n][d];
        vector = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                matrixQ[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                matrixK[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                matrixV[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }

        sc.close();
    }

    public static long[][] transfer(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        long[][] matrixNew = new long[col][row];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                matrixNew[j][i] = matrix[i][j];
            }
        }
        matrix = null;
        return matrixNew;
    }

    public static long[][] product(int[][] matrixLeft, long[][] matrixRight) {
        int row = matrixLeft.length;
        int col = matrixRight[0].length;
        long[][] matrix = new long[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    matrix[i][j] += matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        matrixLeft = null;
        matrixRight = null;
        return matrix;
    }

    public static long[][] product(long[][] matrixLeft, int[][] matrixRight) {
        int row = matrixLeft.length;
        int col = matrixRight[0].length;
        long[][] matrix = new long[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    matrix[i][j] += matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        matrixLeft = null;
        matrixRight = null;
        return matrix;
    }

    public static long[][] dotProduct(int[] vector, long[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            int factor = vector[i];
            for (int j = 0; j < col; j++) {
                matrix[i][j] *= factor;
            }
        }
        return matrix;
    }

    public static void calculate() {
        result = transfer(matrixK);
        matrixK = null;
        result = product(matrixQ, result);
        matrixQ = null;
        result = dotProduct(vector, result);
        vector = null;
        result = product(result, matrixV);
        matrixV = null;
    }

    public static void showResult() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solve() {
        readData();
        calculate();
        showResult();
    }

    public static void main(String[] args) {
        solve();
    }
}
