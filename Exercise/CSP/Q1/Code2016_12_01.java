import java.util.Scanner;

public class Code2016_12_01 {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int n = sc.nextInt();
    // int[] arr = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }

    // if (n == 1) {
    // System.out.println(arr[0]);
    // } else {
    // boolean isFind = false;
    // for (int i = 0, j = n - 1; i <= j;) {
    // if (arr[i] == arr[j]) {
    // System.out.println(arr[i]);
    // isFind = true;
    // break;
    // } else {
    // int left = arr[i], right = arr[j];
    // for (int k = i + 1; k <= j; k++) {
    // if (arr[k] == left) {
    // i++;
    // }
    // }
    // for (int k = j - 1; k >= i; k--) {
    // if (arr[k] == right) {
    // j--;
    // }
    // }
    // }
    // }

    // if (!isFind) {
    // System.out.println(-1);
    // }
    // }

    // sc.close();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int gtNum = 0, ltNum = 0;
        boolean isFind = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    gtNum++;
                }
                if (arr[j] < arr[i]) {
                    ltNum++;
                }
            }
            if (gtNum == ltNum) {
                System.out.println(arr[i]);
                isFind = true;
                break;
            }
            gtNum = 0;
            ltNum = 0;
        }

        if (!isFind) {
            System.out.println(-1);
        }

        sc.close();
    }

}
