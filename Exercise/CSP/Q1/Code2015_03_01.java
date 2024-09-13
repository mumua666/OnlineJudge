import java.util.Scanner;

public class Code2015_03_01 {

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int n = sc.nextInt();
    // int m = sc.nextInt();
    // int num = m > n ? m : n;

    // int[][] arr = new int[num][num];

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // arr[i][j] = sc.nextInt();
    // }
    // }

    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < m; j++) {
    // int temp = arr[i][j];
    // arr[i][j] = arr[j][i];
    // arr[j][i] = temp;
    // }
    // }

    // for (int i = 0, j = m - 1; i < j; i++, j--) {
    // for (int k = 0; k < n; k++) {
    // int temp = arr[i][k];
    // arr[i][k] = arr[j][k];
    // arr[j][k] = temp;
    // }
    // }

    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    // sc.close();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[1005][1005];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int j = m - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
