package Code_2023_7_21;

import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] arrCheck = new boolean[n];

        int diff;
        arr[0] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            diff = arr[i] - arr[i - 1];
            diff = diff > 0 ? diff : -diff;
            if (diff < n) {
                arrCheck[diff] = true;
            }
        }

        boolean isJolly = true;
        for (int i = 1; i < n; i++) {
            if (!arrCheck[i]) {
                isJolly = false;
                break;
            }
        }

        if (isJolly) {
            System.out.println("Jolly");
        } else {
            System.out.println("Not jolly");
        }

        sc.close();

    }
}
