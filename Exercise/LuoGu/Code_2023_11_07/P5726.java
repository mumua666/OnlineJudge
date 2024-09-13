import java.util.Scanner;

public class P5726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            minNum = minNum < arr[i] ? minNum : arr[i];
            maxNum = maxNum > arr[i] ? maxNum : arr[i];
        }

        System.out.printf("%.2f\n", (sum - maxNum - minNum) * 1.0 / (n - 2));

        sc.close();
    }
}
