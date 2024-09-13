import java.util.Scanner;

public class Code2018_09_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arrNew = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arrNew[i] = (arr[i] + arr[i + 1]) / 2;
            } else if (i == n - 1) {
                arrNew[i] = (arr[i - 1] + arr[i]) / 2;
            } else {
                arrNew[i] = (arr[i - 1] + arr[i] + arr[i + 1]) / 3;
            }

            System.out.print(arrNew[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
