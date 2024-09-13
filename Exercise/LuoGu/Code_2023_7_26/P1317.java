package Code_2023_7_26;

import java.util.Scanner;

public class P1317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isStart = false;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1] && !isStart) {
                isStart = true;
            } else if (arr[i] > arr[i - 1] && isStart) {
                isStart = false;
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}