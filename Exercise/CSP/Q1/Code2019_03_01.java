import java.util.Scanner;

public class Code2019_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = arr[n - 1];
        if (min > max) {
            min ^= max;
            max ^= min;
            min ^= max;
        }

        boolean isFind = false;
        int i, j;
        for (i = 0, j = n - 1; i <= j; i++, j--) {
            if (arr[i] == arr[j]) {
                isFind = true;
                System.out.printf("%d %d %d\n", max, arr[i], min);
                break;
            }
        }
        if (!isFind) {
            boolean checkInteger = 2 * ((arr[i] + arr[j]) / 2) == arr[i] + arr[j];
            if (checkInteger) {
                System.out.printf("%d %d %d\n", max, (arr[i] + arr[j]) / 2, min);
            } else {
                System.out.printf("%d %.1f %d\n", max, (arr[i] + arr[j]) / 2.0, min);
            }
        }

        sc.close();
    }
}
